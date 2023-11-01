public class Clock {
    int hour;
    int minute;

    int alarmHour;
    int alarmMinute;

    Clock(){
        minute=00;
        hour=00;
    }

    Clock(int hour,int minute){
        if(hour>=0 && hour<=23){
            this.hour=hour;
        }else{
            System.out.println("Wrong hour");
        }
        if(minute>=0 && minute<=59){
            this.minute=minute;
        }
    }

    public void setClock(int hour,int minute){
        if(hour>=0 && hour<=23){
            this.hour=hour;
        }else{
            System.out.println("Wrong hour");
        }
        if(minute>=0 && minute<=59){
            this.minute=minute;
        }
    }
    public void setClock(){
        minute=00;
        hour=00;
    }

    public void displayTime(){
        String time=String.format("%02d:%02d", hour, minute);
        System.out.println(time);
    }
    public void addOneMinute(){
        minute++;
        if(minute==60){
            minute=0;
            hour++;
            if(hour==24){
                hour=00;
            }
        }
        if (hour == alarmHour && minute == alarmMinute) {
            runAlarm();
        }
    }
    
    public void setAlarm(int hour, int minute){
        this.alarmHour=hour;
        this.alarmMinute=minute;
    }
    public void runAlarm(){
        if(hour==alarmHour && minute==alarmMinute){
            System.out.println("beep-beep-beep-beep !!" );
        }
    }

    public static void main(String[] args){
        Clock clock1= new Clock(12, 47);
        clock1.setAlarm(23,59);

        // clock1.displayTime();
        // clock1.setClock(18,14);
        // clock1.displayTime();
        // clock1.setClock(9,3);
        // clock1.displayTime();
        clock1.setClock(23,58);
        clock1.displayTime();

        clock1.addOneMinute();
        clock1.displayTime();

        clock1.addOneMinute();
        clock1.displayTime();
    }
}
