fun Fuck(you: String) {
    println("Fuck you $you!")
}

fun fuck(you: String) {
    println("fuck you $you!")
}

fun howManyFucks(a: Int) {
    var b = 0
    while (b < a) {
        println("Fuck you!")
        b += 1
    }
}

val a: Boolean
    get() = false
val b: Boolean
    get() = true
val c: Int
    get() = 420
val f: String
    get() = "Fuck"
val e: Double
    get() = 42.0
val g: Long
    get() = 420420420420
    

fun main() {
    println(a)
    println(b)
    println(c)
    println(f)
    println(e)
    println(g)
    howManyFucks(10)
    Fuck("bob")
    fuck("Justin")
    
    val d = ("David " + 69).also {
    	println(it)
    }
}
