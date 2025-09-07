# Design Patterns in Java

This repository contains examples of various design patterns implemented in Java. The goal is to provide a clear and concise demonstration of each pattern's structure and usage.

## Structure

The design patterns are organized into the following categories:

*   **Behavioral Patterns**
    *   Chain of Responsibility
    *   Command
    *   Iterator
    *   Mediator
    *   Memento
    *   Observer
    *   State
    *   Strategy
    *   Template Method
    *   Visitor
*   **Creational Patterns**
    *   Abstract Factory
    *   Builder
    *   Factory Method
    *   Prototype
    *   Singleton
*   **Structural Patterns**
    *   Adapter
    *   Bridge
    *   Composite
    *   Decorator
    *   Facade
    *   Flyweight
    *   Proxy

## How to Compile and Run Examples

To compile and run any of the examples, navigate to the root of the project and use the following commands:

1.  **Compile:**
    ```bash
    javac src/main/java/org/designpatterns/behavioral/<pattern_name>/*.java -d target/classes
    ```
    Replace `<pattern_name>` with the specific pattern's folder name (e.g., `mediator`, `state`).

2.  **Run:**
    ```bash
    java -cp target/classes org.designpatterns.behavioral.<pattern_name>.Demo
    ```
    Replace `<pattern_name>` with the specific pattern's folder name. For some patterns, the main class might not be `Demo`, so adjust accordingly.

    For example, to run the Mediator pattern example:
    ```bash
    java -cp target/classes org.designpatterns.behavioral.mediator.Demo
    ```
