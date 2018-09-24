package com.example.demo.app

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

class DummyInvocationHandler: InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        throw IllegalStateException("mocked method $method called!")
    }
}

inline fun <reified T>Any.mock(): T {
    return Proxy.newProxyInstance(
            this::class.java.classLoader,
            arrayOf(T::class.java),
            DummyInvocationHandler()) as T
}

