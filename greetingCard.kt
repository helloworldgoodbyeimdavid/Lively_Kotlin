fun main() {
  println(birthdayGreeting("Tim", 26))
}    

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, ${name}!"
    val ageGreeting = "You are now ${age} years old!"
    return "${nameGreeting}\n${ageGreeting}"
}