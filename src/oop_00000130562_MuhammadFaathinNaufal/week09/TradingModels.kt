package oop_00000130562_MuhammadFaathinNaufal.week09

class TradingModels {
    data class TradeLog(
        val pair: String,
        val position: String,
        val leverage: Int,
        val roe: Double,
        val status: String
    )
}