public class Time {
    int hours;
    int minutes;
    public static void main(String[] args){

        Time t1 = new Time(15, 47);
        System.out.println(t1.display());
        System.out.println(t1.minFromMidnight());

        // int hours=14,min=47;
        // System.out.println(hours+":"+min);
        // System.out.println("minutes from midnight: "+(hours*60+min));
        // System.out.println("seconds from midnight: "+(hours*3600+min*60));
    }
    
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
    public String minFromMidnight(){
        int value=hours*60+minutes;
        String text="minutes from midnight: ";
        return text+value;
    }

    public String display(){
        return String.format("%d:%d",hours,minutes);
    }
}
