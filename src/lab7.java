import java.util.Scanner;
public class lab7 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out. println("Enter number of elements:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                System.out.println("Enter element"+ (i+1) +":");
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println("Sum: "+ sum);
        }
    }
}
