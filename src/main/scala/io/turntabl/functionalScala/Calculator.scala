package io.turntabl.functionalScala

object Calculator {
  val calculate = (i: String) => ((x: Int, y: Int) => i match {
    case "add" => x + y
    case "subtract" => x - y
  })
}

