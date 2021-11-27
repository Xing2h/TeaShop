package com.tee.pojo;

public class Message {
    /**
     * messageId    对话编号
     * orderId      反馈订单编号
     * Id           用户/管理员Id
     * message      对话信息
     */
    private String messageId;
    private String orderId;
    private String id;
    private String message;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message() {
    }

    public Message(String messageId, String orderId, String id, String message) {
        this.messageId = messageId;
        this.orderId = orderId;
        this.id = id;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageId='" + messageId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", id='" + id + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
