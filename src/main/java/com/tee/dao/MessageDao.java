package com.tee.dao;

import com.tee.pojo.Message;

import java.util.List;

public interface MessageDao {
    /**
     * 插入回话内容
     * @param message
     */
    public int createMessahe(Message message);

    /**
     * 删除会话
     * @param message
     * @return
     */
    public int deleteMessage(Message message);

    /**
     * 通过会话编号删除会话内容
     * @param mesageId
     * @return
     */
    public int deleteMessage(String mesageId);

    /**
     * 通过会话编号查询会话内容
     * @param messageId
     * @return
     */
    public Message searchOneMessageByMessageId(String messageId);

    /**
     * 通过反馈订单编号，查询所有关于该订单的对话
     * @param orderId
     * @return
     */
    public List<Message> searchMessagesByOrderId(String orderId);
}
