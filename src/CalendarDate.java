import java.util.GregorianCalendar;
public class CalendarDate {
    public static void main(String[] args) {
        GregorianCalendar obj = new GregorianCalendar();
        boolean isLeap = obj.isLeapYear(2020);;
        System.out.println("Year : " + obj.get(GregorianCalendar.YEAR));
        System.out.println("Month : " + (obj.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Month : " + obj.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Second : " + obj.get(GregorianCalendar.SECOND));
        System.out.println("Minute : " + obj.get(GregorianCalendar.MINUTE));
        System.out.println("Week : " + obj.get(GregorianCalendar.WEEK_OF_MONTH));




        System.out.println(isLeap);
    }
}
