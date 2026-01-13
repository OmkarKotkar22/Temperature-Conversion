# 🌡️ Temperature Conversion System (Java)

![Language](https://img.shields.io/badge/Language-Java-blue)
![Concept](https://img.shields.io/badge/OOP-Concepts-success)
![Concept](https://img.shields.io/badge/Interface-Used-orange)
![Concept](https://img.shields.io/badge/Abstraction-Used-yellow)
![Status](https://img.shields.io/badge/Project-Completed-brightgreen)
![Application](https://img.shields.io/badge/Application-Console--Based-lightgrey)

---

## 📌 Project Overview

The **Temperature Conversion System** is a **Java console-based application** designed to convert temperatures between different units using **Object-Oriented Programming (OOP) principles**.  

This project demonstrates the **real-world use of interfaces and abstraction** by defining a common conversion contract and implementing multiple temperature conversion strategies.

---

## 🎯 Objectives

- Convert temperatures between:
  - Celsius → Fahrenheit
  - Fahrenheit → Celsius
  - Celsius → Kelvin
- Apply **OOP best practices**
- Demonstrate **Interface-based design**
- Show **Abstraction & Polymorphism**
- Maintain a **clean project structure**

---

## 🧠 OOP Concepts Used

### ✅ 1. Interface
- `Converter.java` defines a **common contract** for all temperature converters.
- Ensures consistency and scalability.

### ✅ 2. Abstraction
- Conversion logic is hidden behind the interface.
- User interacts with high-level methods only.

### ✅ 3. Polymorphism
- Different converter classes are accessed using the same interface reference.

### ✅ 4. Encapsulation
- Each conversion logic is encapsulated inside its respective class.

---

## 📂 Project Structure

```
Temperature-Conversion/
│
├── src/
│     └── Temp/
│           ├── Converter.java
│           ├── CelsiusToFahrenheit.java
│           ├── FahrenheitToCelsius.java
│           ├── CelsiusToKelvin.java
│           └── TempConvertor.java
│
├── bin/
│     └── Temp/
│           ├── Converter.class
│           ├── CelsiusToFahrenheit.class
│           ├── FahrenheitToCelsius.class
│           ├── CelsiusToKelvin.class
│           └── TempConvertor.class
│
├── .classpath
├── .project
└── README.md
```


---

## 🧩 Class Description

### 🔹 `Converter.java`
- An **interface** that declares the conversion method.
- Acts as a blueprint for all conversion classes.

### 🔹 `CelsiusToFahrenheit.java`
- Implements `Converter`
- Converts Celsius temperature to Fahrenheit.

### 🔹 `FahrenheitToCelsius.java`
- Implements `Converter`
- Converts Fahrenheit temperature to Celsius.

### 🔹 `CelsiusToKelvin.java`
- Implements `Converter`
- Converts Celsius temperature to Kelvin.

### 🔹 `TempConvertor.java`
- **Main class**
- Handles user interaction and executes conversions.

---

## ▶️ How to Run the Project

1. Clone the repository:
`
git clone <repository-url>
`

2. Navigate to the project folder:
`
cd Temperature-Conversion
`

3. Compile the project:
`
javac src/Temp/*.java
`

4. Run the application:
`
java Temp.TempConvertor
`

## 🖥️ Sample Output
```
Select Conversion Type:
1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
3. Celsius to Kelvin

Enter choice: 1
Enter temperature in Celsius: 25
Converted Temperature: 77.0 °F
```

🌍 Real-Life Application  
Temperature conversion systems are widely used in:  
🌦️ Weather forecasting applications  
🏥 Medical equipment  
🌡️ Industrial monitoring systems  
✈️ Aviation and space research  
📱 Smart home devices  

## 🚀 Future Enhancements

Add Kelvin → Celsius & Kelvin → Fahrenheit  
GUI using JavaFX or Swing  
Input validation & exception handling  
Unit testing using JUnit  

## 👨‍💻 Author

Omkar Kotkar
Java Developer

## 📜 License

This project is for educational purposes and free to use or modify.
