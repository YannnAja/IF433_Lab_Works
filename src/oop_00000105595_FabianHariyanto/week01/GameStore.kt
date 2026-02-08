package oop_00000105595_FabianHariyanto.week01

fun main() {
    val gameTitle = "Valorant"
    val price = 300000

    val finalPrice = calculateDiscount(price)
    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) =
    if (price > 200000) price * 80 / 100
    else price * 90 / 100

fun printReceipt(title: String, finalPrice: Int) {
    println("Judul Game : $title")
    println("Harga Akhir: Rp$finalPrice")
}