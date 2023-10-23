public class studentInfo {
    public static void main(String[] args) {
        String name = "Jakub";
        String surname = "Zajas";
        int age = 20;
        String studentId = "123456";
        boolean isFirstYearStudent = false;
        String fieldOfStudy = "Applied Informatics";
        String universityName = "Uniwersytet Ekonomiczny w Krakowie";

        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("First-Year Student: " + (isFirstYearStudent ? "Yes" : "No"));
        System.out.println("Field of Study: " + fieldOfStudy);
        System.out.println("University: " + universityName);
    }
}
