const val HERO_NAME = "Madrigal"
var playerLevel = 0

fun main() {

    println("$HERO_NAME announces her presence to the world.")

    println("What level is $HERO_NAME?")
    playerLevel = checkLevel(readln())
    println("$HERO_NAME's level is $playerLevel")

    readBountyBoard()

    println("Time passes...")
    println("$HERO_NAME returns from her quest.")

    playerLevel++
    println(playerLevel)
    readBountyBoard()
}

private fun checkLevel(input: String): Int =
    if (input.matches("\\d+".toRegex())) {
        input.toInt()
    } else {
        1
    }

private fun readBountyBoard(): Unit {

    println(
        """$HERO_NAME approaches the bounty board. It reads:
        |   ${obtainQuest(playerLevel).replace("[Nn]ogartse".toRegex(), "xxxxxxxx")}
    """.trimMargin()
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