

---

# Java VarArgs Example — Variable Arguments

## Description

This project demonstrates the use of **variable arguments (varargs)** in Java. It shows how to define a method that accepts a variable number of arguments, allowing flexible method calls.

## Features

* Defines a method `sum` that takes two fixed integer parameters and a variable number of additional integers.
* Calculates the sum of all additional integers passed using varargs.
* Illustrates how varargs simplify handling an unknown number of method arguments.

## Code Structure

* `VarArgs` class: Contains the `main` method and the `sum` method using varargs.

## How to Run

1. Compile the class:

   ```bash
   javac Concepts/VarArgs/VarArgs.java
   ```

2. Run the program:

   ```bash
   java Concepts.VarArgs.VarArgs
   ```

## Sample Output

```
14
```

## Explanation

* The call `sum(3, 4, 5, 6)` passes `3` and `4` as fixed parameters and `5, 6` as varargs.
* The method sums `5 + 6 = 11` and returns it.
* The output prints `11`.

## Requirements

* Java JDK 8 or above
* Basic understanding of Java methods and parameter passing

