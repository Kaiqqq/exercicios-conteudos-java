package entities;

import entities_enum.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItems(OrderItem items) {
        this.items.add(items);
    }

    public void removeItems(OrderItem items) {
        this.items.remove(items);
    }

    public Double total() {
        double total = 0;
        for (OrderItem c : items) {
            total += c.subTotal();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Order items:\n");

        for (OrderItem c : items) {
            sb.append(c.getProduct().getName() + ", $" + String.format("%.2f", c.getPrice())
                    + ", Quantity: " + c.getQuantity() + ", Subtotal: " + String.format("%.2f", c.subTotal()) + "\n");
        }

        return sb.toString();
    }

}
