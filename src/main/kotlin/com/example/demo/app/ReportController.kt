package com.example.demo.app

import org.springframework.jdbc.core.JdbcOperations
import org.springframework.jdbc.core.queryForObject
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class ReportController(val jdbcOperations: JdbcOperations) {

    @GetMapping("/report")
    @ResponseBody
    fun count(): Int? {
        return jdbcOperations.queryForObject("select count(*) from tasks", Int::class.java)
    }
}
