package com.example.demo.app

import org.junit.Assert.assertEquals
import org.junit.Test


class TaskControllerTests {
    @Test
    fun createSavesANewTask() {

        val spyTaskRepository = object : TaskRepository {
            val savedTasks = ArrayList<Task>()

            override fun findAll(): List<Task> {
                return savedTasks
            }

            override fun save(task: Task): Task {
                savedTasks.add(task)
                return task
            }
        }

        val controller = TaskController(spyTaskRepository)
        controller.create("Test Title")

        assertEquals(1, spyTaskRepository.savedTasks.size)
    }
}
