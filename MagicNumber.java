import java.util.Scanner;

class MagicNumber {
    public boolean isMagicNumber(int number){
       int sum = 0;

       while(number > 0 || sum > 9){
        if(number == 0){
            number = sum;
            sum =0;
        }

        sum+= number % 10;
        number /= 10;
       }

       return sum== 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MagicNumber magicNumber = new MagicNumber();

        System.out.print("Enter a number to check if it is a Magic Number: ");
        int number = sc.nextInt();
        
        if (magicNumber.isMagicNumber(number)) {
            System.out.println(number + " is a Magic Number.");
        } else {
            System.out.println(number + " is not a Magic Number.");
        }

        sc.close();
    }
}
