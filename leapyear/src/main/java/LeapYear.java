public class LeapYear {
    public static void main(String[] args) {
        int year = 2019;
        boolean isItLeapYear = (year%4==0 && year%100>0) || (year%400==0);

        if (isItLeapYear) {
            System.out.println(year + " " + "to rok przestępny.");
        } else {
            System.out.println(year + " " + "nie jest rokiem przestępnym.");
        }
    }
}