package tasks;

import java.util.Scanner;

public class ProductMain {

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;

        for (Product p : products) {
            total = total + (p.price * p.quantity);
        }
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[5];

        // a) Accept details of five products
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1));

            System.out.print("Product ID: ");
            int pid = sc.nextInt();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // b) Find product with highest price
        double maxPrice = products[0].price;
        int maxPid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }

        System.out.println("\nProduct ID with highest price: " + maxPid);

        // c) Calculate total amount spent
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        sc.close();
    }
}
