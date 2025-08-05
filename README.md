# Simple Interest & Loan Repayment Calculator –  Toy Store

An Android app designed to help a toy store owner, quickly calculate **simple interest** and **monthly loan repayment** for managing their business finances. The app simplifies financial decision-making by providing an intuitive and user-friendly interface to perform crucial calculations on the go.

---

## Overview

**Project Title**: Simple Interest and Loan Repayment Calculator  
**Purpose**: Provide Emily with a tool to calculate simple interest and loan repayments easily  
**Platform**: Android  
**Languages**: Java, XML  
**Tech Stack**: Android Studio

---

## Features

- **Input Fields** for:
  - Loan Principal Amount
  - Interest Rate (Annual %)
  - Time Period (in Years)
- **Buttons to:**
  - Calculate Simple Interest
  - Calculate Monthly Loan Repayment
  - Quit the application
- **Results Displayed in TextView:**
  - Simple Interest result
  - Total loan repayment with interest
  - Monthly repayment amount
- **Input Validation:**
  - Prompts when fields are empty
  - Handles non-numeric input with user-friendly messages

---

## Formulas Used

- **Simple Interest**:  
  `SI = (Principal × Rate × Time) / 100`

- **Loan Repayment**:  
  `Total = Principal + SI`  
  `Monthly Repayment = Total / (Time × 12)`

---

## User Interface (XML Layout)

- `EditText` fields for input
- `Buttons` to trigger calculations or exit
- `TextView` to display results
- Clean, simple layout to make usage quick and effortless

---

## How It Works

1. User enters the **principal**, **rate**, and **time**.
2. Taps one of:
   - **Calculate Simple Interest**
   - **Calculate Loan Repayment**
3. The app displays results in a clean format.
4. Optionally, the user can tap **Quit** to close the app.

---

##  Getting Started

### Requirements
- Android Studio
- Android SDK (API 21+ recommended)

### How to Run
1. Clone or download this repository
2. Open in Android Studio
3. Run the app on an emulator or Android device

---

---

## 👩‍🏫 Use Case

Built to solve a **real-life business scenario** where a small business owner needs a fast, mobile solution to calculate loan costs — helping them make smarter inventory decisions and stay financially aware.


