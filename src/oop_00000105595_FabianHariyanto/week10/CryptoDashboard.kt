package oop_00000105595_FabianHariyanto.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    println("=== CRYPTO DASHBOARD ===")

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 500.0))
}