package oop_00000130562_MuhammadFaathinNaufal.week03

fun main() {
    val e = Employee("Jokowi")
    println("ERR test")
    e.salary = 50000000
    e.salary = -1000
    println("GAji: ${e.salary}")

    e.increasePerformance()
//
    println("Pajak yang harus dibayar: ${e.tax}")
//

//yang weapon
    val pedang = Weapon("Pedang Excalibur")

    println("Set damage ke -50...")
    pedang.damage = -50


    println("Set damage ke 9999...")
    pedang.damage = 9999

    // Print Tier-nya
    println("Senjata: ${pedang.name}")
    println("Tier: ${pedang.tier}")
//yang ini playerr
    val player1 = Player("GamerJagoan")
    println("Menambahkan 50 XP...")
    player1.addXp(50)
    println("Level saat ini: ${player1.level}")

    println("\nMenambahkan 60 XP...")
    player1.addXp(60)
    println("Level saat ini: ${player1.level}")
}
