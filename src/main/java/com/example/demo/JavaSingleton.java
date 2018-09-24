package com.example.demo;

public class JavaSingleton {

    private static volatile JavaSingleton instance;
    private static Object mutex = new Object();

    private JavaSingleton() {
    }

    public static JavaSingleton getInstance() {
        JavaSingleton result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null)
                    instance = result = new JavaSingleton();
            }
        }
        return result;
    }

    private boolean scarySingletonMethod() {
        return false;
    }
}
