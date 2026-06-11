package oop_00000105595_FabianHariyanto.week11

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it") // 'it' merujuk pada name
        it.length
    }
    println("Panjang nama: $length")
}