package org.badpost.kmahjong

import kotlin.test.Test
import kotlin.test.assertEquals

class TileTest {

    private val messed = listOf(
        Tile.FIVE_OF_CIRCLES,
        Tile.NINE_OF_BAMBOOS,
        Tile.WHITE_DRAGON,
        Tile.SOUTH_WIND,
        Tile.ONE_OF_BAMBOOS,
        Tile.RED_FIVE_OF_SYMBOLS,
        Tile.FIVE_OF_SYMBOLS,
    )

    @Test
    fun `correctness of method compareTo()`() {
        assertEquals(
            listOf(
                Tile.FIVE_OF_SYMBOLS,
                Tile.RED_FIVE_OF_SYMBOLS,
                Tile.FIVE_OF_CIRCLES,
                Tile.ONE_OF_BAMBOOS,
                Tile.NINE_OF_BAMBOOS,
                Tile.SOUTH_WIND,
                Tile.WHITE_DRAGON,
            ),
            messed.sorted()
        )
    }

    @Test
    fun `correctness of method toString()`() {
        assertEquals(
            "5c9b5z2z1b0s5s",
            messed.joinToString(separator = "")
        )
    }
}
