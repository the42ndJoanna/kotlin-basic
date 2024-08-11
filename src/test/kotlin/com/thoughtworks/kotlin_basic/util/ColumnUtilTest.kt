package com.thoughtworks.kotlin_basic.util

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach

class ColumnUtilTest {

    private lateinit var columnUtil: ColumnUtil

    @BeforeEach
    fun setUp() {
        columnUtil = ColumnUtil()
    }

    @Test
    fun `Parameters (1, 1) should return A`() {
        val labels = columnUtil.calculateSequenceLabels(1, 1)
        assertEquals(1, labels.size)
        assertEquals("A", labels[0])
    }

    @Test
    fun `Parameters (1, 2) should return A, B`() {
        val labels = columnUtil.calculateSequenceLabels(1, 2)
        assertEquals(2, labels.size)
        assertEquals("A", labels[0])
        assertEquals("B", labels[1])
    }

    @Test
    fun `Parameters (26, 3) should return Z, AA, AB`() {
        val labels = columnUtil.calculateSequenceLabels(26, 3)
        assertEquals(3, labels.size)
        assertEquals("Z", labels[0])
        assertEquals("AA", labels[1])
        assertEquals("AB", labels[2])
    }

    @Test
    fun `given invalid start should throw exception`() {
        assertThrows(IllegalArgumentException::class.java) {
            columnUtil.calculateSequenceLabels(1111111, 1)
        }
    }
}