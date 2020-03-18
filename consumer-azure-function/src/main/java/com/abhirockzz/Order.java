package com.abhirockzz;

public class Order {
    private String orderId;
    private String customerName;
    private String customerId;
    private String productName;

    public Order(String orderId, String customerName, String customerId, String productName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerId = customerId;
        this.productName = productName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Order [customerId=" + customerId + ", customerName=" + customerName + ", orderId=" + orderId
                + ", productName=" + productName + "]";
    }

}