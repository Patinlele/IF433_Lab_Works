package oop_00000130562_MuhammadFaathinNaufal.week03

class Weapon(val name: String, initialDamage: Int) {

    var damage: Int = 0
        set(nilai) {
            if (nilai < 0) {
                println("Peringatan: Damage tidak boleh negatif! Nilai field tetap $field.")
            } else if (nilai > 1000) {
                field = 1000
                println("Peringatan: Overpowered! Damage dipaksa menjadi 1000.")
            } else {
                field = nilai
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }


    init {
        damage = initialDamage
    }
}
