package oop_00000130562_MuhammadFaathinNaufal.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")
    println(checkSize(area)) // Panggil di dalam println
}

fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"
}