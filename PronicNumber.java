import java.util.Scanner;

class PronicNumber {
     
    public boolean isPronicNumber(int number) {
        for (int i = 0; i <= number; i++) {
            if (i * (i + 1) == number) {
                return true;  
            }
        }
        return false;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PronicNumber pronicNumber = new PronicNumber();
        
        System.out.print("Enter a number to check if it is a Pronic Number: ");
        int number = scanner.nextInt();
        
        if (pronicNumber.isPronicNumber(number)) {
            System.out.println(number + " is a Pronic Number.");
        } else {
            System.out.println(number + " is not a Pronic Number.");
        }

        scanner.close();
    }
}
