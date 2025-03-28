import java.util.Scanner;

public class reverseStringsc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");  
        String str=sc.nextLine();
        System.out.println("Reversed "+Reverse(str));
    }
    public static String Reverse(String s){
        StringBuilder sb=new StringBuilder(s).reverse();
        return sb.toString();
        
    }
}
