package com.javacodegeeks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;

    private String fullname;

    private int salary;

    /*
    Use this to override the mappings of the Address fields

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "postcode", column = @Column(name = "zip")),
        @AttributeOverride(name = "city", column = @Column(name = "town"))
    })
    */
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", fullname=" + fullname + ", salary=" + salary + ", address=" + address + "]";
    }
}