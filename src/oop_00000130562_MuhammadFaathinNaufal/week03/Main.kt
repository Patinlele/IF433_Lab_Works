package oop_00000130562_MuhammadFaathinNaufal.week03

fun main() {
    val e = Employee("Jokowi")
    println("ERR test")
    e.salary = 50000000
    e.salary = -1000
    println("GAji: ${e.salary}")

    e.increasePerformance()
//
    println("Pajak yang harus dibayar: ${e.tax}")
//
}