package oop_00000105595_FabianHariyanto.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Pedang Dominasi", 80, ItemRarity.EPIC)
            return Weapon(epicItem, 200)
        }
    }
}