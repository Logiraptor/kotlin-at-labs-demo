package com.example.demo.app

import javax.persistence.*

@Entity(name="tasks")
data class Task(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int = 0,
        @Column
        val title: String
)
