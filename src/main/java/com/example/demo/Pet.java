package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Pet {
    private String name;
    @Id
    private Integer petId;

    private Integer age;

    public Pet() {
    }

    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name, Integer petId, Integer age) {
        this.name = name;
        this.petId = petId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", petId=" + petId +
                ", age=" + age +
                '}';
    }
}
