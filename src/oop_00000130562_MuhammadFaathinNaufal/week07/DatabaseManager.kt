package oop_00000130562_MuhammadFaathinNaufal.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected"
        println("database is ready")
    }
}