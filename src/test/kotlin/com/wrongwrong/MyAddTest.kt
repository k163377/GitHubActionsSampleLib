package com.wrongwrong

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MyAddTest {
    @Test
    fun test() {
        assertEquals(1.0 + 2.0, myAdd(2.0, 1.0))
    }
}
