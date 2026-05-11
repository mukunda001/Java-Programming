import java.util.Scanner;
public class lab4 {
public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      System.out.println("Enter a number: ");
      int number = sc.nextInt();
         int sum = 0;
      while(number != 0){
        sum += number % 10;
        number /= 10;
      }
       System.out.println("Sum of digits = " + sum);
    }
}
    
}
