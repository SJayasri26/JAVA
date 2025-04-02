import java.util.Arrays;

public class anagram {
    public static boolean areanageam(String s1,String s2){
        s1=s1.replaceAll("\\s"," ").toLowerCase();
        s2=s2.replaceAll("\\s"," ").toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] charArray1=s1.toCharArray();
        char[] charArray2=s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        String s1="hlo";
        String s2="olh";
        if(areanageam(s1, s2)){
        System.out.println("The strings are anagrams");
        }
        else{System.out.println("The Strings are not anagrams");}
    }
}
