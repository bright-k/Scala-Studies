package com.samnight.function

object arrayfn {
  def printArray[K](array:Array[K]) = println(array.mkString("Array(" , ", " , ")"));

  def run(): Unit =
  {
    val array1 = Array(1,2,3);
    print("1 : ")
    printArray(array1);

    val array2 = Array("a", 2, true);
    print("2 : ")
    printArray(array2);

    val itemAtIndex0 = array1(0);
    array1(0) = 4;
    print("3 : ");
    printArray(array1);

    val concatenated = "Front concat" +: (array1 ++ array2) :+ "Backward";
    print("4")
    printArray(concatenated);

    array2.indexOf("a")

    val diffArray = Array(1,2,3,4).diff(Array(2,3))
    print("⑤ Array(1,2,3,4).diff(Array(2,3))의 결과: ")
    printArray(diffArray)

    val personArray = Array(("솔라",1), ("문별",2), ("휘인",3))
    def findByName(name:String) = personArray.find(_._1 == name).getOrElse(("화사",4))
    val findSolar = findByName("솔라")  // 값("솔라",1)을 찾아서 넘겨줌
    val findSun = findByName("태양")  // 값이 없으므로 getOrElse에 있는 값("화사",4)이 들어감

    println(findSolar)
    println(findSun)
  }
}
