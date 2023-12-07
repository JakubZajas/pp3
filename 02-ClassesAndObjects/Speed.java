public class Speed {
    private int speed;
    public static void main(String[] args){
    Speed s1 = new Speed(150);
    System.out.println(s1.validSpeed());
    Speed s2 = new Speed(100);
    System.out.println(s2.validSpeed());
} 


    public Speed(int speed) {
        this.speed = speed;
    }


    public String validSpeed(){
        String valid= "Speed is valid: ";
        if(speed>=40 && speed<=140){
            return valid+true;
        }else{
            return valid+false;
        }
    }
}
