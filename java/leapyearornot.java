public class leapyearornot {
    public static void main(String[] args) {
        int year=2004;
        if((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year+" is the year is leap year");
        }
        else{
            System.out.println("the year is not leap year");
        }
    }
}
