// Functions/MultiplyByFour.kt

//单行函数的返回值可以省略(可以推断)
//双行函数的返回值只有当为Unit空的时候才可以省略
fun multiplyByFour(x: Int) = x * 4

fun main() {
  val result: Int = multiplyByFour(5)
  println(result)
}
/* Output:
20
*/