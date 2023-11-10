public class Counter {
    private int counter=0;

    public void increase(){
        counter++;
    }
    public void decrease(){
        counter--;
    }
    public void increase(int n){
        counter+=n;
    }
    public void decrease(int n){
        counter-=n;
    }
    public int value(){
        return counter;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase();
        c.increase();
        c.increase();
        System.out.println(c.value());   
        c.decrease();   
        System.out.println(c.value());   
        c.increase(10);
        System.out.println(c.value()); 
        c.decrease(5);
        System.out.println(c.value()); 

    }
}
