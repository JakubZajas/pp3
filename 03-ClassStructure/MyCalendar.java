public class MyCalendar {
    static int year=2023;
    static  int month=4;
    static int day=9;
     public static String myDate(){
        return String.format("%04d-%02d-%02d", year,month,day);
     }
     public static void main(String[] args){
        System.out.println(MyCalendar.myDate());
        System.out.println(days());
        System.out.println(monthName());
     }
     public static int days(){
        int daysPassed=0;
        int[] monthDays={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int days=0;days<month-1;days++){

            daysPassed+=monthDays[days];
        }
        daysPassed+=day;
        return daysPassed;
     }
     public  static  String monthName(){
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[month-1];
     }
}
