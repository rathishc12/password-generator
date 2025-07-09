# Java Password Generator

This is a simple **random password generator** built using Java. It allows the user to enter a desired password length and generates a strong password containing **uppercase letters**, **lowercase letters**, **numbers**, and **symbols**.

---

## Features

- Generate secure and random passwords
- Supports mixed characters: letters, numbers, and symbols
- Easy to run on any system with Java installed

---
## Code
```import java.util.Scanner;
import java.util.Random;
class passwordGenerator {

    public static String generatePassword(int length) {
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()_+-=[]{}|;:',.<>?/";
        
        // Combine all characters
        String allChars = lower + upper + digits + symbols;

        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Password Generator ===");
        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();

        if (length < 4) {
            System.out.println("Password length should be at least 4 characters.");
        } else {
            String password = generatePassword(length);
            System.out.println("Generated Password: " + password);
        }

        scanner.close();
    }
}
```
## How to Run

### Step 1: Compile the Java file
Open terminal in the project directory and run:

```bash
javac PasswordGenerator.java
```
### Step 2: Run the program
java PasswordGenerator

### Sample Output
```
=== Password Generator ===
Enter desired password length: 10
Generated Password: Ab9@qR!2#T
```
