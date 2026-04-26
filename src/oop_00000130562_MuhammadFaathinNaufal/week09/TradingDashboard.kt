package oop_00000130562_MuhammadFaathinNaufal.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, 120.0, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 10, 8.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, -12.0, "CLOSED"),
        TradeLog("BNBUSDT", "SHORT", 15, 0.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}