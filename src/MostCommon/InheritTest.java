package MostCommon;

class Product {

    String name;
    String price;

    public Product(String name, String price){
        this.name = name;
        this.price = price;
    }

    public void displayMsg(){
        System.out.println("Name and Price: "+name + price);
    }
}

class SmartTv extends Product {

    String type;
    public SmartTv(String name, String price, String type) {
        super(name, price);
        this.type = type;
    }
    public void displayMsg(){
        System.out.println("Type: "+type);
    }
}

public class InheritTest{
    public static void main(String[] args) {
        Product product = new Product("Apple","50");
        Product product1 = new SmartTv("LG","10K","Portable");

        product.displayMsg();
        product1.displayMsg();
    }
}
