Core Java Practice Repository
This repository contains various Java practice programs and projects focused on core Java concepts, lambda expressions, collections, multithreading, and object-oriented programming (OOPS). The programs are organized into different directories, each focusing on a specific topic or practice session. Below is a detailed overview of the repository structure, its contents, and instructions for running the programs.
Repository Overview
The repository is a collection of Java practice exercises and programs developed to enhance understanding of Java programming concepts. The main focus areas include:

Lambda Functions: Exploring Java 8 lambda expressions and functional interfaces.
Collections: Working with Java Collections Framework, such as HashMap.
Core Java: Basic Java programs to practice fundamental concepts.
Multithreading: Implementing threads using the Runnable interface.
OOPS: Applying object-oriented programming principles.
Java Practice Sessions: Daily practice programs covering various algorithms and problems, such as Fibonacci series and finding missing numbers in arrays.

Directory Structure
Below is the structure of the repository based on the provided metadata:

Collections/

Contains programs related to the Java Collections Framework.
Example: HashMap - Demonstrates the usage of HashMap for key-value pair operations.


Functional Interface/

Focuses on Java 8 functional interfaces and lambda expressions.
Example: Java 8 - Lambda Expression - Square of a Function - Implements a lambda expression to compute the square of a number.


JavaCore/

Contains basic Java practice programs.
Example: Java Practice Programs Day 1 - Introductory Java programs for beginners.


JavaPractice2/

Includes programs for practicing algorithms.
Example: Fibonacci series using recursion and formula - Implements the Fibonacci series using both recursive and formula-based approaches.


JavaPractice3/

Revisits earlier problems for reinforcement.
Example: Fibo program revision - Revised implementation of the Fibonacci series.


JavaPractice4/

Contains practice programs from day 5.
Example: java Practice day 5 - Miscellaneous Java exercises.


JavaPractice5/

Focuses on array-based problems.
Example: java Practice day 5 - Missing Number in Array - Finds a missing number in an array.


JavaPractice6/

Includes programs interacting with system applications.
Example: Notepad Open using Java - Opens Notepad using Java's Runtime class.


LambdaFunctions/

Contains programs demonstrating lambda expressions.
Example: Lambda Functions - Prime Number - Uses a lambda expression to check if a number is prime.


MultiThreading/

Explores Java multithreading concepts.
Example: MultiThreading - Creating Thread via Runnable Interface - Demonstrates thread creation using the Runnable interface.


OOPS/

Applies object-oriented programming principles.
Example: Lambda Functions - Prime Number - Reuses the prime number checker in an OOPS context.


.gitignore

Specifies files and directories to be ignored by Git, such as compiled .class files and IDE metadata.



Featured Program: Lambda Functions - Prime Number
The Lambda Functions - Prime Number program, located in the LambdaFunctions and OOPS directories, is a key example in this repository. It demonstrates the use of Java 8 lambda expressions to check if a number is prime.
Program Details

File: PrimeNumberLambda.java
Package: in.vk.main
Description: The program defines a functional interface Prime with a method pr(int n, int d) and uses a lambda expression to implement prime number checking logic.
Key Features:
Uses a lambda expression to check if a number is prime.
Handles edge cases (e.g., numbers less than 2, even numbers except 2).
Optimizes prime checking by testing only odd divisors up to the square root of the number.


Sample Output:17 is prime: true



Code Snippet
package in.vk.main;

interface Prime {
    public boolean pr(int n, int d);
}

public class PrimeNumberLambda {
    public static void main(String[] args) {
        Prime p = (n, d) -> {
            if (n < 2) return false;
            if (n != 2 && n % 2 == 0) return false;
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) return false;
            }
            return true;
        };

        int testNumber = 17;
        System.out.println(testNumber + " is prime: " + p.pr(testNumber, 0));
    }
}

Prerequisites
To run the programs in this repository, ensure you have the following installed:

Java Development Kit (JDK): Version 8 or higher (as the programs use Java 8 lambda expressions).
IDE: Any Java-compatible IDE like IntelliJ IDEA, Eclipse, or VS Code, or use a terminal for compilation and execution.
Git: To clone the repository (optional).

Setup Instructions

Clone the Repository:
git clone <repository-url>


Navigate to a Program Directory:
cd LambdaFunctions


Compile the Program:
javac in/vk/main/PrimeNumberLambda.java


Run the Program:
java in.vk.main.PrimeNumberLambda


Modify Test Cases (Optional):

Open PrimeNumberLambda.java in an editor.
Change the testNumber value in the main method to test different numbers.



Usage

Running Other Programs: Follow similar steps for other directories (e.g., Collections, MultiThreading). Navigate to the respective directory, compile, and run the Java files.
Exploring Lambda Expressions: Check the LambdaFunctions and Functional Interface directories for more examples of lambda expressions and functional interfaces.
Learning OOPS: The OOPS directory provides examples of applying object-oriented principles alongside lambda expressions.
Practicing Algorithms: The JavaPractice* directories contain various algorithmic problems like Fibonacci series and array manipulations.

Contributing
Contributions are welcome! To contribute:

Fork the repository.
Create a new branch for your feature or bug fix.
Add your Java programs or improvements to existing ones.
Ensure your code follows Java coding conventions and includes comments.
Submit a pull request with a clear description of your changes.

License
This repository is licensed under the MIT License. See the LICENSE file for details (if available).
Contact
For questions or feedback, please contact the repository owner via GitHub issues.
