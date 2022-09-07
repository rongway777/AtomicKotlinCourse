// StringTemplates/TripleQuotes.kt

// 需要加\使用  " ==>\"
//在三引号当中可以正常使用
fun main() {
  val s = "value"
  println("s = \"$s\".")
  println("""s = "$s".""")
}
/* Output:
s = "value".
s = "value".
*/