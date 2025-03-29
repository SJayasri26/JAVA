public class palindromereverse {
    public static void main(String[] args) {
        String str ="madan";
        String reversed=new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
}
