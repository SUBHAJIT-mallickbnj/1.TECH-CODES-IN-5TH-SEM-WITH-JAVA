import java.util.Scanner;

class HarshadMagicNumber {
     
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

    
    public boolean isMagicNumber(int number) {
        int sum = sumOfDigits(number);

         
        while (sum > 9) {
            sum = sumOfDigits(sum);  
        }

         
        return sum == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HarshadMagicNumber hmn = new HarshadMagicNumber();
        
        System.out.print("Enter a number to check if it is a Harshad Magic Number: ");
        int number = scanner.nextInt();
        
         
        if (hmn.isHarshadNumber(number) && hmn.isMagicNumber(number)) {
            System.out.println(number + " is a Harshad Magic Number.");
        } else {
            System.out.println(number + " is not a Harshad Magic Number.");
        }

        scanner.close();
    }
}
