public class Student {
    String name;
    int age;
    String id;
    Boolean validId;
    int semester;
    double avgGrade;   

    void sayHello(){
            System.out.println("Hello from "+ name);
    }
    void displayName(){
        System.out.println("My name is "+name);
    }
    void displayAge(){
        System.out.println("My age is "+age);
    }
    void displayStudentInfo(){
        System.out.println("Hello my name is "+name+". Im on "+semester+
        " semester and my average grade is "+avgGrade);
    }
    void CardValid(){
        validId=true;
        System.out.println("Is id valid: "+validId);
    }
    void CardInvalid(){
        validId=false;
        //System.out.println("Is id valid: "+validId);
    }
    void ChangeValid(){
        validId= !validId;
    }
    void StudentStatus(){
        System.out.println(name+" "+id+" "+((validId)? "Valid":"Invalid"));
    }
}