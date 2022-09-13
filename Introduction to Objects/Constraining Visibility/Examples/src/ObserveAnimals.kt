// Visibility/ObserveAnimals.kt

//不能访问别的文件的private[属性]+[方法]+[类]
fun main() {
  // Can't access private members
  // declared in another file.
  // Class is private: <==
  // val rabbit = Animal("Rabbit")
  // Function is private: <==
  // recordAnimal(rabbit)
  // Property is private: <==
  // index++

  recordAnimals()
  recordAnimalsCount()
}
/* Output:
Animal #0: Tiger
Animal #1: Antelope
2 animals are here!
*/