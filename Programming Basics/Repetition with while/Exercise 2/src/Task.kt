// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var index = 0
  var sum = 0
  while(index <= number){
    sum += index++
  }
  return sum
}

fun main() {
  println(sum(10))  // 55
}