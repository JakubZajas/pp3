public class DuringClass1 {
    public static void main(String[] args) {
        Processor p1 = new Processor("2,4GHZ", "Intel i7-9100");
        Computer c1 = new Computer(16, 2,p1);

        System.out.println("Computer processor: " + c1.getRAM());
        System.out.println("Processor model: " + c1.getProcessor().getName());

        // Call methods
        c1.turnOn();
        System.out.println(c1.isOn());
        c1.turnOff();       
        System.out.println(c1.isOn());
    }
}
