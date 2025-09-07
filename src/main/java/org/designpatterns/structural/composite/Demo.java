package org.designpatterns.structural.composite;

/**
 * 🏢 Composite Pattern – Organization Structure Example
 * ✅ Scenario
 * An Employee can be either a Developer (leaf) or a Manager (composite).
 * A Manager can have subordinates (developers or other managers).
 * The client can call showDetails() on any employee, and it works the same way.
 */
public class Demo {
    public static void main(String[] args) {
        // Leaf employees
        Employee dev1 = new Developer("Alice", "Backend Developer");
        Employee dev2 = new Developer("Bob", "Frontend Developer");
        Employee dev3 = new Developer("Charlie", "Mobile Developer");

        // Manager with subordinates
        Manager engManager = new Manager("Diana", "Engineering");
        engManager.add(dev1);
        engManager.add(dev2);
        engManager.add(dev3);

        // Higher-level Manager
        Manager ceo = new Manager("Edward", "Executive");
        ceo.add(engManager);

        // Client treats both Manager and Developer uniformly
        ceo.showDetails("");
    }
}
