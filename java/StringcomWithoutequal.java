public class StringcomWithoutequal {
    public static void main(String[] args) {
        String st1="hello";
        String st2="hello";
        boolean areEqual=compareString(st1,st2);
        if(areEqual){
            System.out.println("The Strings are equal");
    }else{
        System.out.println("The strings are not equal");
    }
    }
    public static boolean compareString(String s1,String s2){
        if(s1.length() !=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
