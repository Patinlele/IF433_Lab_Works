package oop_00000130562_MuhammadFaathinNaufal.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100 // Default HP 100
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        if (hp < 0) hp = 0 // Validasi HP min 0
        println("$name terkena $damage damage. Sisa HP: $hp")
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}