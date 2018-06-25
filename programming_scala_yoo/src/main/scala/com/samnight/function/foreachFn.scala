package com.samnight.function

object foreachFn {
  def printList={
    val x = List(1,2,3,4);
    x.foreach(println);
  }

  def sumforeach: Unit ={
    var sum = 0;
    val x = List(1,2,3,4);
    x.foreach(sum += _)
    println(sum);
  }

  def strConcatForeach(list: List[String]): String ={
    var str = "";
    list.foreach(str += _ +",");
    str;
  }
}
