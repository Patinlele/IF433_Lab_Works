package oop_00000130562_MuhammadFaathinNaufal.week01

fun main() {
    val name: String = "John Thor"
    val score: Int = 80

    println("Nama: $name , nilai $score")

    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 ->"C"
        else -> "D"

    }

    println("Grade kamu : $grade")
}
