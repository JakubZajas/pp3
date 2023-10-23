public class Calculate {
    public static void main(String[] args){
        int heightInCm=170;
        int feets=(int)(heightInCm/30.48);
        int inches= (int)(heightInCm%30.48/2.54);
        System.out.println(feets+"."+inches+" feets");
    }
}
