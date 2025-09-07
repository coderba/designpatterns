package org.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private final String name;
    private final String department;
    private final List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "+ Manager: " + name + " [" + department + "]");
        for (Employee e : subordinates) {
            e.showDetails(indent + "   ");
        }
    }
}
