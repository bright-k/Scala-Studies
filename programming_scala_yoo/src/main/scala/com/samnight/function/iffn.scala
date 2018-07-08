package com.samnight.function

object iffn {
  def run(): Unit =
  {
    if(true)
        println("Basic IF");

    if(1 + 1 == 2)
    {
      println("Basc IF2");
    }else
    {
      println("Base Else2");
    }

    val likeEggs = false;

    // Expression
    val breakfast =
      if (likeEggs) "Egg"
      else "Apple";

    println(s"Breakfast is $breakfast eat!");

  }
}
