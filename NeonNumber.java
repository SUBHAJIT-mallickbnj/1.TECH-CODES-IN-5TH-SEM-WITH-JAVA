import java.util.Scanner;

class NeonNumber {
    // Method to check if a number is a Neon Number
    public boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        // Calculate the sum of digits of the square of the number
        while (square > 0) {
            sumOfDigits += square % 10; // Add the last digit to sum
            square /= 10;               // Remove the last digit
        }

        // Check if the sum of digits equals the original number
        return sumOfDigits == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NeonNumber neonNumber = new NeonNumber();
        
        System.out.print("Enter a number to check if it is a Neon Number: ");
        int number = scanner.nextInt();
        
        if (neonNumber.isNeonNumber(number)) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }

        scanner.close();
    }
}
