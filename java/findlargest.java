public class findlargest {
    public static String maxlargest(String[] strings){
        String largest = " ";
        for(String str :strings){
            if(str.length()>largest.length()){
                largest=str;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String [] strings={"apple","banaba","melon"};
        System.out.println("The string with maximum : "+maxlargest(strings));
        System.out.println("Length of the string : " +maxlargest(strings).length());
    }
}
