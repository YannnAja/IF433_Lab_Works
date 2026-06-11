package oop_00000105595_FabianHariyanto.week13

import java.io.File

object TradeFileHandler {
    private val file = File("trades.csv")

    fun initHeader() {
        if (!file.exists()) {
            file.writeText("Pair,Type,Price,PnL\n")
        }
    }
}
