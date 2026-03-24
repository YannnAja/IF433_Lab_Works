package oop_00000105595_FabianHariyanto.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Sukses! Transaksi $amount disetujui untuk kartu $accountName. Terpakai: $usedAmount/$limit")
        } else {
            println("Gagal! Transaksi $amount ditolak. Melebihi limit kartu $accountName.")
        }
    }
}