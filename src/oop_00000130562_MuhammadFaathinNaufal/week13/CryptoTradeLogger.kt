package oop_00000130562_MuhammadFaathinNaufal.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    val parts = line.split(",")
    return TradeRecord(parts[0].trim().toInt(), parts[1].trim(), parts[2].trim(), parts[3].trim().toDouble(), parts[4].trim().toDouble())
}

