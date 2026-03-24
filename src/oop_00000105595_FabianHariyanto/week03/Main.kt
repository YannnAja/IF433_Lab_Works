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

    println("\n--- TUGAS 2: PLAYER ---")
    val p1 = Player("Yann")
    //println(p1.xp) // Akan error private
    println("Level awal ${p1.username}: ${p1.level}")

    p1.addXp(50)
    println("Level setelah tambah 50 XP: ${p1.level}")

    p1.addXp(60)
    println("Level saat ini: ${p1.level}")
}