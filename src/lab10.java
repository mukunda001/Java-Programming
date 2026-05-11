import java.util.Scanner;
public class lab10 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int a[][] = new int[2][2];
            int b[][] = new int[2][2];
            int product[][] = new int[2][2];
            System.out.println("Enter matrix A:");
            for(int i = 0; i < 2; i++)
                for(int j = 0; j < 2; j++)
                    a[i][j] = sc.nextInt();

            System.out.println("Enter matrix B: ");
            for(int i = 0; i < 2; i++)
                for(int j = 0; j < 2; j++)
                    b[i][j] = sc.nextInt();

            for(int i = 0; i < 2; i++)
                for(int j = 0; j < 2; j++)
                    for (int k = 0; k < 2; k++)
                    product[i][j] = a[i][k] * b[k][j];

        System.out.println("Product Matrix: ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++)
                System.out.print(product[i][j] + " ");
                System.out.println();

                }   
            }
    }
    
}
