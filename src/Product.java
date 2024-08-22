abstract class Product {
    protected String productID;
    protected double price;

    Product(String productID, double price) {
        this.productID = productID;
        this.price = price;
    }

    abstract void applyDiscount(double percentage);
    abstract void applyTax(double percentage);


    public void Compare() {

    }

    public static void main(String[] args) {
        Product[] product = new Product[2];

    }
}
class Electronics extends Product {
    int warrantyPeriod;
    public void applyDiscount(double percentage, int warrantyPeriod) {
        System.out.println("New price after discount: " + percentage + "%");
    }
    public void applyTax(double percentage) {
        System.out.println();
    }
}

 class Clothing extends Product {
    String size;
    public void applyDiscount(double percentage) {
        System.out.println();
    }
    public void applyTax(double percentage) {
        System.out.println();
    }
}

