package oop_00000130562_MuhammadFaathinNaufal.week01
fun main()
{
    val judul = "GTA VI"
    val price = 1200000
    val finalPrice = price - diskon(price)
    val userNote: String? = null
    printReceipt(judul , finalPrice = finalPrice, note = userNote)
}
fun diskon(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(judul: String, finalPrice: Int, note: String?) {
    println(">>>> Struk Pembelian <<<<<")
    println("Game: $judul")
    println("Harga Akhir: Rp $finalPrice")
    println("note: ${note ?: "tak da notes"}")

}

