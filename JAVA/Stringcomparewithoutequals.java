public class Stringcomparewithoutequals {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        boolean areEqual=compareStrings(s1,s2);
        if(areEqual){
            System.out.println("The string are equal");
        }else{
            System.out.println("String are not equal");
        }
    }
    public static boolean compareStrings(String str1, String str2){
        if(str1.length() != str2.length())
        {
        return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) !=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
