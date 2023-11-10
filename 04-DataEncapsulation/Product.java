public class Product {
    private String name;
    private boolean isVegeterian;
    
    public Product(String name, boolean isVegeterian) {
        setName(name);
        setVegeterian(isVegeterian);
    }
    
    public Product() {
    }
    
    @Override
    public String toString() {
        return "Product name=" + name + " Vegeterian=" + isVegeterian ;
    }



    public String getName() {
        return name;
    }
    public boolean isVegeterian() {
        return isVegeterian;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVegeterian(boolean isVegeterian) {
        this.isVegeterian = isVegeterian;
    }
    public static void main(String[] args) {
        Product mleko = new Product();
        mleko.setName("mleko");
        mleko.setVegeterian(false);
        Product p2 = new Product();
        p2.setName("japko");
        p2.setVegeterian(true);

        System.out.println(mleko);
        System.out.println(p2);

    }

}
