public class lab13 {
    public static void main(String[] args){
        try {
            int a = 10, b = 0;
            int result = a / b; // This will throw ArithmeticException

                String str = null;
                System.out.println(str.length()); // This will throw NullPointerException
            
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            System.out.println("Finally block is executed.");
        }
    }
    
}
