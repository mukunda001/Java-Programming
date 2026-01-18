// public In Java, jump statements are used to alter the normal flow of program execution 
// when certain conditions are met. They can be used to terminate a loop, skip an iteration,
//  or exit from a method or block of code. 
    
public class continuejump{
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("Requirednumbers from the array:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 || numbers[i]%5 == 0) {  
                continue; // Skip even numbers or multiples of 5
            }
            System.out.println(numbers[i]);
        }
    }

}
