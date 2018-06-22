package com.eastbright.study

/**
  * Created by H on 2018. 6. 22.
  */
object Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map((s:String) => s.toUpperCase())
  }

  def main(args: Array[String]) = {
    println(upper("Hello", "world", "1").foreach(printf("%s ", _)))
  }
}
