package in.internity.config

import com.typesafe.config.ConfigFactory

/**
  * @author Shivansh <shiv4nsh@gmail.com>
  * @since 13/1/18
  */
object AppConfig {

  private val config = ConfigFactory.load()
  val hostName: String = config.getString("modbus.host")
  val port: Int = config.getInt("modbus.port")
  val connectionTimeout: Int = config.getInt("modbus.connectionTimeout")
  val startingRegister: Int = config.getInt("modbus.startingRegister")
  val numberOfMeasurements: Int = config.getInt("modbus.numberOfMeasurements")
  val slaveId: Int = config.getInt("modbus.slaveId")
  val pollingTime: Int = config.getInt("pollingTime")
  val numberOfPolls: Int = config.getInt("numberOfPolls")
}
