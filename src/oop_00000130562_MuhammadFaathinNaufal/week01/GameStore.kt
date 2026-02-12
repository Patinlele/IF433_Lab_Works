package oop_00000130562_MuhammadFaathinNaufal.week01
fun main()
{
    val judul = "GTA VI"
    val price = 1200000
    val finalPricve = price - diskon(price)
}
fun diskon(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()
        ;

