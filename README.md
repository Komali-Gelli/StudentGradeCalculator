# 🎓 Student Grade Calculator – Java

A simple **console-based Student Grade Calculator** developed using Java. The program accepts the number of subjects and marks obtained in each subject, calculates the **total marks, average percentage, and grade**.

---

## 📌 Features

* 📝 Accepts the number of subjects
* 📊 Accepts marks for each subject
* ➕ Calculates total marks
* 📈 Calculates average percentage
* 🏆 Assigns a grade based on the average
* 💻 Displays a formatted student result
* 🔢 Uses arrays to store subject marks

---

## 🛠️ Technologies Used

* **Java**
* `Scanner` – for taking user input
* Arrays – for storing marks
* `for` loop – for processing subjects
* `if-else` statements – for calculating grades

---

## 📂 Project Structure

```text
StudentGradeCalculator/
│
├── StudentGradeCalculator.java
└── README.md
```

---

## ⚙️ Grade Criteria

| Average Percentage | Grade |
| ------------------ | ----- |
| 90 – 100           | A+    |
| 80 – 89            | A     |
| 70 – 79            | B     |
| 60 – 69            | C     |
| 50 – 59            | D     |
| Below 50           | F     |

---

## 🔄 How It Works

1. The program asks the user to enter the **number of subjects**.
2. An integer array is created to store the marks.
3. The program asks for marks for each subject.
4. It calculates the **total marks**.
5. The average percentage is calculated using the total marks and number of subjects.
6. Based on the average percentage, a grade is assigned.
7. The final result is displayed.

---

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/StudentGradeCalculator.git
```

### 2. Navigate to the Project Folder

```bash
cd StudentGradeCalculator
```

### 3. Compile the Program

```bash
javac StudentGradeCalculator.java
```

### 4. Run the Program

```bash
java StudentGradeCalculator
```

---

## 💻 Sample Input

```text
Enter number of subjects: 5
Enter marks for Subject 1: 85
Enter marks for Subject 2: 90
Enter marks for Subject 3: 78
Enter marks for Subject 4: 88
Enter marks for Subject 5: 92
```

## 📤 Sample Output

```text
=================================
       STUDENT GRADE RESULT
=================================
Total Marks: 433
Average Percentage: 86.60%
Grade: A
```

---

## 🧠 Java Concepts Practiced

This project demonstrates:

* Variables and data types
* Arrays
* `Scanner` class
* `for` loops
* `if-else if-else`
* Arithmetic operations
* Type casting
* `double` data type
* `printf()` formatting
* User input and output

---

## 🚀 Future Improvements

The project can be enhanced by adding:

* ✅ Input validation for marks
* 📚 Subject names
* 📊 Individual subject grades
* 🏅 GPA calculation
* 📈 Highest and lowest marks
* ❌ Pass/Fail status for each subject
* 🔄 Option to calculate grades for multiple students
* 🖥️ GUI version using Java Swing or JavaFX

---
