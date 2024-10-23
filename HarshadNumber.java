import java.util.Scanner;

class HarshadNumber {
     
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; 
            number /= 10;        
        }
        return sum;
    }

     
    public boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
    
        return number % sum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HarshadNumber harshadNumber = new HarshadNumber();
        
        System.out.print("Enter a number to check if it is a Harshad Number: ");
        int number = scanner.nextInt();
        
        if (harshadNumber.isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        scanner.close();
    }
}
