public class logical_op {
    public static void main(String[] args){
        // Logical Operators in Java
        boolean a = (5>2);
        boolean b = (2>5);  
        // Logical AND Operator
        System.out.println("a && b: " + (a && b)); // false
        // Logical OR Operator
        System.out.println("a || b: " + (a || b)); // true
        // Logical NOT Operator
        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true  
    }
    
}
