package oop_00000130562_MuhammadFaathinNaufal.week04

open class Employee(val name: String, val baseSalary: Int) { // [cite: 80, 81]

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt() // Mengembalikan nilai 10% dari baseSalary [cite: 83]
    }
}