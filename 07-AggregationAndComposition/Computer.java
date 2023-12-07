public class Computer{
    private boolean isOn=false;
    private int RAM;
    private int storage;
    private Processor processor;

    
    public void turnOn(){
        this.isOn=true;
    }
    public void turnOff(){
        this.isOn=false;
    }
    public Computer(int rAM, int storage, Processor processor) {
        RAM = rAM;
        this.storage = storage;
        this.processor = processor;
    }
    public boolean isOn() {
        return isOn;
    }
    public int getRAM() {
        return RAM;
    }
    public int getStorage() {
        return storage;
    }
    public Processor getProcessor() {
        return processor;
    }
    
    

}