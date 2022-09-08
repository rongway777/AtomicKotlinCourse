// ExpressionsStatements/UnitReturnType.kt

//Kotlin的空是个对象 Unit
fun unitFun() = Unit

fun main() {
  println(unitFun())
  val u1: Unit = println(42)
  println(u1)
  val u2 = println(0) // Type inference
  println(u2)

  val obj: MyObject = MyObject
  println("name = $obj")
}

/* Output:
kotlin.Unit
42
kotlin.Unit
0
kotlin.Unit
*/


object MyObject {
  override fun toString(): String {
    return "Class: myObject"
  }
}

//这里我推测，object对象，类名与对象名一样(全局只有一个对象 )
//返回类型是Class类型
//Uint既是一个Class也是一个Object
fun f():MyObject {
  println("in function f()")
  var sum = 47
  return MyObject
}

