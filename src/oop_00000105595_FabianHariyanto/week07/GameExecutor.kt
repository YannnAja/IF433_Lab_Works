package oop_00000105595_FabianHariyanto.week07

class GameExecutor {
}

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> println("[EVENT] Kamu berada di Safe Zone. HP pulih.")
        is BattleState.MonsterEncounter -> println("[EVENT] Awas! Kamu bertemu dengan ${event.monsterName}!")
        is BattleState.LootDropped -> {
            val (itemName, itemDamage, itemRarity) = event.item
            println("[EVENT] Hore! Mendapatkan Loot: $itemName (Damage: $itemDamage, Rarity: $itemRarity)")
        }
        is BattleState.GameOver -> println("[EVENT] GAME OVER! Karena ${event.reason}")
    }
}