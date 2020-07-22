package com.example.demo;

public class Person {

    private String name;
    private Integer age;
    private Job job;
    private Integer weight;
    private Integer high;

    public Person() {
    }

    public Person(String name, Integer age, Job job, Integer weight, Integer high) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.weight = weight;
        this.high = high;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, Job job) {
        this.name = name;
        this.job = job;
    }

    public Person(String name, Integer age, Job job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job=" + job +
                ", weight=" + weight +
                ", high=" + high +
                '}';
    }
}
