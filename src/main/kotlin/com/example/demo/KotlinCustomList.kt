package com.example.demo

import org.slf4j.LoggerFactory

class KotlinCustomList<T>(private val innerList: List<T>) : List<T> by innerList {
    private val logger = LoggerFactory.getLogger(javaClass)

    override fun isEmpty(): Boolean {
        logger.info("isEmpty")
        return innerList.isEmpty()
    }
}