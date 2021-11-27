package com.tee.dao.impl;

import com.tee.dao.BaseDao;
import com.tee.dao.MessageDao;
import com.tee.pojo.Message;

import java.util.List;

public class MessgeDaoImpl extends BaseDao implements MessageDao {
    @Override
    public int createMessahe(Message message) {
        String sql = "insert into t_message(orderId,id,message)values (?,?,?)";
        return update(sql,message.getOrderId(),message.getId(),message.getMessage());
    }

    @Override
    public int deleteMessage(Message message) {
        return 0;
    }

    @Override
    public int deleteMessage(String mesageId) {
        String sql ="delete from t_message where messageId=?";
        return update(sql,mesageId);
    }

    /**
     * 查询一条对话
     * @param messageId
     * @return
     */
    @Override
    public Message searchOneMessageByMessageId(String messageId) {
        String sql = "select * from t_message where messageId=?";
        return queryForOne(Message.class,sql,messageId);
    }

    /**
     * 查询某个订单的所有会话
     * @param orderId
     * @return
     */
    @Override
    public List<Message> searchMessagesByOrderId(String orderId) {
        String sql = "select * from t_message where orderId=?";
        return queryForList(Message.class,sql,orderId);
    }
}
