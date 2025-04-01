public class findsmallest {
    public static String minsmallest(String[]strings){
        String minsmallest=strings[0];
        for(String str:strings){
            if(str.length()<minsmallest.length()){
                minsmallest=str;
            }
        }return minsmallest;
    }
    public static void main(String[] args) {
        String[]strings={"apple","cherry","kivi"};
        System.out.println("The string minimum length : "+minsmallest(strings));
        System.out.println("The string length : "+minsmallest(strings).length());
    }
}
