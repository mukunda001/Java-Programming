public class breakjump {
    public static void main(String[] args){
     int Numbers[] = {1,2,3,4,5,6,7,8};
        System.out.println("The numbers up to 6 in the array are: ");
        for(int i = 0; i< Numbers.length; i++){
            if (Numbers[i] == 6) break;
            System.out.print(Numbers[i]);
        }
    }
}
