//Enhanced for loop (for each)
//This loop is used to iterate over arrays or collections.

public class foreachloop {
    public static void main(String[] args){
        String[] languages = {"Python", "Java", "C++", "JavaScript", "Ruby"};
      int count = 1;
      System.out.println("List of programming languages:");
        for (String lang: languages){
            System.out.print(count + ". " + lang);
            count++;
        }
    }
}