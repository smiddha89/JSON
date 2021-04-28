package com.example.pc.json_employeedetails;

import java.io.Serializable;

/**
 * Created by PC on 29-Jan-18.
 */

public class Employee implements Serializable{

    private int id;
    private String name;
    private  String designation;
    private double salary;
    private String[] hobies;

    public Employee(int id, String name, String designation, double salary, String[] hobies) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.hobies = hobies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getHobies() {
        return hobies;
    }

    public void setHobies(String[] hobies) {
        this.hobies = hobies;
    }

    @Override
    public String toString()
    {
        return name + "\n"+designation;
    }
}
