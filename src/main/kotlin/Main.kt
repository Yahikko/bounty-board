const val HERO_NAME = "Madrigal"
var playerLevel = 5

fun main() {

    println("The hero announces her presence to the world.")
    println(HERO_NAME)
    println(playerLevel)

    readBountyBoard()

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel++
    println(playerLevel)
    readBountyBoard()

    `**~ prolly not a good idea!~**`()
}

private fun  `**~ prolly not a good idea!~**`() {
    println("Reversed quotation marks in Kotlin")
    /*
    * Такая функция обеспечивает совместимость с другими языками (зарезервированные слова).
    *
    * Или же можно сделать более выразительные названия функций:
    * fun `users should be signed out when they click logout`()
    * вместо fun usersShouldBeSignedOutWhenTheyClickLogout().
    * */
}

private fun readBountyBoard(): Unit {
    println("The hero approaches the bounty board. It reads:")
    println(
        obtainQuest(
            playerLevel = playerLevel,
        )
    )
}

private fun obtainQuest(
    playerLevel: Int,
    hasAngeredBarbarians: Boolean = false,
    hasBefriendedBarbarians: Boolean = true,
    playerClass: String = "paladin"
): String = when (playerLevel) {

    1 -> "Meet Mr. Bubbles in the land of soft things."

    in 2..5 -> {
        // Проверить возможность дипломатического решения
        val canTalkToBarbarians = !hasAngeredBarbarians &&
                (hasBefriendedBarbarians || playerClass == "barbarian")
        if (canTalkToBarbarians) {
            "Convince the barbarians to call off their invasion."
        } else {
            "Save the town from the barbarian invasions."
        }
    }

    6 -> "Locate the enchanted sword."

    7 -> "Recover the long-lost artifact of creation."

    8 -> "Defeat Nogartse, bringer of death and eater of worlds."

    else -> "There are no quests right now."
}