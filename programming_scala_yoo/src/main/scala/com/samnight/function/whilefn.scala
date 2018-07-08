package com.samnight.function

object whilefn {
  def run(): Unit =
  {
    var i, sum = 0;
    while ( i < 10 )
      {
        sum += i;
        i+=1;
      }
    println(s"1 loop : $sum");

    sum = 0;
    for(i <- 0 until 10)
    {
      sum += i
    }
    println(s"2 while(untill) : $sum");


    sum = (0 until 10).sum
    println(s"3 while(one line) : $sum");
  }

  def run2(): Unit ={
    for( a <- 1 to 3){
      for( b <- 10 to 12){
        println(a,b);
      }
    }

    println("Scala!")

    for( a<- 1 to 3; b <- 10 to 12)
    {
        println(a,b);
    }

  }
}
