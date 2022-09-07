// NumberTypes/UsingLongs.kt

//我猜测是int和long运算前，int会先转换为Long
//int和double运算前，int会先转换为double
//long和double转double
fun main() {
  val i = Int.MAX_VALUE
  println(0L + i + i)              // [1]
  println(1_000_000 * 1_000_000L)  // [2]
}
/* Output:
4294967294
1000000000000
*/