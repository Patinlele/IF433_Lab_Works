package oop_00000130562_MuhammadFaathinNaufal.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("=== JADWAL MAKAN 1: PAGI ===")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Error Mekanik: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error Logistik: ${e.message}")
    } catch (e: Exception) {
        println("General Error: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }
    println("\n=== JADWAL MAKAN 2: SORE ===")
    val result = runCatching {
        dispenseKibble(30, 1000, false)
    }
}