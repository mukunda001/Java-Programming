import java.util.Scanner;

public class arithmetic 
{  public static void main(String[] args) {
try(Scanner sc = new Scanner(System.in)) {

System.out.print("Enter two numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println("Sum = " + (a + b));
System.out.println("Product = " + (a * b));
System.out.println("Quotient = " + (a / b));
System.out.println("Remainder = " + (a % b));
System.out.println("Average = " + ((a + b) / 2.0));
}
}}
