import java.util.ArrayList;

class Product {
    private String name;
    private int quantity;
    
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }
    
    public int getQuantity() {
        return quantity;
    }
}

class List{
    private ArrayList<Product> productList;

    public List(ArrayList<Product> productList) {
        if (productList != null) {
            this.productList = productList;
        } else {
            this.productList = new ArrayList<>();
        }
    }

    public void display(){
       System.out.println("Shopping List:");
        for (Product product : productList) {
            System.out.println(product.getName() + " - " + product.getQuantity());
        }   

    }

    public void displayProductCount(){
        if(this.productList==null){
            System.out.println(0);
        }else{
            System.out.println(productList.size());
        }
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    
    
}

public class ShoppingList {
   public static void main(String[] args) {
    Product p1 = new Product("mleko", 1);
    Product p2 = new Product("bułki", 2);
    Product p3 = new Product("woda", 3);
    Product p4 = new Product("lizaki", 4);

    List lista = new List(null);
    lista.display();
    lista.displayProductCount();
    lista.addProduct(p1);
    lista.addProduct(p2);
    lista.addProduct(p3);
    lista.display();
    lista.displayProductCount();
    lista.addProduct(p4);
    lista.display();
    lista.displayProductCount();
   }
}