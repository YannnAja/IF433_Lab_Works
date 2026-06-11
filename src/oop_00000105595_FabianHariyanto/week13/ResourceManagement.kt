package oop_00000105595_FabianHariyanto.week13

import java.io.File

fun robustAppend(fileName: String, content: String) {
    File(fileName).bufferedWriter().use { out ->
        out.write(content)
    }
}