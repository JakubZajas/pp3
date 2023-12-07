public class Counter {
    private int counter=0;

    public static void main(String[] args) {
        Counter o = new Counter();
        System.out.println(o.value());
        o.increase();
        o.increase();
        o.decrease();
        o.increase(5);
        o.decrease(2);
        System.out.println(o.value());
    }

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

    
}

