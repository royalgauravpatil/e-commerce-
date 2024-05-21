package E_commerse;

import java.util.Date;

public class Order implements OrderActions {
    private int orderId;
    private int customerId;
    private Date orderDate;
    private String orderStatus;
    private Product[] orderedProducts;

    public Order(int orderId, int customerId, Product[] orderedProducts) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDate = new Date();
        this.orderStatus = "Placed";
        this.orderedProducts = orderedProducts;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Product[] getOrderedProducts() {
        return orderedProducts;
    }

    public String getOrderDetails() {
        return "Order ID: " + orderId + ", Customer ID: " + customerId + ", Order Date: " + orderDate + ", Status: " + orderStatus;
    }

    @Override
    public void placeOrder() {
        System.out.println("Order " + orderId + " placed.");
    }

    @Override
    public void cancelOrder() {
        setOrderStatus("Cancelled");
        System.out.println("Order " + orderId + " cancelled.");
    }

    @Override
    public void trackOrder() {
        System.out.println("Order " + orderId + " is currently " + orderStatus + ".");
    }
}
