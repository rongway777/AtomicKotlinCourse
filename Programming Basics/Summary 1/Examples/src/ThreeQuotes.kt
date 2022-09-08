// Summary1/ThreeQuotes.kt

//这个不错啊
fun json(q: String, a: Int) = """{
  "question" : "$q",
  "answer" : $a
}"""

fun generateJson(question: String, answer: String) = """{
    "question" : "$question",
    "answer" : "$answer"
}"""
fun main() {
  //println(json("The Ultimate", 42))
  println(generateJson("how to play videos","open video tabs"))
}
/* Output:
{
  "question" : "The Ultimate",
  "answer" : 42
}
*/