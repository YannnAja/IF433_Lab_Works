package oop_00000105595_FabianHariyanto.week08

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()
    println("=== STARTING E-COMMERCE BATCH PROCESS ===")

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)
            product?.let {
                println("Parsed successfully: $it")
                parser.checkout(it)
            } ?: println("Skipping unknown product type.")
        } catch (e: IllegalArgumentException) {
            println("WARNING - Corrupted Data Skipped: ${e.message}")
        }
    }
}