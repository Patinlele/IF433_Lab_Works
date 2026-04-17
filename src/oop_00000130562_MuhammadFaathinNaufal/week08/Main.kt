package oop_00000130562_MuhammadFaathinNaufal.week08

fun main(){
    println("=== test safe calls & Elvis ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

}