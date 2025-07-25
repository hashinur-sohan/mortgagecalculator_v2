

---

# 🏠 Mortgage Calculator v2 (Java Console App)

This is a simple Java console application that calculates the monthly mortgage payment based on user inputs for:

* **Principal Amount** (Loan amount)
* **Annual Interest Rate**
* **Loan Period (in years)**

The calculator uses the standard mortgage formula to compute monthly payments and formats the output into currency for better readability.

---

## 💻 Features

* Input validation for:

  * Principal amount (between 1,000 and 1,000,000)
  * Interest rate (between 1% and 30%)
  * Loan period (between 1 and 30 years)
* Monthly interest calculation
* Total number of monthly payments
* Properly formatted currency output using `NumberFormat`

---

## 🧮 Formula Used

```
M = P * [ r(1 + r)^n ] / [ (1 + r)^n – 1 ]
Where:
M = monthly payment
P = principal loan amount
r = monthly interest rate
n = number of payments (months)
```

---

## 📦 How to Run

1. Clone this repository:

   ```
   git clone https://github.com/your-username/mortgagecalculator_v2.git
   ```
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse)
3. Run the `Main.java` file

---

## 🔧 Requirements

* Java 8 or higher
* A Java IDE or terminal with `javac` and `java` commands

---

## 📌 Sample Output

```
Principal: 250000
Annual Interest Rate: 5
Period (Years): 20
Mortgage: $1,649.54
```

---

## 📁 File Structure

```
/src
└── com
    └── mortgagecalculator_v2
        └── me
            └── Main.java
```

---

## ⚠️ Limitations
```

* This program assumes valid numeric input from the user.

* Input validation only checks ranges, not input types — entering non-numeric values (e.g., letters or symbols) may cause the program to crash.

* Exception handling is not implemented in this version.

---


