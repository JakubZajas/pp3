public class Time {
    public static void main(String[] args){
        int hours=14,min=47;
        System.out.println(hours+":"+min);
        System.out.println("minutes from midnight: "+(hours*60+min));
        System.out.println("seconds from midnight: "+(hours*3600+min*60));
    }
}
