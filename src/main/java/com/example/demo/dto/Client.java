package com.example.demo.dto;

public class Client {
    private String name;
    private String lastName;
    private boolean hasCar;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Client(String name, String lastName, boolean hasCar, int age) {
        this.name = name;
        this.lastName = lastName;
        this.hasCar = hasCar;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hasCar=" + hasCar +
                ", age=" + age +
                '}';
    }

    public Client() {
    }
}
