import java.util.*;
public class lab8 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter " + n + " integers:");
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.println("Ascending: " + Arrays.toString(arr));
            System.out.print("Descending: " );
            for(int i = n-1; i>=0 ; i--) System.out.print(arr[i] + " ");
        }
    }
} 
      