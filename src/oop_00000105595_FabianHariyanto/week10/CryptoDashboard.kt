package oop_00000105595_FabianHariyanto.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    println("=== CRYPTO DASHBOARD ===")

    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status Respons API: ${response.status}")
    println("\n--- Portofolio Koin ---")
    response.data.forEach { coin ->
        println("- Koin: ${coin.name}, Saldo: ${coin.balance}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-991", 0.5))
    txRepo.add(Transaction("TX-992", 2.0))
}