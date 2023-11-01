public class Statistics {
    public static int numbersInRange(int x,int y){
        int count=0;
        for(int i=x;i<=y;i++){
            count+=1;
        }
        return count;
    }
    public static double sumOfNumbersInRange(int x,int y){
        double sum=0;
        for(int i=x;i<=y;i++){
            sum+=i;
        }
        return sum;
    }
    public static double meanOfRange(int x,int y){
        double result=0;
        int diff=numbersInRange(x, y);
        for(int i=x;i<=y;i++){
            result+=i;
        }
        return result/diff;
    }

    public static void main(String[] args){
        System.out.println(numbersInRange(5, 10));
        System.out.println(sumOfNumbersInRange(5, 10));
        System.out.println(meanOfRange(5, 10));

    }
}
