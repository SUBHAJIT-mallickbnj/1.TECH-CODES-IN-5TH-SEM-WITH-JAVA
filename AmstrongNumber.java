import java.util.Scanner;

class ArmstrongNumber {
     
    public boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

        
        while (number != 0) {
            number /= 10;
            digits++;
        }

        number = originalNumber; 

         
        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        // Check if the sum equals the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        
        System.out.print("Enter a number to check if it is an Armstrong Number: ");
        int number = scanner.nextInt();
        
        if (armstrongNumber.isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        scanner.close();
    }
}
