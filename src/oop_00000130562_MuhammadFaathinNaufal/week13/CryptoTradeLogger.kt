package oop_00000130562_MuhammadFaathinNaufal.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].trim().toInt(),
            symbol = parts[1].trim(),
            type = parts[2].trim(),
            margin = parts[3].trim().toDouble(),
            pnl = parts[4].trim().toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { writer.println(it.toCsv()) }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File histori transaksi tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 150.0, 45.5),
        TradeRecord(2, "ETHUSDT", "Short", 100.0, -12.3)
    )
    saveTrades(mockTrades, "crypto_trades.csv")
    File("crypto_trades.csv").appendText("CORRUPT_ID, DOGEUSDT, Hold, XX ,YY\n")

    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n=== REKAPITULASI HISTORI TRANSAKSI ===")
    loadedData.forEach { println(it) }
    println("==== TOTAL PnL BERSIH: $totalPnl ====")
}

