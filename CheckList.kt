fun name(name: String) {
    println(name)
}
fun rightArm(rightArm: String) {
    println("rightArm?  :[${rightArm}]")
}
fun leftArm(leftArm: String) {
	println("leftArm?   :[${leftArm}] ")
}
fun rightLeg(rightLeg: String) {
    println("rightLeg?  :[${rightLeg}]")
}
fun leftLeg(leftLeg: String) {
    println("leftLeg?   :[${leftLeg}]")
}
fun rightFoot(rightFoot: String) {
    println("rightFoot? :[${rightFoot}]")
}
fun leftFoot(leftFoot: String) {
	println("leftFoot?  :[${leftFoot}]")
}
fun rightHand(rightHand: String) {
    println("rightHand? :[${rightHand}]")
}
fun leftHand(leftHand: String) {
	println("leftHand?  :[${leftHand}]")
}
fun head(head: String) {
    println("head?      :[${head}]")
}
fun main( ) {
println("Anyone know the victims name? ")
val name = readLine()!!
println("Dose the victim have a right Arm? ")
var a = readLine()
println("Does the victim have a left Arm? ")
var b = readLine()!!
println("Does the victim have a right Leg? ")
var c = readLine()!!
println("Does the victim have a left Leg? ")
var d = readLine()!!
println("Does the victim have a right Foot? ")
var e = readLine()!!
println("Does the victim have a left Foot? ")
var f = readLine()!!
println("Does the victim have a right Hand? ")
var g = readLine()!!
println("Does the victim have a left Hand? ")
var h = readLine()!!
println("Does the victim have a head? ")
var i = readLine()!!

name(name)
if (a == "yes" || a == "Yes" || a == "Yes") {
	rightArm("✓")
} else if (a == "no" || a == "No" || a == "NO") {
	rightArm("x")

} else {
	println("ERROR")
} 

if (b == "yes" || b == "Yes" || b == "Yes") {
	leftArm("✓")
} else if (b == "no" || b == "No" || b == "NO") {
	leftArm("x")

} else {
	println("ERROR")
}


if (c == "yes" || c == "Yes" || c == "Yes") {
	rightLeg("✓")
} else if (c == "no" || c == "No" || c == "NO") {
	rightLeg("x")

} else {
	println("ERROR")
}

if (d == "yes" || d == "Yes" || d == "Yes") {
	leftLeg("✓")
} else if (d == "no" || d == "No" || d == "NO") {
	leftLeg("x")

} else {
	println("ERROR")
}
 
if (e == "yes" || e == "Yes" || e == "Yes") {
	rightFoot("✓")
} else if (e == "no" || e == "No" || e == "NO") {
	rightFoot("x")

} else {
	println("ERROR")
} 

if (f == "yes" || f == "Yes" || f == "Yes") {
	leftFoot("✓")
} else if (f == "no" || f == "No" || f == "NO") {
	leftFoot("x")

} else {
	println("ERROR")
} 

if (g == "yes" || g == "Yes" || g == "Yes") {
	rightHand("✓")
} else if (g == "no" || g == "No" || g == "NO") {
	rightHand("x")

} else {
	println("ERROR")
} 

if (h == "yes" || h == "Yes" || h == "Yes") {
	leftHand("✓")
} else if (h == "no" || h == "No" || h == "NO") {
	leftHand("x")

} else {
	println("ERROR")
} 

if (i == "yes" || i == "Yes" || i == "Yes") {
	head("✓")
} else if (i == "no" || i == "No" || i == "NO") {
	head("x")

} else {
	println("ERROR")
} 


}
