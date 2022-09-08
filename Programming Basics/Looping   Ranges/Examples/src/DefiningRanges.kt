// LoopingAndRanges/DefiningRanges.kt

//Range是个范围类型
fun main() {
  val range1: IntRange = 1..10         // [0,10]
  val range2 = 0 until 10    // [0,10)
  println("range1 = $range1")
  for(i in range1){
    println(i)
  }
  println("range2 = $range2")
  for(i in range2){
    println(i)
  }
}
/* Output:
1..10
0..9
*/