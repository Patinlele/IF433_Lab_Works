package oop_00000130562_MuhammadFaathinNaufal.week10

fun Main() {
    println("=== TEST GENERIC CLASS===")
    val intBox = Box(100)
    val stringBox = Box("Generics in kotlin")
    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox : ${stringBox.value}")

}
