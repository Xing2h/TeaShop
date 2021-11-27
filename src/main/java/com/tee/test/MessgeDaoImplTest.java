package com.tee.test;

import com.tee.dao.MessageDao;
import com.tee.dao.impl.MessgeDaoImpl;
import com.tee.pojo.Message;
import org.junit.jupiter.api.Test;

public class MessgeDaoImplTest {
    MessageDao messageDao = new MessgeDaoImpl();
    @Test
    public void createMessahe() {
        Message message = new Message(null,"20211125123400","10002","why");
        System.out.println(message.toString());
        System.out.println(messageDao.createMessahe(message));
    }

    @Test
    public void deleteMessage() {
    }

    @Test
    public void testDeleteMessage() {
    }

    @Test
    public void searchOneMessageByMessageId() {

    }

    @Test
    public void searchMessagesByOrderId() {
//        List<Message> list = messageDao.searchMessagesByOrderId("20211125123400");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).toString());
//        }
        System.out.println(messageDao.searchMessagesByOrderId("20211125123400").toString());
    }
}