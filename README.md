# Roman Number Converter – MTSS Assignment 2

[![Java CI with Maven](https://github.com/MatteoUnipd/MTSS2/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/MatteoUnipd/MTSS2/actions)
[![Coverage Status](https://coveralls.io/repos/github/MatteoUnipd/MTSS2/badge.svg)](https://coveralls.io/github/MatteoUnipd/MTSS2)
[![GitHub last commit](https://img.shields.io/github/last-commit/MatteoUnipd/MTSS2)](https://github.com/MatteoUnipd/MTSS2/commits/main)
[![Platform](https://img.shields.io/badge/platform-Windows%20%7C%20Mac%20%7C%20Linux-blue)](https://github.com/MatteoUnipd/MTSS2)
![Unipd](https://img.shields.io/badge/MTSS2-UNIPD-red)

> Project developed for the course **"Modelli e Tecniche per lo Sviluppo del Software (MTSS)"** – University of Padua

---

## 📝 Description

This project aims to provide two functionalities:


1. **Arabic to Roman Number Converter**: Converts the first 1000 integer numbers from Arabic to Roman numerals.
2. **Roman Number ASCII Art Printer**: Provides a method to print Roman numerals in ASCII art.

## Features

- [ ] Convert Arabic numbers to Roman numerals.

- [ ] Print Roman numerals in ASCII art.


## 📦 Requirements

- **Java JDK 8** or higher  
  > Check your version with: `java -version`
- Operating system: **Windows** (developed and tested), also compatible with Mac/Linux
- **Maven** (for building and testing)
- Recommended Java IDE: IntelliJ IDEA, Eclipse, or VSCode

---

## 🚀 Getting Started

### 🔁 1. Fork (optional)

You can fork this repository on GitHub to work on your own copy:  
👉 [Fork this repo](https://github.com/MatteoUnipd/MTSS2)

### 📥 2. Clone the repository

Open a terminal (e.g., Git Bash on Windows) and run:

```bash
git clone https://github.com/MatteoUnipd/MTSS2.git
cd MTSS2
```

📂 Project Structure
```bash
MTSS2/
├── src/
│   ├── main/java/              # Source code
│   └── test/java/              # JUnit tests
├── .github/workflows/          # GitHub Actions CI/CD configuration
│   ├── build.yml               # CI build and test configuration file
├── pom.xml                     # Maven build configuration
├── header.txt                  # Header file containing project information
├── checkstyle.xml              # Checkstyle configuration file for code quality
├── README.md                   # Project documentation
└── .gitignore                  # Git ignore rules
```

## 🧪 Testing & Continuous Integration

This project includes a robust testing system and CI pipeline to ensure code quality and prevent regressions.

### ✔️ Unit Testing

We used **JUnit** to implement unit tests for the main functionalities:
- Conversion from Arabic to Roman numerals
- Validation of input values
- Output format and exceptions
- ASCII Art output

You can run all tests locally using Maven:

```bash
mvn test
```
## Contributors

  - Matteo Wu (2075514)
  - Ana Maria Draghici (2101044)

---