package oop_00000105595_FabianHariyanto.week01

fun main() {
    val gameTitle = "Valorant"
    val price = 300000
    val userNote: String? = null

    val finalPrice = calculateDiscount(price)
    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote ?: "Tidak ada Catatan")
}

fun calculateDiscount(price: Int) =
    if (price > 200000) price * 80 / 100
    else price * 90 / 100

fun printReceipt(title: String, finalPrice: Int, note: String) {
    println("Judul Game : $title")
    println("Harga Akhir: Rp$finalPrice")
    println("Catatan    : $note")
}
