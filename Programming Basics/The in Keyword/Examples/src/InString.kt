// InKeyword/InString.kt

//String也实现了contains方法  类型是char,不是StringRange
fun main() {
  println('t' in "kotlin")
  println('a' in "kotlin")
}
/* Output:
true
false
*/