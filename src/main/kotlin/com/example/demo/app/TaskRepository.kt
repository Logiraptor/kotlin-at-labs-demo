package com.example.demo.app

import org.springframework.stereotype.Repository

@Repository
interface TaskRepository : org.springframework.data.repository.Repository<Task, Int> {
    fun save(task: Task): Task
    fun findAll(): List<Task>
}