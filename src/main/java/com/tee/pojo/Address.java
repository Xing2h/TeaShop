package com.tee.pojo;

public class Address {
    /**
     * addressId   地址编号
     * userId      用户编号
     * recipient   收件人
     * tel         电话
     * address     地址
     * postalCode  邮政编码
     */

    private String addressId;
    private String userId;
    private String recipient;
    private String tel;
    private String address;
    private String postalCode;

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address() {
    }

    public Address(String addressId, String userId, String recipient, String tel, String address, String postalCode) {
        this.addressId = addressId;
        this.userId = userId;
        this.recipient = recipient;
        this.tel = tel;
        this.address = address;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "收件人姓名：'" + recipient + '\'' +
                ", 电话：'" + tel + '\'' +
                ", 地址：'" + address + '\'' +
                ", 邮政编码：'" + postalCode + '\'';
    }
}
