public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean isAdult(){
        return age>=18;
    }

    @Override
    public String toString() {
        return name + "," + age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
        Person p1 = new Person("Alice",21);
        System.out.println(p1.getAge());
        System.out.println(p1.isAdult());
        p1.setAge(15);
        System.out.println(p1.isAdult());
        System.out.println(p1);
    }
}
