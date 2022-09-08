// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(a:Int, b:Int) = a + b

fun g(s1:String, s2:String) = s1 + s2

fun h() = println("h()")

fun main() {
    val f: Int = f(1,2)
    val g: String = g("Hello","Kotlin")
    val h: Unit = h()
    println("Int")
    println("String")
    println("Unit")
  }