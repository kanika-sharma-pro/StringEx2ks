
/*
 * Exercise 3: Converting Case
 * 
 * Write a program that takes a string and prints it in:
 * 1. All uppercase letters
 * 2. All lowercase letters
 */
import java.util.Scanner;

public class Exercise3_ConvertingCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        
        // TODO: Convert and print the message in all uppercase
        System.out.println(message.toUpperCase());
        // TODO: Convert and print the message in all lowercase
        System.out.println(message.toLowerCase());
        scanner.close();
    }
}

// Expected output (if input is "Hello World"):
// In uppercase: HELLO WORLD
// In lowercase: hello world

