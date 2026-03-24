package oop_00000105595_FabianHariyanto.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Sukses! Saldo $accountName berhasil dipotong $amount. Sisa saldo: $balance")
        } else {
            println("Gagal! Saldo $accountName tidak cukup untuk membayar $amount.")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("Top Up $amount ke $accountName berhasil! Saldo sekarang: $balance")
    }
}