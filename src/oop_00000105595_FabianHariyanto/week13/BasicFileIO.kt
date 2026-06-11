package oop_00000105595_FabianHariyanto.week13

import java.io.File

fun writeToFile(fileName: String, content: String) {
    val file = File(fileName)
    file.writeText(content)
    println("Berhasil menulis ke $fileName")
}