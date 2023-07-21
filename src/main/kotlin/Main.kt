//const val HERO_NAME = "Madrigal"

fun main() {

    for (i in 1..3) {
        println(i)
    }
    println()
    println((1..3).toList())
    println()
    for (i in 3 downTo 1) {
        println(i)
    }
    println()
    for (i in 1..<3) {
        println(i)
    }
    println()
    for (i in 3 until 1) {
        println(i)
    }
    println()
    println('x' in 'a'..'z')

    /*println("The hero announces her presence to the world.")

    println(HERO_NAME)

    var playerLevel = 4
    println(playerLevel)

    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"

    val quest = when (playerLevel) {

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

    println("The hero approaches the bounty board. It reads:")
    println(quest)

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel++
    println(playerLevel)*/
}