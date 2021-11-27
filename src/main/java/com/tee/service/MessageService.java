package com.tee.service;

import com.tee.pojo.Message;

import java.util.List;

public interface MessageService {
    /**
     * 创建会话，插入到数据库
     * @param message
     */
    public void createMessage(Message message);

    /**
     * 通过会话id删除会话
     * @param messageId
     */
    public void deleteMessage(String messageId);

    /**
     * 通过会话id查询指定会话
     * @param messageId
     * @return
     */
    public Message searchMessage(String messageId);

    /**
     * 通过订单编号查询该订单下的所有会话
     * @param orderId
     * @return
     */
    public List<Message> showMessages(String orderId);
}
