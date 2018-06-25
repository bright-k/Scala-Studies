package com.samnight.function

object sampleFn {

  def captials(str: String): String ={
    var captialMap = Map("US" -> "Washington", "France" -> "Paris", "Japan" -> "Tokyo")
    captialMap(str)
  }
}
