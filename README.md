[![Java CI](https://github.com/enealulaj/SEW_TestingWithGit/actions/workflows/ci.yml/badge.svg)](https://github.com/enealulaj/SEW_TestingWithGit/actions/workflows/ci.yml)

# Calculator Program


This repository contains a simple Java-based calculator application. The application supports basic arithmetic operations such as addition, subtraction, multiplication, and division. It also includes unit tests to ensure the correctness of the implemented functionality.

## Project Structure

### 1. `Calculator`
This class provides methods to perform basic arithmetic operations:

- `add(int a, int b)` - Adds two integers and returns the result.
- `subtract(int a, int b)` - Subtracts the second integer from the first and returns the result.
- `multiply(int a, int b)` - Multiplies two integers and returns the result.
- `divide(int a, int b)` - Divides the first integer by the second and returns the result. Throws a `DivideByZeroException` if an attempt is made to divide by zero.

### 2. `DivideByZeroException`
A custom exception class to handle division by zero errors.

### 3. `CalculatorTest`
Unit tests written using JUnit 5 to verify the correctness of the `Calculator` class methods. Each operation has corresponding test cases to validate expected behavior.

## How to Run

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```

2. Add all files to the repository
   ```bash
   git add --all
   ```

3. Commit your action
   ```bash
   git commit -m "Message"
   ```
   
4. Push your data
   ```bash
   git push
   ```

## Example Usage

Here is an example of how to use the `Calculator` class:

```java
Calculator calculator = new Calculator();

int sum = calculator.add(5, 3); // Output: 8
int difference = calculator.subtract(10, 7); // Output: 3
int product = calculator.multiply(4, 6); // Output: 24

try {
    int quotient = calculator.divide(12, 3); // Output: 4
} catch (DivideByZeroException e) {
    System.err.println("Cannot divide by zero!");
}
```