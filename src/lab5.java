import java.util.Scanner;
public class lab5 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int evenSum = 0; 
            int oddSum = 0;
            for(int i = 0; i <= 100; i++){
                if (i % 2 == 0)  evenSum += i;

                else oddSum += i;
            }
            System.out.println("Even Sum: " + evenSum);
            System.out.println("Odd Sum: " + oddSum);
        }
        
    }
}
