package com.example.demo.app

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.springframework.jdbc.core.JdbcOperations

class ReportControllerTests {
    @Test
    fun countReturnsTheNumberOfAddedTasks() {
        val jdbcOperations = object : JdbcOperations by mock() {
            override fun <T : Any?> queryForObject(p0: String, p1: Class<T>): T? {
                return 17 as T
            }
        }
        val reportController = ReportController(jdbcOperations)
        val result = reportController.count()
        assertEquals(17, result)
    }
}
