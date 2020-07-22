package com.example.demo;

public class Car extends Staff {
    public Car() {
    }


    public Car(String name, Integer id) {
        super(name, id);
    }

    public Car(Integer id) {
        super(id);
    }

    public Car(String name, Integer id, Enum stafftipe) {
        super(name, id, stafftipe);
    }


    public Car(Integer id, Enum stafftipe) {
        super(id, stafftipe);
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
    public Integer getId() {
        return super.getId();
    }

    @Override
    public void setId(Integer id) {
        super.setId(id);
    }

    @Override
    public Enum getStaffType() {
        return super.getStaffType();
    }

    @Override
    public void setStaffType(Enum staffType) {
        super.setStaffType(staffType);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
