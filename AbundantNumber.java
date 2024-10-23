import java.util.Scanner;

class AbundantNumber {
     
    public boolean isAbundantNumber(int number) {
        int sum = 0;

          
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;  
            }
        }

    
        return sum > number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbundantNumber abundantNumber = new AbundantNumber();
        
        System.out.print("Enter a number to check if it is an Abundant Number: ");
        int number = scanner.nextInt();
        
        if (abundantNumber.isAbundantNumber(number)) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        scanner.close();
    }
}
