import java.util.Scanner;

class TechNumber {
     
    public boolean isTechNumber(int number) {
         
        if (number < 1000 || number > 9999) {
            return false;  
        }

         
        int firstHalf = number / 100;  
        int secondHalf = number % 100;  

         
        int sum = firstHalf + secondHalf;
        return (sum * sum) == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TechNumber techNumber = new TechNumber();
        
        System.out.print("Enter a 4-digit number to check if it is a Tech Number: ");
        int number = scanner.nextInt();
        
        if (techNumber.isTechNumber(number)) {
            System.out.println(number + " is a Tech Number.");
        } else {
            System.out.println(number + " is not a Tech Number.");
        }

        scanner.close();
    }
}
