public class bitwise {
    public static void main(String[] args){
        // Bitwise Operators in Java
        int a = 5;  // In binary: 0101
        int b = 3;  // In binary: 0011
        int c = 0b100110;

        // Bitwise AND Operator
        System.out.println("a & b: " + (a & b)); // Output: 1 (0001)

        // Bitwise OR Operator
        System.out.println("a | b: " + (a | b)); // Output: 7 (0111)

        // Bitwise XOR Operator
        System.out.println("c ^ b: " + (c ^ b)); // Output: 57 (111001)

        // Bitwise NOT Operator
        System.out.println("~a: " + (~a)); // Output: -6 (inverts bits)

        // Left Shift Operator
        System.out.println("a << 1: " + (b << 1)); // Output: 6 (0110)

        // Right Shift Operator
        System.out.println("c >> 1: " + (c >> 1)); // Output: 
    }
}
