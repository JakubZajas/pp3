public class Countes {
    int value=0;

    void inc1(){
        value+=1;
    }
    void inc10(){
        value+=10;
    }
    void dec1(){
        value-=1;
    }
    void dec10(){
        value-=10;
    }
    void display(){
        System.out.println(value);
    }

    public static void main(String[] args){

        Countes c1 = new Countes();
        c1.inc10();
        c1.inc10();
        c1.inc10();
        c1.dec1();
        c1.dec1();
        c1.dec1();
        c1.display();

        Countes c2 = new Countes();
        c2.dec10();
        c2.dec10();
        c2.dec10();
        c2.dec10();
        c2.dec10();
        c2.inc1();
        c2.inc1();
        c2.inc1();
        c2.display();

    }
}
