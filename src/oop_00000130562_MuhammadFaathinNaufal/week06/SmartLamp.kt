class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnon() { println("Lampu $name menyala.") }
    override fun turnoff() { println("Lampu $name mati.") }
}