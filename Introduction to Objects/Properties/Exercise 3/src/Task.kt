// Properties/Task3.kt
package propertiesExercise3

class Robot {
  var x = 0
  var y = 0

  val bound = 100

  fun right(steps: Int) {
    x += steps
    x = fix(x)
  }

  fun left(steps: Int) {
    x -= steps
    x = fix(x)
  }

  fun down(steps: Int) {
    y += steps % 100
    y = fix(y)
  }

  fun up(steps: Int) {
    y -= steps
    y = fix(y)
  }

  fun getLocation(): String = "($x, $y)"

  private fun fix(i: Int): Int{
    //130 360    30  60  right
    //-30 -140   -30  -40 ==> 70 60
    var rst = i % 100
    return if(rst > 0){
      rst
    }else{
      rst + bound
    }
  }
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.up(1)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/