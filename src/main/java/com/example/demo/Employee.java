package com.example.demo;

public class Employee extends Person{
    public Employee() {
    }

    public Employee(String name, Integer age, Job job, Integer weight, Integer high) {
        super(name, age, job, weight, high);
    }

    public Employee(String name, Integer age) {
        super(name, age);
    }

    public Employee(String name, Job job) {
        super(name, job);
    }

    public Employee(String name, Integer age, Job job) {
        super(name, age, job);
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
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(Integer age) {
        super.setAge(age);
    }

    @Override
    public Job getJob() {
        return super.getJob();
    }

    @Override
    public void setJob(Job job) {
        super.setJob(job);
    }

    @Override
    public Integer getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(Integer weight) {
        super.setWeight(weight);
    }

    @Override
    public Integer getHigh() {
        return super.getHigh();
    }

    @Override
    public void setHigh(Integer high) {
        super.setHigh(high);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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
