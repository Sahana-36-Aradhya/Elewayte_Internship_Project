# 📘 Java Minor Project - Student Profile Manager

This project is a simple **Java console-based application** designed to manage student academic records using core **Object-Oriented Programming (OOP)** concepts.

## 🎯 Project Purpose

The aim of this project is to apply key OOP concepts in Java in a real-world scenario, while handling student information like name, ID, CGPA, and major subject.


## 👩‍💻 Features

- Add and validate student records  
- Compare marks between two students  
- View individual student profiles  
- Calculate average CGPA of all students  
- Compare profiles using equals and hashCode  
- Handle invalid inputs using custom exceptions


## 🧠 OOP Concepts Used

- **Encapsulation** – Student data is secured within the `StudentInfo` class  
- **Inheritance** – Custom exception class inherits from `Exception`  
- **Polymorphism** – `equals()` and `hashCode()` are overridden  
- **Abstraction** – Business logic is separated in a helper class  
- **Exception Handling** – Custom checked exception `MarksCanNotBeNegativeException`  
- **Collection Framework** – Student records are stored using `ArrayList`


## 📂 Files Included

- `Main.java` – Entry point, handles user interaction  
- `StudentInfo.java` – Model class for student data  
- `LogicForStudentProject.java` – Contains logic for comparison and display  
- `MarksCanNotBeNegativeException.java` – Custom exception class

## ⚙️ How to Run

1. Open the project in any Java IDE (Eclipse, IntelliJ, or VS Code)  
2. Run the `Main.java` file  
3. Follow the prompts in the console to use the features


## 📌 Note

- Only the following major subjects are accepted: `PHYSICS`, `CHEMISTORY`, `MATHEMATICS`  
- CGPA and Student ID must be non-negative  


## 📚 Summary

This project was developed as part of a minor internship task to demonstrate practical application of OOP concepts. It focuses on **clean structure**, **user interaction**, and **basic data validation**.
