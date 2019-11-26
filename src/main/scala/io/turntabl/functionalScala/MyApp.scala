package io.turntabl.functionalScala

object MyApp extends App {
    val stringLength = (s: String) => s.length

    val numberOfSpacesInString = (s: String) => stringLength(s) - s.replaceAll(" ", "").length()

    val ApplyToString = (s: String, f: (String => Int)) => f(s)
    println("Length", ApplyToString("Scala is getting Interesting Hopefully", stringLength))
    println("Number of Spaces", ApplyToString("Scala is getting Interesting Hopefully", numberOfSpacesInString))


    val cal = Calculator.calculate("subtract")
    print(cal(2, 3))

}
