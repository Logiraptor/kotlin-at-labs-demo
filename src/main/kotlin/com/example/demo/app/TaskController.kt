package com.example.demo.app

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class TaskController(val repo: TaskRepository) {

    @GetMapping("/")
    @ResponseBody
    fun list(): List<Task> {
        return repo.findAll().toList()
    }

    @GetMapping("/create")
    @ResponseBody
    fun create(@RequestParam("title") title: String): Task {
        return repo.save(Task(title = title))
    }
}
