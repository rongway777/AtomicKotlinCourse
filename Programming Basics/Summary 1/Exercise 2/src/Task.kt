// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var rst = ""
  for(i in 0..s.lastIndex step 2) {
    rst += s[i]
  }
  return rst
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/