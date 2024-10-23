import java.util.Scanner;

class DudeneyNumber {
     
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;  
            number /= 10;       
        }
        return sum;
    }

     
    public boolean isDudeneyNumber(int number) {
        
        int cubeRoot = (int) Math.round(Math.cbrt(number));

        
        if (cubeRoot * cubeRoot * cubeRoot != number) {
            return false;  
        }

        
        int sum = sumOfDigits(number);
        return sum == cubeRoot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DudeneyNumber dudeneyNumber = new DudeneyNumber();
        
        System.out.print("Enter a number to check if it is a Dudeney Number: ");
        int number = scanner.nextInt();
        
        if (dudeneyNumber.isDudeneyNumber(number)) {
            System.out.println(number + " is a Dudeney Number.");
        } else {
            System.out.println(number + " is not a Dudeney Number.");
        }

        scanner.close();
    }
}
