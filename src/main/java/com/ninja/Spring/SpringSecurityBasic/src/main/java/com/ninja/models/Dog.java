package com.ninja.models;

public class Dog {

    private String name;
    private Integer age;
    private String owner;

    public Dog(String name, Integer age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }
}
