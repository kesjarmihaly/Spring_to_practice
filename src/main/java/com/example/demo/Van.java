package com.example.demo;

public class Van extends Staff{
    public Van() {
        super();
    }

    public Van(String name, Integer id) {
        super(name, id);
    }

    public Van(Integer id) {
        super(id);
    }

    public Van(String name, Integer id, Enum staffType) {
        super(name, id, staffType);
    }


    public Van(Integer id, Enum staffType) {
        super(id, staffType);
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
