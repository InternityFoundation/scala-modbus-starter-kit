package in.internity.modbus

import java.net.InetAddress

import net.wimpi.modbus.io.ModbusTCPTransaction
import net.wimpi.modbus.msg.{ModbusRequest, ReadMultipleRegistersRequest, ReadMultipleRegistersResponse}
import net.wimpi.modbus.net.TCPMasterConnection

import scala.util.Try

/**
  * @author Shivansh <shiv4nsh@gmail.com>
  * @since 13/1/18
  */
class ModbusMasterImpl {

  import in.internity.config.AppConfig._

  private val host = InetAddress.getByName(hostName)
  private val connection = new TCPMasterConnection(host)
  connection.setPort(port)
  connection.setTimeout(connectionTimeout)
  connection.connect()

  val req = new ReadMultipleRegistersRequest(startingRegister, numberOfMeasurements)
  req.setUnitID(slaveId)
  private val transaction = new ModbusTCPTransaction(connection)
  transaction.setRequest(req.asInstanceOf[ModbusRequest])

  def run() = {
    (1 to numberOfPolls).toList.map { a =>
      val values = Try {
        transaction.execute()
        val res = transaction.getResponse.asInstanceOf[ReadMultipleRegistersResponse]
        val arrayOfRegisters = res.getRegisters
        arrayOfRegisters.map(_.getValue)
      }.toOption.toList.flatten
      Thread.sleep(pollingTime)
      val registers = (startingRegister to (startingRegister + numberOfMeasurements)).toList
      val combined = registers.zip(values).toMap[Int, Int]
      println(s"Values Recieved From Modbus:$combined")
      values
    }
  }
}
