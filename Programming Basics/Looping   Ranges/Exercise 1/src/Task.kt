// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
  var rst = 1L
  for(index in 1..n) {
    rst *= index
  }
  return rst
}

fun main() {
  println(factorial(10))  // 3628800
}