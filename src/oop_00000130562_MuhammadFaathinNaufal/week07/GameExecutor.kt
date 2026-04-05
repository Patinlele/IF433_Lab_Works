package oop_00000130562_MuhammadFaathinNaufal.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Monster muncul: ${event.monsterName}! Bersiaplah untuk bertarung!")
        is BattleState.LootDropped -> println("Loot didapat: ${event.item.name} (Damage: ${event.item.damage}, Rarity: ${event.item.rarity})")
        is BattleState.GameOver -> println("Game Over! Alasan: ${event.reason}")
        BattleState.SafeZone -> println("Kamu berada di Safe Zone. Tidak ada ancaman.")
    }
}