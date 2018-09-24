package com.example.demo;

public class JavaPojo {
    private int age;
    private String name;

    public JavaPojo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaPojo javaPojo = (JavaPojo) o;

        if (age != javaPojo.age) return false;
        return name != null ? name.equals(javaPojo.name) : javaPojo.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "JavaPojo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
