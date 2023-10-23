package com.springrest.sprinfrest.entities;

public class Employee {
    private long ID;

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee() {
        super();
    }

    public Employee(long ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    private String name;
}
