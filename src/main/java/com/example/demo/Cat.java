package com.example.demo;

public class Cat extends Pet{

    public Cat() {
    }

    public Cat(String name, Integer age) {
        super(name, age);
    }

    public Cat(String name, Integer petId, Integer age) {
        super(name, petId, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Integer getPetId() {
        return super.getPetId();
    }

    @Override
    public void setPetId(Integer petId) {
        super.setPetId(petId);
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(Integer age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
