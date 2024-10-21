import java.util.Scanner;

public class BuzzNumber {

     
    public static boolean isBuzzNumber(int number) {
         
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a Buzz number:");
        int number = scanner.nextInt();

        if (isBuzzNumber(number)) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }

        scanner.close();
    }
}
