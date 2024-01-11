fun main() {
  println("What is your fav Percussion instument?")

  val favPercussionInstrument: String = readLine()!!.toString()

  when(favPercussionInstrument) { 
      "Afoxe" -> println("That is from Brazil")
      "Agogo" -> println("That is from Africa")
      "Agung" -> println("That is from Indonesia")
      "Angklung" -> println("That is from Indonesia")
      "Babendil" -> println("That is from Babendil")
      "Bak" -> println("That is from Korea")
      "Balafon" -> println("That is from Africa")
      "Bata drum" -> println("Those come from Cuba, Puerto Rico")
      
  }
}
