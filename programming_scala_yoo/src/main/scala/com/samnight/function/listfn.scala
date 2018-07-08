package com.samnight.function

object listfn {
  def run(): Unit =
  {
    val list = List("a", 1, true)

    val firstItem = list(0)

    println(s"① $firstItem")


    val diffList = List(1,2,3,4) diff List(2,3)
    println(s"③ $diffList")

    val personList = List(("솔라",1), ("문별",2), ("휘인",3))
    def findByName(name:String) = personList.find(_._1 == name).getOrElse(("화사",4))
    val findSolar = findByName("솔라")
    val findSun = findByName("태양")
    println(s"④ ${findSolar}, ${findSun}")
  }
}
