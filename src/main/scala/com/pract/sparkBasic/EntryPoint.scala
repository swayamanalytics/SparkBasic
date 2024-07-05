package com.pract.sparkBasic
import scala.util._
case class BusiexEx(private val msg: String, private val cause: Throwable = None.orNull) extends Exception(msg, cause)

object EntryPoint extends App {

//  try {
//    val ff = 55 / 5
//    val df = Array[Int](4, 5, 6, 7)
//    println(df(5))
//  } catch {
//    case e: ArithmeticException => println(e)
//    case e: Exception => println(e.getCause)
//  }
  
 def myMethod(s: String): Try[Int] = {
  Try(s.toInt)
}

//var dss=myMethod("30").getOrElse("##")
//println(dss)
//dss=myMethod("hello").getOrElse("##")
//println(dss)

 myMethod("30") match {
   case Success(s) => println(s)
   case Failure(s) => println(s)
 }
 
}