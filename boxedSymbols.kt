import java.util.Locale
fun printCollection(string: Collection<String>) {
    for (s in string) println("""                                 ,,,,,
                                 |$s|
                                 '''''""")
    println()
}

fun main() {
    val symbols = listOf(" @ "," # ", " $ ", " _ ", " & ", " - ", " + ", " ( ", " ) ", " / ", " * ", " ' ", " : ", " ; ", " ! ", " ? ", " , ", " . ", " ~ " , " ` " , " | ", " • ", " √ ", " π ", " ÷ ", " × ", " § ", " ∆ ", " £ ", " ¢ ", " € ", " ¥ ", " ^ ", " ° ", " = ", " { ", " } ", " % ", " © " , " ® ",  " ™ " , " ✓ ", " [ ", " ] ", " < ", " > ") 
    printCollection(symbols)
}
