package com.dmytrofesyk.math

import java.math.BigDecimal
import java.math.BigInteger

/**
 * Extension function to add integer values
 * @receiver [Int]
 * @param number integer value
 */
fun Int.add(number: Int) = this + number

/**
 * Extension function to add integer values
 * @receiver [Long]
 * @param number long value
 */
fun Long.add(number: Long) = this + number

/**
 * Extension function to add integer values
 * @receiver [Float]
 * @param number float value
 */
fun Float.add(number: Float) = this + number

/**
 * Extension function to add integer values
 * @receiver [BigInteger]
 * @param number BigInt value
 */
fun BigInteger.add(number: BigInteger) = this + number

/**
 * Extension function to add integer values
 * @receiver [BigDecimal]
 * @param number BigDec value
 */
fun BigDecimal.add(number: BigDecimal) = this + number
