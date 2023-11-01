public class Person {
    String name;
    double weight;
    double height;

    public Person(String name){
        this.name=name;
    }
    public Person(String name,double weight,double height){
        this.name=name;
        this.weight=weight;
        this.height=height;
    }

    public void setWeightAndHeight(double weight,double height){
        this.weight=weight;
        this.height=height;
    }
     public double calculateBMI(){
        double heightInMeters=(height/100);
        double bmi = weight/(heightInMeters*heightInMeters);
        return bmi;
     }
     public void displayRecord(){
        double bmiValue=calculateBMI();
        System.out.println("name: "+name+"\nweight: "+weight+"\nheight: "+height+ "\nBMI: "+bmiValue);
        if(bmiValue>=24.9){
            System.out.println("BMI to high");
        }else if(bmiValue<=18.5){
            System.out.println("BMI to low");
        }else{
            System.out.println("BMI if fine");
        }
        System.out.println("\n");
     }

     public static void main(String[] args){
        Person person1= new Person("Mikolaj", 55, 175);
        Person person2= new Person("Alice", 65, 170);
        Person person3= new Person("Kuba", 85, 180);
        System.out.println("\n");
        person1.displayRecord();
        person2.displayRecord();
        person3.displayRecord();



     }
}
