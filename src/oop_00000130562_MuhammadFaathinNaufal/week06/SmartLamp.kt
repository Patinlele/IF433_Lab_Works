package oop_00000130562_MuhammadFaathinNaufal.week06

class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() { println("Lampu $name menyala.") }
    override fun turnoff() { println("Lampu $name mati.") }
}