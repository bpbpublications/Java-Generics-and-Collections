package com.meennu.javabook.chap11.casestudy3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerOrderManager {
    private final Map<String, List<OrderItem>> customerOrders = new HashMap<>();

    // Add an item to a customer's order
    public void addOrderItem(String customerId, OrderItem item) {
        customerOrders.computeIfAbsent(customerId, k -> new ArrayList<>()).add(item);
    }

    // Get all order items for a customer
    public List<OrderItem> getOrderItems(String customerId) {
        return Collections.unmodifiableList(
            customerOrders.getOrDefault(customerId, Collections.emptyList())
        );
    }

    // Calculate total order value for a customer
    public double getTotalValue(String customerId) {
        return customerOrders.getOrDefault(customerId, Collections.emptyList())
                             .stream()
                             .mapToDouble(OrderItem::getTotalPrice)
                             .sum();
    }

    // Get all customers
    public Set<String> getAllCustomerIds() {
        return Collections.unmodifiableSet(customerOrders.keySet());
    }
}
