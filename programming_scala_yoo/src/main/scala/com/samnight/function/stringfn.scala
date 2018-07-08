package com.samnight.function

object stringfn {
  def run(): Unit =
  {
    val reverse = "Scala".reverse;
    println(s"$reverse");

    val cap = "scala".capitalize;
    println(s" $cap");

    val multi = " Scala! " * 7;
    println(s" $multi");

    val int = "123".toInt;
    println(s" ${int + 123}  ");
  }

}
