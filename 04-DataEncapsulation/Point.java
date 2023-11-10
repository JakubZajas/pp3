public class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean isX(){
        if(x==0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isY(){
        if(y==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    @Override
    public String toString() {
        return "P(" + x + "," + y + ")";
    }
    public static void main(String[] args) {
        Point p = new Point(3,0);
        System.out.println(p.isX());
        System.out.println(p.isY());
        System.out.println(p);

    }
    
}
