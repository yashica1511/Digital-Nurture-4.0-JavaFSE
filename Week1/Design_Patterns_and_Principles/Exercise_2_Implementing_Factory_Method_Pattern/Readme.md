````markdown
# 🏭 FactoryMethodPatternExample

A simple Java implementation of the **Factory Method Design Pattern**, used to create different types of documents (Word, PDF, Excel) in a document management system.

---

## 📘 Exercise Overview

**Exercise Name**: Implementing the Factory Method Pattern  
**Goal**: Design a flexible and scalable document creation system that uses the Factory Method Pattern to create different document types without altering client code.

---

## 🧠 What is the Factory Method Pattern?

The **Factory Method Pattern** is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

### 🔑 Key Benefits:
- Promotes loose coupling
- Enhances scalability
- Adheres to Open/Closed Principle

---

## 📂 Project Structure

```bash
FactoryMethodPatternExample/
├── Document.java                  
├── WordDocument.java             
├── PdfDocument.java              
├── ExcelDocument.java            
├── DocumentFactory.java          
├── WordDocumentFactory.java      
├── PdfDocumentFactory.java       
├── ExcelDocumentFactory.java     
└── Main.java                     
````

---

## 🚀 How to Run

**Step 1: Compile Java Files**

```bash
javac *.java
```

**Step 2: Run the Application**

```bash
java Main
```

---
