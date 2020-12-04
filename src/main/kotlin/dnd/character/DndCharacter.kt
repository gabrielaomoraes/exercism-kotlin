import kotlin.math.floor

class DndCharacter {

    val strength: Int = ability()
    val dexterity: Int = ability()
    val constitution: Int = ability()
    val intelligence: Int = ability()
    val wisdom: Int = ability()
    val charisma: Int = ability()
    val hitpoints: Int = 10 + modifier(constitution)

    companion object {
        fun ability(): Int = generateSequence { Dice(6).roll() }
            .take(4)
            .sorted()
            .drop(1)
            .sum()

        fun modifier(abilityScore: Int) = floor((abilityScore - 10).toDouble() / 2).toInt()
    }

}

class Dice(private val sides: Int) {
    fun roll() = (0..sides).random()
}
