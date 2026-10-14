# SecureAuthenticationStressTesting

## Aim
Validate username/password lengths and report SUCCESS or FAILURE for each attempt.

## Sample Input
```text
3
admin admin123
ab 123
user pass
```

## Sample Output
```text
SUCCESS
FAILURE
FAILURE
```

## Run
For standard Java tasks:
```bash
javac SecureAuthenticationStressTesting.java
java SecureAuthenticationStressTesting
```

For Task 9, configure JUnit 5 and run `CalculatorTest.java` as a JUnit test.
