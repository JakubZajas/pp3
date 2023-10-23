public class Lamp {
    public static void main(String[] atgs){
        LampDescription l1 =new LampDescription();
        l1.turnOn();
        l1.display();

        LampDescription l2 =new LampDescription();
        l2.turnOff();
        l2.display();
    }
}
