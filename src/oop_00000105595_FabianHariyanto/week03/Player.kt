package oop_00000105595_FabianHariyanto.week03

class Player(val username: String) {
    private var xp: Int = 0

    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = this.level
            xp += amount
            val newLevel = this.level

            if (newLevel > oldLevel) {
                println("Level Up! Selamat $username naik ke level $newLevel")
            }
        }
    }
}