import chisel3._
import chisel3.util._
import chisel3.experimental.BaseModule

trait Module10 {
  def ini: UInt
  def in2: UInt
  def out: UInt
}

class Add extends RawModule with Module10 {
  val ini = Input(UInt(8.W))
  val in2 = Input(UInt(8.W))
  val out = Output(UInt(8.W))
  out := ini + in2
}



class Sub extends RawModule with Module10 {
  val ini = Input(UInt(8.W))
  val in2 = Input(UInt(8.W))
  val out = Output(UInt(8.W))
  out := ini - in2
}


class Top[T <: BaseModule with Module10](genT: => T) extends Module {
  val io = IO(new Bundle {
    val in1 = Input(UInt(8.W))
    val in2 = Input(UInt(8.W))
    val out = Output(UInt(8.W))
  })

  val subModule = Module(genT)
  io.out := subModule.out
  subModule.ini := io.in1
  subModule.in2 := io.in2

  chisel3.stage.ChiselStage.emitVerilog(new Top(new Add))
  chisel3.stage.ChiselStage.emitVerilog(new Top(new Sub))
}

object Main {
  def main(args: Array[String]): Unit = {

    val topModule = new Top(new Add)
    println("Verilog generated for Add module:")
    chisel3.stage.ChiselStage.emitVerilog(topModule)

    val topModuleSub = new Top(new Sub)
    println("Verilog generated for Sub module:")
    chisel3.stage.ChiselStage.emitVerilog(topModuleSub)
  }
}
