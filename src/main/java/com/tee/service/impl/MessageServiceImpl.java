package com.tee.service.impl;

import com.tee.dao.MessageDao;
import com.tee.dao.impl.MessgeDaoImpl;
import com.tee.pojo.Message;
import com.tee.service.MessageService;

import java.util.List;

public class MessageServiceImpl implements MessageService {
    MessageDao messageDao = new MessgeDaoImpl();
    @Override
    public void createMessage(Message message) {
        messageDao.createMessahe(message);
    }

    @Override
    public void deleteMessage(String messageId) {
        messageDao.deleteMessage(messageId);
    }

    @Override
    public Message searchMessage(String messageId) {
        return messageDao.searchOneMessageByMessageId(messageId);
    }

    @Override
    public List<Message> showMessages(String orderId) {
        return messageDao.searchMessagesByOrderId(orderId);
    }
}
