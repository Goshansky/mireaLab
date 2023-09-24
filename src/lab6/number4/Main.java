package lab6.number4;

public class Main {
    public static void main(String[] args) {
        Priceable product = new Product("Laptop", 999.99);
        Priceable service = new Service("Plumbing", 75.0);

        System.out.println("Product price: $" + product.getPrice());
        System.out.println("Service price: $" + service.getPrice());

        System.out.println(product);
        System.out.println(service);
    }
}
