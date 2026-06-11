package oop_00000105595_FabianHariyanto.week13

import java.io.File

fun main() {
    println("=== CRYPTO TRADE LOGGER ===")
    TradeFileHandler.initHeader()

    val sessionTrades = listOf(
        TradeRecord("BTCUSDT", "LONG", 65000.0, 150.5),
        TradeRecord("ETHUSDT", "SHORT", 3500.0, -50.2)
    )

    sessionTrades.forEach { TradeFileHandler.saveTrade(it) }
    println("Berhasil menyimpan ${sessionTrades.size} trade sehat ke CSV.")

    File("trades.csv").appendText("DOGEUSDT,LONG,CORRUPTED_PRICE,100\n")
    println("Simulasi data DOGE korup dimasukkan ke CSV.")

    println("\n--- MEMBACA DATA DARI CSV ---")
    val loadedData = TradeFileHandler.loadTrades()

    println("Data yang berhasil dipulihkan:")
    loadedData.forEach { println(it) }

    val totalPnl = loadedData.sumOf { it.pnl }

    println("==== TOTAL PnL BERSIH: $$totalPnl ====")
}