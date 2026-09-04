<h1 align="center">☕ STEP CLASS — SECOND YEAR</h1>
<p align="center">
  <b>Comprehensive Java Programming & Object-Oriented Software Engineering Repository</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java%2017%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Paradigm-Object--Oriented-007396?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Status-Active%20Coursework-4CAF50?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Level-Undergraduate%202nd%20Year-2A75BB?style=for-the-badge" />
</p>

---

## 📌 About The Repository

Welcome to the **Step Class Second Year** Java repository! This repository houses a structured collection of real-world problem-solving modules, algorithmic exercises, and Object-Oriented Programming (OOP) design patterns created for 2nd-year Computer Science coursework. 

Each weekly module targets core software engineering competencies — ranging from fundamental array traversal and string validation to constructor overloading, reference aliasing, and encapsulated domain model architecture.

---

## 🗺️ Weekly Curriculum & Module Overview

```
step-class-second_year/
├── week1/                  # Module 1: Logic, Arrays & String Processing
│   ├── class/              # Interactive Class Problem Implementations
│   └── homework/           # Independent Practice Homework Problems
├── week2/                  # Module 2: String Validation & Masking Utilities
│   ├── class/
│   └── homework/
├── week3/                  # Module 3: Core OOP, Encapsulation & References
│   ├── class/
│   └── homework/
└── week4/                  # Module 4: Advanced OOP, Constructor Chaining & Batch Systems
    ├── class/
    └── homework/
```

---

## 📚 Detailed Weekly Breakdowns

### 🟢 Week 1: Fundamentals of Logic, Arrays & String Processing
Focuses on low-level array scanning, nested loops without Collections frameworks, character-by-character string traversal, running maximum tracking, and pattern categorization.

| Problem File | Description | Core Concepts Covered |
| :--- | :--- | :--- |
| [`class/P1_ExamHallSeatDuplicationChecker.java`](file:///Users/sayanroy/stepclass/class/P1_ExamHallSeatDuplicationChecker.java) | Scans exam hall seat allocations and flags duplicate seat assignments. | Arrays, nested loops, conditional logic |
| [`class/P2_TypingSpeedTestAccuracyChecker.java`](file:///Users/sayanroy/stepclass/class/P2_TypingSpeedTestAccuracyChecker.java) | Computes character match accuracy percentage and reports first mismatch position. | `charAt()`, percentage calculation, index tracking |
| [`class/P3_TrafficSignalStreakAnalyzer.java`](file:///Users/sayanroy/stepclass/class/P3_TrafficSignalStreakAnalyzer.java) | Analyzes daily traffic light logs to find the longest consecutive color streak. | String traversal, running maximum tracking |
| [`class/P4_WarehouseInventoryBalancer.java`](file:///Users/sayanroy/stepclass/class/P4_WarehouseInventoryBalancer.java) | Compares section totals for inventory balance and pinpoints the highest-quantity item. | Array sums, balance check, multi-array indexing |
| [`class/P5_MovieReviewWordLengthProfiler.java`](file:///Users/sayanroy/stepclass/class/P5_MovieReviewWordLengthProfiler.java) | Classifies review text words into Short (1–4), Medium (5–8), and Long (9+) categories. | `split()`, regex string cleaning, counters |

---

### 🟡 Week 2: Input Validation & Security Utilities
Focuses on user input handling using `Scanner`, string sanitization, extension verification, and security data masking.

| Problem File | Description | Core Concepts Covered |
| :--- | :--- | :--- |
| `class/bankdetailschecker.java` | Interactive banking credential scanner and input prompt. | `Scanner`, string input stream |
| `class/fileextensionvalidator.java` | Verifies uploaded filenames against allowed file extensions (e.g. `.pdf`). | `endsWith()`, array iteration |
| `class/phonenumbermasked.java` | Masks sensitive 10-digit phone numbers for display security (`******-1234`). | `substring()`, string manipulation |

---

### 🔵 Week 3: Core Object-Oriented Programming (OOP) & References
Introduces object instantiated states, memory reference aliasing vs separate instances, static nested helper classes, and state mutation.

| Problem File | Description | Core Concepts Covered |
| :--- | :--- | :--- |
| `class/Main.java` | Demonstrates object reference aliasing vs distinct heap objects (`duplicate == ravi`). | Memory references, heap allocation |
| `class/mess.java` | Implements an encapsulated `MessWallet` static inner class with top-up & deduction rules. | Encapsulation, static inner class, balance validation |
| `class/placement.java` | Models student placement records with compensation tracking in LPA. | Class definitions, instance methods |
| `class/subject.java` | Configures theory vs lab subject credit allocations via custom constructors. | Constructor parameters, control flow |

---

### 🟣 Week 4: Advanced OOP, Constructor Chaining & Batch Operations
Covers constructor overloading via `this(...)`, batch data processing, domain model state encapsulation, and payroll/registration workflows.

| Class Module File | Homework Module File | Domain System Covered |
| :--- | :--- | :--- |
| `M1_LibraryBookCataloguing.java` | `A4_LibraryCard.java` | **Library Management**: ISBN cataloguing & card renewal tracking |
| `M2_PayrollBatchBonusRound.java` | `A5_PaymentDispatch.java` | **Financial Operations**: Employee salary bonuses & dispatch receipts |
| `M3_LateFees.java` | `A3_ParkingFine.java` | **Fee & Fine Engine**: Tiered penalty calculations |
| `M4_OneTimeCollegeSetup.java` | `A1_HackathonRegistration.java` | **Event Registration**: Participant team assignment & initialization |
| `M5_AccountBatchPayments.java` | `A2_CanteenInventory.java` | **Inventory & Accounts**: Batch account updating & item stock control |

---

## ⚡ Quick Start & Execution Guide

### Prerequisites
- **Java Development Kit (JDK)**: Version 17 or higher installed.
- **Terminal / CLI**: Any standard terminal (`zsh`, `bash`, or Windows PowerShell).

### Compiling and Running Exercises

To compile and run any Java file (e.g., Week 1 Class solutions):

```bash
# Navigate to workspace root
cd stepclass

# Compile the target Java program
javac class/P1_ExamHallSeatDuplicationChecker.java

# Execute the compiled class
java -cp class P1_ExamHallSeatDuplicationChecker
```

To compile all files within a module folder at once:

```bash
# Batch compile class files
javac class/*.java

# Run any program from class directory
java -cp class P2_TypingSpeedTestAccuracyChecker
```

---

## 💻 Key Code Snippets & Design Patterns

### 1. Constructor Chaining (`this(...)`)
```java
public class LibraryBook {
    private String title;
    private String isbn;

    // Primary constructor
    public LibraryBook(String title, String isbn) {
        this.title = title;
        this.isbn = (isbn == null || isbn.trim().isEmpty()) ? "PENDING" : isbn;
    }

    // Overloaded constructor chaining to primary
    public LibraryBook(String title) {
        this(title, "PENDING");
    }
}
```

### 2. Array Duplicate Detection without Collections
```java
for (int i = 0; i < seatNumbers.length; i++) {
    boolean alreadyProcessed = false;
    for (int k = 0; k < i; k++) {
        if (seatNumbers[k] == seatNumbers[i]) {
            alreadyProcessed = true;
            break;
        }
    }
    if (alreadyProcessed) continue;

    for (int j = i + 1; j < seatNumbers.length; j++) {
        if (seatNumbers[i] == seatNumbers[j]) {
            System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
            break;
        }
    }
}
```

---

## 📄 License & Repository Details
This repository is maintained for 2nd-year computer science coursework. All implementations strictly follow standard Java code formatting and Object-Oriented design guidelines.
