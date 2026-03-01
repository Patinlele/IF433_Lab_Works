package oop_00000130562_MuhammadFaathinNaufal.week04

open class Vehicle(val brand: Stringg) {
    var speed: Int = 0

    open fun accelerate(){
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk(){
        println( "totot wukwuk !")
    }
}