package oop_00000130562_MuhammadFaathinNaufal.week10

fun Main() {
    println("=== TEST GENERIC CLASS===")
    val intBox = Box(100)
    val stringBox = Box("Generics in kotlin")
    println("Isi intBox: ${intBox.value}")
    println("Isi stringBox : ${stringBox.value}")

    println("\n=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 65000)
    println("Asset: ${itemPrice.key}, Harga: ${itemPrice.value} USD")

    println("\n=== TEST GENERIC FUNCTIONS ===")
    printData(3.14)
    val result = processData("Stable Coin")
    println("Hasil proses: $result")

    println("\n=== TEST CONSTRAINTS ===")
    val math = MathBox(10.5, 20)
    println("Terbesar: ${getMax(45, 90)}")

}
