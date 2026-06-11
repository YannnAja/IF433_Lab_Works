package oop_00000105595_FabianHariyanto.week13

import java.io.File

object TradeFileHandler {
    private val file = File("trades.csv")

    fun initHeader() {
        if (!file.exists()) {
            file.writeText("Pair,Type,Price,PnL\n")
        }
    }

    fun saveTrade(trade: TradeRecord) {
        file.appendText("${trade.pair},${trade.type},${trade.price},${trade.pnl}\n")
    }

    fun loadTrades(): List<TradeRecord> {
        if (!file.exists()) return emptyList()

        return file.useLines { lines ->
            lines.drop(1)
                .mapNotNull { line ->
                    try {
                        val parts = line.split(",")
                        TradeRecord(parts[0], parts[1], parts[2].toDouble(), parts[3].toDouble())
                    } catch (e: Exception) {
                        println("WARNING: Baris korup dilewati -> $line")
                        null
                    }
                }.toList()
        }
    }
}
