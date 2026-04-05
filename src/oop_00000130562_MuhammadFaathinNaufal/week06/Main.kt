package oop_00000130562_MuhammadFaathinNaufal.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    // Testing Guided
    val myWatch = Smartwatch()
    myWatch.showTime()
    val myPhone = Smartphone()
    myPhone.turnon()

    val pay1 = Gopay()
    val pay2 = CreditCard()
    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)


}