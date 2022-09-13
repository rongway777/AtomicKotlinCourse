// Constructors/VisibleArgs.kt

class MutableNameAlien(var name: String)

class FixedNameAlien(val name: String)

fun main() {
  val alien1 =
    MutableNameAlien("Reverse Giraffe")
  val alien2 =
    FixedNameAlien("Krombopulos Michael")

  alien1.name = "Parasite"
  // Can't do this:
  // alien2.name = "Parasite"

  println("alien1 name = ${alien1.name}")
  println("alien2 name = ${alien2.name}")
}