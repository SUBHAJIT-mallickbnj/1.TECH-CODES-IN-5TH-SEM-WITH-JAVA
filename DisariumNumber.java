import java.util.Scanner;

public class DisariumNumber {

     
    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

     
    public static boolean isDisarium(int number) {
        int sum = 0;
        int numDigits = countDigits(number);
        int temp = number;

         
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
            numDigits--;
        }

         
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Disarium number:  ");
        int number = scanner.nextInt();

        if (isDisarium(number)) {
            System.out.println("__________________________________________________________________  ");
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println("__________________________________________________________________  ");
            System.out.println(number + " is not a Disarium number.");
        }

        scanner.close();
    }
}
