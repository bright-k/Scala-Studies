package com.samnight.function

object tuplefn {
  def run(): Unit ={
    val t1 = new Tuple3(1, "hello", true);
    val t2 = (1, "hello", true);

    println(s"t1 : ${t1}");
    println(s"t2 : ${t2}");

    var numbers = (1,2,3,4);
    val sum = numbers._1 + numbers._2 + numbers._3 + numbers._4;
    println(sum);

    var (x, y, z, c, python, java) = (1, 2, 3, true, false, "no!")
    println(x, y, z, c, python, java)
  }

  def swap(x:String, y:String) = (y,x);
}
