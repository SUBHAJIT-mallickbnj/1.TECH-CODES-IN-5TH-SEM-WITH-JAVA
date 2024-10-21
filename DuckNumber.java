import java.util.Scanner;

class DuckNumber {
    public boolean isDuckNumber(int number) {
         
        while (number > 0) {
            int digit = number % 10;
            if (digit == 0) {
                return true; 
            }
            number /= 10; 
        }
        return false;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DuckNumber duckNumber = new DuckNumber();
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
         
        if (number > 0 && duckNumber.isDuckNumber(number)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }

        scanner.close();
    }
}
