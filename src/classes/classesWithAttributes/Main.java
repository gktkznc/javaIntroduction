package classes.classesWithAttributes;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus",3000,2,"Siyah");

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getName());
        System.out.println(product.getCode());
    }
}
