public class loopwhile {
    public static void main(String[] args){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int i = 0;
        System.out.println("List of first " + primes.length + " prime numbers:");
        int count = 1;
        while (i<primes.length){
            System.out.println(count + ". " + primes[i]);
            count++;
            i++;
        }
    }
}
