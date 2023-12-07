class Customer{
        private String name;
        private int age;

        public Customer(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

class Seller{
        private String name;
        private String companyType;

        public Seller(String name, String companyType) {
            this.name = name;
            this.companyType = companyType;
        }
    }

class PurchesedProduct{
        private String name;
        private int id;
        private int cuantity;
        private float pricePerUnit;

        public PurchesedProduct(String name, int id, int cuantity, float pricePerUnit) {
            this.name = name;
            this.id = id;
            this.cuantity = cuantity;
            this.pricePerUnit = pricePerUnit;
        }
        public String getName() {
            return name;
        }
        public int getId() {
            return id;
        }
        public int getCuantity() {
            return cuantity;
        }
        public float getPricePerUnit() {
            return pricePerUnit;
        }


        public double calculatePrice(int number,double price){
            return price*number;
        }
    }

public class SalesSystem {

    public static void main(String[] args) {
         
        Seller seller = new Seller("ABC", "sklep meblowy");
    
      
        Customer customer = new Customer(null, 0);   

        PurchesedProduct product = new PurchesedProduct("mleko", 10, 3, 4);
        double totalPrice = product.calculatePrice(product.getCuantity(),product.getPricePerUnit());

        System.out.println();
        System.out.println("Product Info: Product ID - " + product.getId() +
                   ", Name - " + product.getName() +
                   ", Quantity - " + product.getCuantity() +
                   ", Price per Unit - $" + product.getPricePerUnit() +
                   ", Total Price - $" + totalPrice);
        }
    }

