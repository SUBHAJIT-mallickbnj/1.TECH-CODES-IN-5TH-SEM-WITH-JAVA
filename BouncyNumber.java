import java.util.Scanner;

public class BouncyNumber {

     
    public static boolean isBouncy(int n) {
        boolean increasing = true;
        boolean decreasing = true;
        int lastDigit = n % 10;
        n /= 10;

        while (n > 0) {
            int currentDigit = n % 10;
            if (currentDigit < lastDigit) {
                increasing = false;
            } else if (currentDigit > lastDigit) {
                decreasing = false;
            }
            lastDigit = currentDigit;
            n /= 10;
        }

        return !(increasing || decreasing);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        
         
        if (start < 0 || end < 0 || start >= end) {
            System.out.println("Invalid range. Please enter non-negative values with start less than end.");
            scanner.close();
            return;
        }

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isBouncy(i)) {
                count++;
            }
        }
        
         
        System.out.println("Number of bouncy numbers between " + start + " and " + end + ": " + count);
        
        
        scanner.close();
    }
}
