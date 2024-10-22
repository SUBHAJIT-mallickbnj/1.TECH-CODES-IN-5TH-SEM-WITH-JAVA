import java.util.Scanner;

public class TribonacciNumber {

    
    public static void printTribonacci(int n) {
        int t1 = 0, t2 = 1, t3 = 1;
        System.out.print("Tribonacci Sequence: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " ");

            
            int nextTerm = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms for the Tribonacci sequence:");
        int n = scanner.nextInt();

       
        printTribonacci(n);

        scanner.close();
    }
}
