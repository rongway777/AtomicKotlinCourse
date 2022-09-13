// Constructors/Task1.kt
package constructorsExercise1

class Floating(val d: Double){
  override fun toString(): String {
    return d.toString()
  }
}

fun main() {
  println(Floating(3.1415926))
}