import java.util.Scanner;
// public class stringcompare{
//     public static void main(String[] args) {
//         String s1="hello";
//         String s2="hello";
//         System.out.println(s1.equals(s2));
//     }
// }
public class stringcompare{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1=sc.nextLine();
        System.out.println("Enter the string");
        String s2=sc.nextLine();
        if(s1.equals(s2)){
            System.out.println("Strings are equals");
        }else{
            System.out.println("String are not equals");
        }
    }
}