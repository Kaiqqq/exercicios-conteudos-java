package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        sc.nextLine();
        Client client = new Client(name, email, birthDate);

        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();

        System.out.println();
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItems(it);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.print(order);
        System.out.print("Total price: " + order.total());

        sc.close();
    }

}
