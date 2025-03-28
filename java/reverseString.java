public class reverseString{
    public static String Reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str="hello";
        System.out.println("Reversed :"+Reverse(str));
    }
}