package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Staff {

    private String name;
    @Id
    private Integer id;
    private Enum StaffType;

    public Staff() {
    }

    public Staff(String name, Integer id) {
        this.name = name;
        this.id = id;

    }

    public Staff(Integer id) {
        this.id = id;
    }

    public Staff(String name, Integer id, Enum staffType) {
        this.name = name;
        this.id = id;
        StaffType = staffType;
    }

    public Staff(Integer id, Enum staffType) {
        this.id = id;
        StaffType = staffType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Enum getStaffType() {
        return StaffType;
    }

    public void setStaffType(Enum staffType) {
        StaffType = staffType;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", Stafftipe=" + StaffType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staff)) return false;
        Staff staff = (Staff) o;
        return Objects.equals(getName(), staff.getName()) &&
                Objects.equals(getId(), staff.getId()) &&
                Objects.equals(getStaffType(), staff.getStaffType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getStaffType());
    }
}
