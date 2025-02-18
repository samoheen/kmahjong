package org.badpost.kmahjong

class Tile(
    val rank: Rank,
    val suit: Suit
) : Comparable<Tile> {

    companion object {
        // Symbols
        val ONE_OF_SYMBOLS = Tile(Rank.ONE, Suit.SYMBOLS)
        val TWO_OF_SYMBOLS = Tile(Rank.TWO, Suit.SYMBOLS)
        val THREE_OF_SYMBOLS = Tile(Rank.THREE, Suit.SYMBOLS)
        val FOUR_OF_SYMBOLS = Tile(Rank.FOUR, Suit.SYMBOLS)
        val FIVE_OF_SYMBOLS = Tile(Rank.FIVE, Suit.SYMBOLS)
        val RED_FIVE_OF_SYMBOLS = Tile(Rank.RED_FIVE, Suit.SYMBOLS)
        val SIX_OF_SYMBOLS = Tile(Rank.SIX, Suit.SYMBOLS)
        val SEVEN_OF_SYMBOLS = Tile(Rank.SEVEN, Suit.SYMBOLS)
        val EIGHT_OF_SYMBOLS = Tile(Rank.EIGHT, Suit.SYMBOLS)
        val NINE_OF_SYMBOLS = Tile(Rank.NINE, Suit.SYMBOLS)

        // Circles
        val ONE_OF_CIRCLES = Tile(Rank.ONE, Suit.CIRCLES)
        val TWO_OF_CIRCLES = Tile(Rank.TWO, Suit.CIRCLES)
        val THREE_OF_CIRCLES = Tile(Rank.THREE, Suit.CIRCLES)
        val FOUR_OF_CIRCLES = Tile(Rank.FOUR, Suit.CIRCLES)
        val FIVE_OF_CIRCLES = Tile(Rank.FIVE, Suit.CIRCLES)
        val RED_FIVE_OF_CIRCLES = Tile(Rank.RED_FIVE, Suit.CIRCLES)
        val SIX_OF_CIRCLES = Tile(Rank.SIX, Suit.CIRCLES)
        val SEVEN_OF_CIRCLES = Tile(Rank.SEVEN, Suit.CIRCLES)
        val EIGHT_OF_CIRCLES = Tile(Rank.EIGHT, Suit.CIRCLES)
        val NINE_OF_CIRCLES = Tile(Rank.NINE, Suit.CIRCLES)

        // Bamboos
        val ONE_OF_BAMBOOS = Tile(Rank.ONE, Suit.BAMBOOS)
        val TWO_OF_BAMBOOS = Tile(Rank.TWO, Suit.BAMBOOS)
        val THREE_OF_BAMBOOS = Tile(Rank.THREE, Suit.BAMBOOS)
        val FOUR_OF_BAMBOOS = Tile(Rank.FOUR, Suit.BAMBOOS)
        val FIVE_OF_BAMBOOS = Tile(Rank.FIVE, Suit.BAMBOOS)
        val RED_FIVE_OF_BAMBOOS = Tile(Rank.RED_FIVE, Suit.BAMBOOS)
        val SIX_OF_BAMBOOS = Tile(Rank.SIX, Suit.BAMBOOS)
        val SEVEN_OF_BAMBOOS = Tile(Rank.SEVEN, Suit.BAMBOOS)
        val EIGHT_OF_BAMBOOS = Tile(Rank.EIGHT, Suit.BAMBOOS)
        val NINE_OF_BAMBOOS = Tile(Rank.NINE, Suit.BAMBOOS)

        // Winds
        val EAST_WIND = Tile(Rank.ONE, Suit.HONOR)
        val SOUTH_WIND = Tile(Rank.TWO, Suit.HONOR)
        val WEST_WIND = Tile(Rank.THREE, Suit.HONOR)
        val NORTH_WIND = Tile(Rank.FOUR, Suit.HONOR)

        // Dragons
        val WHITE_DRAGON = Tile(Rank.FIVE, Suit.HONOR)
        val GREEN_DRAGON = Tile(Rank.SIX, Suit.HONOR)
        val RED_DRAGON = Tile(Rank.SEVEN, Suit.HONOR)
    }

    //region Comparable<T> Implementation
    //------------------------------------------------------------------------------------------------------------------
    override fun compareTo(other: Tile): Int {
        if (equals(other)) {
            return 0
        }
        val suitComparingResult = suit.ordinal.compareTo(other.suit.ordinal)
        return if (suitComparingResult != 0) {
            suitComparingResult
        } else {
            rank.ordinal.compareTo(other.rank.ordinal)
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    //endregion

    //region Base Class Implementation
    //------------------------------------------------------------------------------------------------------------------
    override fun toString() =
        "${rank.notation}${suit.notation}"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Tile

        if (rank != other.rank) return false
        if (suit != other.suit) return false

        return true
    }

    override fun hashCode(): Int {
        var result = rank.hashCode()
        result = 31 * result + suit.hashCode()
        return result
    }
    //------------------------------------------------------------------------------------------------------------------
    //endregion
}
