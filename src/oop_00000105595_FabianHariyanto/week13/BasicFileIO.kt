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