import java.util.Scanner;
public class lab6 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            int Original = Math.abs(number);
            int temp = Original;
            int reverse = 0;
            
            while(Original != 0){
                reverse = reverse * 10 + temp % 10;
                temp /= 10;
            }
            if (reverse == Original) System.out.println("Palindrome");
            else System.out.println("Not Palindrome");
        }
    }
}
