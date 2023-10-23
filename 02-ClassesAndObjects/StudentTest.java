public class StudentTest {
    public static void main(String[] args){
        Student s = new Student();
        s.name= "Peter";
        s.age= 21;
        //System.out.println(s.name+ " "+ s.age);

        Student s2 = new Student();
        s2.name="John";s2.age=25;
        //s2.sayHello();

        Student s3 = new Student();
        s3.name="Alice";s3.age=23;
        //s3.sayHello();

        Student s4 = new Student();
        s4.name="Timmon";s4.age=21;s4.id="123456";s4.validId=true;s4.semester=3;s4.avgGrade=4.3d;
        s4.displayStudentInfo();
        s4.CardInvalid();
        s4.StudentStatus();
        s4.CardValid();
        s4.StudentStatus();
        
        Student s5 = new Student();
        s5.name="Jonathan";s5.age=24;s5.id="987654";s5.validId=false;s5.semester=5;s5.avgGrade=2.3d;
        s5.ChangeValid();
        s5.StudentStatus();
    }
}
