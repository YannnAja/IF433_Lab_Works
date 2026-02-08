package oop_00000105595_FabianHariyanto.week01

fun main() {
    val name: String = "Joy"
    val score: Int = 80
    // Concatenation gaya lama
    println("Nama:$name, Nilai: $score")

    // Tambahkan di bawah println
    val grade when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else ->"D"
    }
    println("Grade kamu: $grade")

    println("Status: ${calculateStatus (score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"
