// IfExpressions/Task1.kt
package ifExpressionsExercise1

//if else 是可以带返回值的。
//只有一行的话，大括号可以省略
//函数只有一行的话大括号可以省略，return用=代替
//if else 算一行
fun checkSign(number: Int): String =
  if (number > 0)
    "positive"
  else if (number < 0)
    "negative"
  else
    "zero"



fun main() {
  println(checkSign(-19))  // negative
}