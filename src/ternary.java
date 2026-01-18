public class ternary {
    public static void main(String[] args){
        // Ternary Operator in Java
        int a = 10;
        int b = 20;
        int c = 22, result;
        // Using Ternary Operator to find the maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("The maximum value is: " + max); // 20
        // Using Ternary Operator to find the maximum of three numbers
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);

        // result = (a > b) 
        //     ? ((a > c) ? a : c)  // Inner ternary 1
        //     : ((b > c) ? b : c); // Inner ternary 2

        System.out.println("Max of three numbers = "+ result);
    }
}
