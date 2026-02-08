package oop_00000105595_FabianHariyanto.week01

fun main() {
    val gameTitle = "Valorant"
    val price = 300000

    val finalPrice = calculateDiscount(price)
}

fun calculateDiscount(price: Int) =
    if (price > 200000) price * 80 / 100
    else price * 90 / 100