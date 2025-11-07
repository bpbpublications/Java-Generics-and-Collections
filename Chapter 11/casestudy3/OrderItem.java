package com.meennu.javabook.chap11.casestudy3;

public class OrderItem {
    private final String productId;
    private final String productName;
    private final int quantity;
    private final double pricePerUnit;

    public OrderItem(String productId, String productName, int quantity, double pricePerUnit) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    // Getters
    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public int getQuantity() { return quantity; }
    public double getPricePerUnit() { return pricePerUnit; }
}
