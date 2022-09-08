// LoopingAndRanges/IterateOverString.kt

fun main() {
  for (ch in "Jnskhm ") {
    print(ch + 1)
  }

  println()

  val str = "Jnskhm "
  for(i in 0..str.lastIndex){
    print(str[i])
  }
}
/* Output:
Kotlin!
*/