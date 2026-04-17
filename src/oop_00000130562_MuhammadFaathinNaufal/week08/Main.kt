package oop_00000130562_MuhammadFaathinNaufal.week08

fun main(){
    println("=== test safe calls & Elvis ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== tes let block ====")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "transaksi valid. harga: RP$price, Pajak: Rp$tax"
    } ?: "transaksi invalid: harga not set"
    println(receipt)

    println("\n=== tes safe casting ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )
    for (item in mixedData) {
        val text = item as? String

        text?.let {
            println("Ditemukan text: ${it.uppercase()}")
        }
    }
}