package oop_00000105595_FabianHariyanto.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n--- TUGAS 1: WEAPON ---")
    val sword = Weapon("Rapier")
    sword.damage = -50
    sword.damage = 9999
    println("Senjata: ${sword.name}, Damage: ${sword.damage}, Tier: ${sword.tier}")
}