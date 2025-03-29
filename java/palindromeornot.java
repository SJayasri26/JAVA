import java.util.Scanner;

public class palindromeornot {
    public static boolean isPalindrome (String str) {
        int left =0;
        int right=str.length() -1;
        while (left<right) {
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String s=sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }
    }
}
