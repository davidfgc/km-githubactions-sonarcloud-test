package me.davidg.sonarqubesetup

import kotlin.test.Test
import kotlin.test.assertEquals

class HelloTest {

    @Test
    fun hello() {
        val name = "world"

        assertEquals("Hello $name", Hello().hello(name))
    }

}
