import java.util.Scanner;
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
