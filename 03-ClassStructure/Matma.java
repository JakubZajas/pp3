public  class Matma{
    public static int maximum(int a,int b){
        return Math.max(a,b);
    }
    public static double pi(){
        return Math.PI;
    }
    public static int absolute(int a){
        return Math.abs(a);
    }
    public static double squareRoot(double a,double b){
        double value=a/b;
        return Math.sqrt(value);
    }
    public static double baseRandom(){
        return Math.random();
    } 
    public static int randomRange(){
        int randomNum = (int)(Math.random() * 11);  
        return randomNum;
    }
    public static double sinus(double degrees){
        double value=degrees*(Math.PI/180);
        return Math.sin(value);
    } 
    public static void main(String[] args){
        System.out.println(Matma.maximum(34,39));
        System.out.println(Matma.pi());
        System.out.println(Matma.absolute(-17));
        System.out.println(Matma.squareRoot(9,2));
        System.out.println(Matma.baseRandom());
        System.out.println(Matma.randomRange());
        System.out.println(Matma.sinus(90));
    }
 }