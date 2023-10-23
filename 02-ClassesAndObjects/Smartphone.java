public class Smartphone {
    String number="123456789";
    String nrKierunkowy = "+48";
    String model = "Nokia 3310";
    boolean isOn = false;
    int volume = 5;

    void turnOnOff(){
        isOn=!isOn;
        System.out.println(isOn);
    }
    void volumeUp(){
        if(volume<10){
            volume+=1;    
        System.out.println(volume);
        }
    }
    void volumeDown(){
        if(volume>0){
            volume-=1;
        System.out.println(volume);
        }
    }
}
