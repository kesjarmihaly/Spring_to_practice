package com.example.demo;

import javax.persistence.*;
import java.util.List;

public class Company {

    private Integer companyId;
    private String companyName;

    @OneToMany
    private List<Employee>employeeList;


    public Company(String companyName, List<Employee> employeeList, Integer companyId) {
        this.companyName = companyName;
        this.employeeList = employeeList;
        this.companyId = companyId;
    }

    public Company(String companyName, Integer companyId) {
        this.companyName = companyName;
        this.companyId = companyId;
    }

    public Company() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employeeList=" + employeeList +
                ", companyId=" + companyId +
                '}';
    }
}
