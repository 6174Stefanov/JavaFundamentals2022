package NumbersPyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first six-digit number (smaller): ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter the second six-digit number (greater): ");
        int secondNumber = scanner.nextInt();

        // Validate input
        if (firstNumber < 100000 || firstNumber > 999999 || secondNumber < 100000 || secondNumber > 999999) {
            System.out.println("Both numbers must be six digits.");
            return;
        }

        if (firstNumber >= secondNumber) {
            System.out.println("The first number must be smaller than the second number.");
            return;
        }

        // Find and print numbers with equal sum of digits at odd and even positions
        for (int i = firstNumber + 1; i < secondNumber; i++) {
            if (hasEqualSumOfPositionDigits(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean hasEqualSumOfPositionDigits(int number) {
        int sumOddPosition = 0;
        int sumEvenPosition = 0;
        String numberStr = String.format("%06d", number); // Ensure it's a six-digit string

        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            if ((i + 1) % 2 == 0) { // Even position (1-based)
                sumEvenPosition += digit;
            } else { // Odd position (1-based)
                sumOddPosition += digit;
            }
        }

        return sumOddPosition == sumEvenPosition;
//Problem solved via ChatGPT
    }
}
