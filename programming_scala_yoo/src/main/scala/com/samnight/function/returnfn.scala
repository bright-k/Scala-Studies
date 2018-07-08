package com.samnight.function

object returnfn {

  // classic return
  def add(x:Int, y:Int):Int={
    return x+y;
  }

  val add2 = (x:Int, y:Int) => x + y
  val add3:(Int,Int)=>Int = _ + _
  val add4 = (_ + _):(Int,Int)=>Int

  // no return;
  def addWithoutReturn(x:Int, y:Int)={
    x+y;
  }

  // one line
  def addWithoutBlock(x:Int, y:Int) = x+y;

  // Anonymous Function
  def doWithOneAndTwo(f:(Int, Int) => Int)={
    f(1,2);
  }
}
