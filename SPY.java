import java.util.Scanner;
public class SPY {
     
    public boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        
         
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        
         
        return sum == product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SPY spy = new SPY();
        
        System.out.print("Enter a number to check if it is a Spy Number: ");
        int number = scanner.nextInt();
        
        if (spy.isSpyNumber(number)) {
            System.out.println(number + " is a Spy Number.");
        } else {
            System.out.println(number + " is not a Spy Number.");
        }

        scanner.close();
    }
}


