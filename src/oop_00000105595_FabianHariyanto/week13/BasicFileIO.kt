package oop_00000105595_FabianHariyanto.week13

import java.io.File

fun writeToFile(fileName: String, content: String) {
    val file = File(fileName)
    file.writeText(content)
    println("Berhasil menulis ke $fileName")
}

fun readFromFile(fileName: String) {
    val file = File(fileName)
    if (file.exists()) {
        println("Isi file $fileName:\n${file.readText()}")
    } else {
        println("File $fileName tidak ditemukan.")
    }
}

fun appendToFile(fileName: String, content: String) {
    val file = File(fileName)
    file.appendText(content)
}

fun main() {
    println("=== TEST FILE I/O ===")
    val testFile = "test_io.txt"

    writeToFile(testFile, "Hello File I/O!\n")
    appendToFile(testFile, "Baris kedua menggunakan append.\n")
    robustAppend(testFile, "Baris ketiga menggunakan bufferedWriter dan use.\n")

    println("\n--- Membaca seluruh isi ---")
    readFromFile(testFile)

    println("--- Membaca per baris ---")
    readLinesWithUse(testFile)
}