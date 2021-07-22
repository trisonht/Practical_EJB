package com.example.crudapidemo.model;

import javax.persistence.*;

@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "wage")
    private int wage;

    public Employee(long id, String name, int wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public Employee(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public Employee() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
