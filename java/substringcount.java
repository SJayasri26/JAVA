public class substringcount {
    public static int countstring(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                count++;
            }
        }return count;
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(" to count the substring :" +countstring(s));
    }
}
