// CreatingClasses/Task3.kt
package creatingClassesExercise3

class Robot{
    fun up(step: Int) = println("Up $step steps")
    fun down(step: Int) = println("Down $step steps")
    fun left(step: Int) = println("Left $step steps")
    fun right(step: Int) = println("Right $step steps")
}

fun main() {
  val robot = Robot()
  robot.up(11)
}
/* Expected output:
Up 11 steps
*/