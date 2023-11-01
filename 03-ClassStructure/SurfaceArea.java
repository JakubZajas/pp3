public class SurfaceArea {
    public static double circle(double r){
        return Math.PI*r*r;
    }
    public static float rectangle(float a, float b){
        return a*b;
    } 
    public static double triangle(double a, double h){
        return (a*h)/2;
    }
    public static double cuboid(double a,double b,double c){
        return 2*(a*b+a*c+b*c);
    }
    public static double sphere(double r){
        return 4*Math.PI*r*r;
    }
    public static double cone(double r,double l){
        return Math.PI*r*r + Math.PI*r*l;
    }
    public static void main(String[] args) {
        System.out.print("Rectangle area (5,2) is ");
        System.out.println(rectangle(5,2));
        System.out.print("Triangle area (5,2) is ");
        System.out.println(triangle(5,2));
        System.out.print("Circle area with r=5 is ");
        System.out.println(circle(5));
        System.out.print("Sphere area with r=5 is ");
        System.out.println(sphere(5));
        System.out.print("Cone area with r=5 ,l=5 is ");
        System.out.println(cone(5,5));
        System.out.print("Cuboid area (2,4,2) is ");
        System.out.println(cuboid(2,4,2));
    }
}

