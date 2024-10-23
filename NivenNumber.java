import java.util.Scanner;

class NivenNumber {
     
    public int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;  
            number /= 10;        
        }
        return sum;
    }

     
    public boolean isNivenNumber(int number) {
        int sum = sumOfDigits(number);
         
        return number % sum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NivenNumber nivenNumber = new NivenNumber();
        
        System.out.print("Enter a number to check if it is a Niven Number: ");
        int number = scanner.nextInt();
        
        if (nivenNumber.isNivenNumber(number)) {
            System.out.println(number + " is a Niven Number.");
        } else {
            System.out.println(number + " is not a Niven Number.");
        }

        scanner.close();
    }
}
