public class RectanglesDescription {
    int a;
    int b;
    
    void displayDimensions(){
        System.out.println(a+"x"+b);
    }
    void displayPerimeter(){
        int perimeter=2*a + 2*b;
        System.out.println("Perimeter = "+perimeter);
    }
    void displayArea(){
        int area= a*b;
        System.out.println("Area = "+area);
    }

    public static void main(String[] args){
        RectanglesDescription r1 = new RectanglesDescription();
        r1.a=5;
        r1.b=7;
        r1.displayDimensions();
        r1.displayPerimeter();
        r1.displayArea();
    }
}
