// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var rst = ""
  for(c in 'a'..'z'){
    rst += c
  }
  return rst
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}