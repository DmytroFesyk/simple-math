package com.dmytrofesyk.math

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.math.BigInteger

internal class AddTest {

    @Test
    fun `test add function for integer`() {

        val result = 10.add(5)

        assertEquals(result,15)
    }

    @Test
    fun `test add function for long`() {

        val result = 10L.add(5L)

        assertEquals(result,15L)
    }

    @Test
    fun `test add function for float`() {

        val result = 10.0f.add(5.0f)

        assertEquals(result,15.0f)
    }

    @Test
    fun `test add function for BigInt`() {

        val result = BigInteger("10").add(BigInteger("5"))

        assertEquals(result,BigInteger("15"))
    }

    @Test
    fun `test add function for BigDec`() {

        val result = BigDecimal("10.0").add(BigDecimal("5.2"))

        assertEquals(result,BigDecimal("15.2"))
    }
}
