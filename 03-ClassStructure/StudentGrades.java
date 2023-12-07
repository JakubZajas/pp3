import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    StudentGrades(String name,int numberOfGrades){
        this.studentName=name;
        double[] grades=new double[numberOfGrades];
        Random random = new Random();
        for(int i=0;i<numberOfGrades;i++){
            grades[i]=random.nextDouble(2,6);
        }
        this.grades=grades;
    }
    StudentGrades(String name){
        this.studentName=name;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();

        double[] enteredGrades = new double[numberOfGrades];

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            scanner.nextLine();
            enteredGrades[i] = scanner.nextDouble();
        }
        this.grades=enteredGrades;
        scanner.close();

    }
    public double lowestGrade(double[] grades){
        double lowest=grades[0];
        for(double i:grades){
            if(i<lowest){
                lowest=i;
            }
        }
        return lowest;
    }
    public double highestGrade(double[] grades){
        double highest=grades[0];
        for(double i:grades){
            if(i>highest){
                highest=i;
            }
        }
        return highest;
    }
    public int numberOfGrades(double[] grades){
        return grades.length;
    }
    public double gradePointAverage(double[] grades){
        double avg=0;
        for(double i:grades){
            avg+=i;
        }
        return avg/grades.length;
    }
    public void displayStudent(){
        System.out.println(studentName);
        System.out.print("Grades: ");
        for(double i:grades){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(numberOfGrades(grades));
        System.out.println(highestGrade(grades));
        System.out.println(lowestGrade(grades));
        System.out.println(gradePointAverage(grades));
    }
    public static void main(String[] args){
        // double[] g1={3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        // StudentGrades Amanda= new StudentGrades("Amanda",g1);
        // Amanda.displayStudent();

        // System.out.println();

        // double[] g2={2.0, 3.0, 2.0, 4.5, 4.5};
        // StudentGrades James= new StudentGrades("James", g2);
        // James.displayStudent();

        // StudentGrades John= new StudentGrades("John", 6);
        // John.displayStudent();
        StudentGrades Johnny = new StudentGrades("Johnny");
        Johnny.displayStudent();
     }
}



