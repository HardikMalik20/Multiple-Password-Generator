import java.util.*;

public class multiplePasswordGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String ename=sc.nextLine();
        System.out.println("Number of passwords you want to generate: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            password(ename);
        }
        sc.close();
    }

    public static void password(String name){
        String[] nameParts=name.split(" ");
        String firstName=nameParts[0];
        String lastName=nameParts[nameParts.length-1];

        StringBuilder num=new StringBuilder();
        for(char c:firstName.toCharArray()){
            int val=toCharValue(c);
            num.append(val);
        }

        String last3characters=lastName.substring(Math.max(0,lastName.length()-3)).toUpperCase();
        String password=num.toString()+"@"+last3characters;
        System.out.println(password);
        
    }
    //generating random numbers
    public static int toCharValue(char c){
        Random r=new Random();
        int charValue=r.nextInt(10);
        return charValue;
    }
}
