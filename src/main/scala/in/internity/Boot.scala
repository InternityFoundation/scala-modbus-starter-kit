package in.internity

import in.internity.modbus.ModbusMasterImpl

/**
  * @author Shivansh <shiv4nsh@gmail.com>
  * @since 13/1/18
  */
object Boot extends App {

  new ModbusMasterImpl().run()
}
