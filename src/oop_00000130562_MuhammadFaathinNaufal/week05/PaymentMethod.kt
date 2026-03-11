package oop_00000130562_MuhammadFaathinNaufal.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}