package oop_00000130562_MuhammadFaathinNaufal.week10

class MathBox<T : Number>(val value: T, val value2: T) {
    fun sum(): Double {
        return value .toDouble() + value2.toDouble()
    }
}