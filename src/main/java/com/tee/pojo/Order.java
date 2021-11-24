package com.tee.pojo;

public class Order {
    /**
     * orderId          订单编号
     * orderTime        下订单时间
     * userId           下单账号
     * addressId        收件人编号
     * commodityId      商品id
     * commodityName    商品名
     * num              商品数量
     * totalPrice       商品总价格
     * orderStatus      订单状态
     */
    private String orderId;
    private String orderTime;
    private String userId;
    private String addressId;
    private String commodityId;
    private String commodityName;
    private int num;
    private float totalPrice;
    private String orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order() {
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Order(String orderId, String orderTime, String userId, String addressId, String commodityId, String commodityName, int num, float totalPrice, String orderStatus) {
        this.orderId = orderId;
        this.orderTime = orderTime;
        this.userId = userId;
        this.addressId = addressId;
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.num = num;
        this.totalPrice = totalPrice;
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", userId='" + userId + '\'' +
                ", addressId='" + addressId + '\'' +
                ", commodityId='" + commodityId + '\'' +
                ", commodityName='" + commodityName + '\'' +
                ", num=" + num +
                ", totalPrice=" + totalPrice +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
