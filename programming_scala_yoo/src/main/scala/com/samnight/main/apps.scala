package com.samnight.main

import com.samnight.function.{foreachFn, sampleFn}

object apps {

  def main(args: Array[String]) = {
    foreachFn.printList;

    foreachFn.sumforeach;

    print(foreachFn.strConcatForeach(List("abc","def","ghi")));
  }
}
