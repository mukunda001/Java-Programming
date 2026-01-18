import java.util.Scanner;
public class decisionswitch2 {
    public static void main(String[] args){
      try(Scanner S = new Scanner(System.in)){
        System.out.println("Enter the name of the day in week: ");
        String day = S.nextLine();
        System.out.println("You have entered the day name as " +day.toLowerCase());

       String result = switch(day.toLowerCase())
       {
        case "sunday", "monday", "tuesday", "wednesday", "thursday" -> "It is a weekday.";
        case "friday", "saturday" -> "It is a weekend.";
        default -> "Invalid day name! Please enter a valid day.";
        };

         System.out.println(result);
      }
    }
}
