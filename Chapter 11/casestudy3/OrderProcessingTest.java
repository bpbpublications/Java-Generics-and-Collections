package com.meennu.javabook.chap11.casestudy3;

public class OrderProcessingTest {
    public static void main(String[] args) {
        CustomerOrderManager manager = new CustomerOrderManager();

        manager.addOrderItem("CUST001", new OrderItem("P1001", "Notebook", 2, 120.0));
        manager.addOrderItem("CUST001", new OrderItem("P1002", "Pen", 5, 10.0));
        manager.addOrderItem("CUST002", new OrderItem("P1003", "Backpack", 1, 750.0));

        for (String customerId : manager.getAllCustomerIds()) {
            System.out.println("Customer ID: " + customerId);
            System.out.println("Total Value: " + manager.getTotalValue(customerId));
            for (OrderItem item : manager.getOrderItems(customerId)) {
                System.out.println("- " + item.getProductName() + " x" + item.getQuantity());
            }
            System.out.println();
        }
    }
}
