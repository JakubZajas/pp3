public class Clock {
    private int hour;
    private int minute;


    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }


    public Clock(int hour, int minute) {
        if(hour>=0 && hour<=23){
            this.hour = hour;
        }
        if(minute>=0 && minute<=59){
            this.minute = minute;
        }
    }

    public void addMinute(){
        minute++;
        if(minute>=60){
            minute=0;
            hour++;
            if(hour>=24){
                hour=0;
            }
        }
    }
    


    @Override
    public String toString() {
        return "Clock [hour=" + hour + ", minute=" + minute + "]";
    }
    public static void main(String[] args) {
        Clock c = new Clock(23,58);
        System.out.println(c.getHour());
        System.out.println(c.getMinute());
        System.out.println(c);
        c.addMinute();
        c.addMinute();
        System.out.println(c.getHour());
        System.out.println(c.getMinute());
        System.out.println(c);
        c.addMinute();
        System.out.println(c.getHour());
        System.out.println(c.getMinute());
        System.out.println(c);

    }
    
}
