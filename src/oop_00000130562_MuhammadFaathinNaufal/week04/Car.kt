package oop_00000130562_MuhammadFaathinNaufal.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) { // [cite: 35]

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.") // [cite: 38]
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!") // [cite: 47]
    }

    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik Parent [cite: 54]
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.") // [cite: 55]
    }
}