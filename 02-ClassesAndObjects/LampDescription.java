public class LampDescription {
    boolean isOn=false;

    void turnOff(){
        isOn=false;
    }
    void turnOn(){
        isOn = true;
    }
    void display(){
        System.out.println("lamp is "+((isOn)? "on":"off"));
    }
}
