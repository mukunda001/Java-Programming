import java.util.*;
public class decisionswitch {
    public static void main(String[] args){
       try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the number of day in the week:");
        int day = sc.nextInt();
        System.out.print("You have entered the day number: " + day + "\n");
        switch(day){
            case 1:
                System.out.println(" It is Sunday.");
                break;
            case 2:
                System.out.println(" It is Monday.");
                break;
            case 3:
                System.out.println(" It is Tuesday.");
                break;
            case 4:
                System.out.println(" It is Wednesday.");
                break;
            case 5:
                System.out.println(" It is Thursday.");     
                break;
            case 6:
                System.out.println(" It is Friday.");
                break;
            case 7: 
                System.out.println(" It is Saturday.");
                break;  
            default:
                System.out.println(" Invalid day number! Please enter a number between 1 and 7.");
        }
    }
    }
}
