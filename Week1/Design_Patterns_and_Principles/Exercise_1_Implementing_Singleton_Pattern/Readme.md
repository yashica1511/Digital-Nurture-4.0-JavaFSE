````markdown
# 🧩 SingletonPatternExample

A simple Java implementation of the **Singleton Design Pattern**, ensuring that only one instance of a logging utility exists throughout the application lifecycle.

---

## 📘 Exercise Overview

**Exercise Name**: Implementing the Singleton Pattern  
**Goal**: Create a `Logger` utility class that maintains a single instance across the application to ensure consistent logging behavior.

---

## 📌 What is the Singleton Pattern?

The **Singleton Pattern** is a creational design pattern that ensures a class has **only one instance** and provides a **global point of access** to it.

This pattern is commonly used for:
- Logging
- Database connections
- Configuration settings
- Thread pools

Key characteristics:
- Private constructor
- Static instance of the class
- Public method to access that instance

---

## 📂 Project Structure

```bash
Exercise 1: Implementing the Singleton Pattern/
├── Logger.java   
└── Main.java      
````

---

## 🚀 How to Run

**Compile Java File**:

```bash
javac Logger.java Main.java
```

**Run the Application**:

```bash
java Main
```

---