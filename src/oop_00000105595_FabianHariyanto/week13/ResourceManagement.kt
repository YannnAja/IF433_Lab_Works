package oop_00000105595_FabianHariyanto.week13

import java.io.File

fun robustAppend(fileName: String, content: String) {
    File(fileName).bufferedWriter().use { out ->
        out.write(content)
    }
}

fun readLinesWithUse(fileName: String) {
    File(fileName).useLines { lines ->
        lines.forEach { println("Line Read: $it") }
    }
}