public class InternetDevice {
    String name;
    boolean connected=false;
    static int connectedDevices=0;
    public InternetDevice(String name){
        this.name=name;
    }
    public void connect(){
        if(!connected){
            connected=true;
            connectedDevices++;
        }

    }
    public void disconnect(){
        if(connected){
            connected=false;
            connectedDevices--;
        }
    }
    public boolean isConnected(){
        System.out.println(connected);
        return connected;
    }
    public void displayStatus(){
        String status="";
        status+=name+" "+connected+" ";   
        System.out.println(status);
    }
    public static void displayConenctions(){
        System.out.println(connectedDevices);
    }
    public static void main(String[] args){
        InternetDevice device1= new InternetDevice("Samsung");
        device1.connect();
        device1.connect();
        device1.connect();
        device1.isConnected();
        InternetDevice device2= new InternetDevice("iPhone");
        device2.connect();
        device2.isConnected();
        InternetDevice device3= new InternetDevice("Razer");
        device3.connect();
        device3.isConnected();
        InternetDevice device4= new InternetDevice("Motorola");
        device4.disconnect();
        device4.isConnected();
        InternetDevice device5= new InternetDevice("Toschiba");
        device5.isConnected();

        displayConenctions();

    }
}
