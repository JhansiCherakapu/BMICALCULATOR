BMI Calculator Android App

A sleek, user-friendly Android application built with **Kotlin** that calculates Body Mass Index (BMI). This app provides instant health category feedback based on user input for height and weight.
## Features
Clean Onboarding: A dedicated splash screen to welcome users.
Input Validation: Built-in checks to ensure fields aren't empty and height is greater than zero to prevent calculation errors.
Dynamic Results: 
    * Calculates BMI using the standard formula.
    * Categorizes results into Underweight, Normal, Overweight, or Obese.
    * Visual Cues: The text color changes to 'Red' specifically for the "Obese" category to highlight health risks.
Custom UI: Utilizes Poppins fonts and a clean vertical layout for a modern look and feel.

## App Flow
1.  Welcome Screen (`MainActivity1`): Features a bold title and a "Calculate Now" button to navigate to the calculator.
2.  Information Entry (`MainActivity2`): Users enter their gender, age, height (in meters), and weight (in kilograms).
3.  Result Display: Upon clicking "Calculate Now," the BMI value and health category are displayed instantly.

## Technical Implementation
BMI Classification
The app uses the following logic to determine health status:
| BMI Range   | Category      | Text Color |
| ------------| ------------- | ---------- |
| < 18.5      | Underweight   | Black      |
| 18.5 – 24.9 | Normal weight | Black      |
| 25.0 – 29.9 | Overweight    | Black      |
| > 30.0      | Obese         | Red        |

## Development Stack
* Language: Kotlin
* Layout: XML (LinearLayout)
* Architecture: Activity-based navigation using Intents.

## 📂 Project Structure
app/src/main/
├── java/com/example/project1/
│   ├── MainActivity1.kt    # Entry Activity
│   └── MainActivity2.kt    # Logic & Calculation Activity
└── res/
    ├── layout/
    │   ├── activity_main1.xml  # Welcome UI
    │   └── activity_main2.xml  # Input/Result UI
    ├── values/colors.xml       # Custom colors (bl2, drkbl, etc.)
    └── font/                   # Poppins font family

## Installation & Setup
*Clone the Repo:
 Bash
 git clone [https://github.com/yourusername/BMI-Calculator.git](https://github.com/yourusername/BMI-Calculator.git)
*Open in Android Studio:
 Sync Gradle files and ensure SDK 31+ is installed.
*Required Resources:
 Add a @drawable/background image to your project.
 Ensure @font/poppins_medium is present in your font resources.
*Run:
 Deploy to an emulator or physical Android device.
