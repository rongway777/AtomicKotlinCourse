// IfExpressions/Task3.kt
package ifExpressionsExercise3

// return 可以省略，去掉大括号加=号
fun findMax(first: Int, second: Int): Int {
  return if(first > second) first else second
}


fun main() {
  println(findMax(-1, 4))  // 4
}