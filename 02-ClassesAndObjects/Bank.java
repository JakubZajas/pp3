public class Bank {
    public static void main(String[] args){
        float euroBuy= 4.5940f;
        float euroSell = 4.6250f;
        float spread = euroSell - euroBuy;
        System.out.printf("spread: %.4f%n",spread);
    }
}
