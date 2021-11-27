package com.tee.test;

import com.tee.pojo.Message;
import com.tee.service.MessageService;
import com.tee.service.impl.MessageServiceImpl;
import org.junit.jupiter.api.Test;

public class MessageServiceImplTest {
    MessageService messageService = new MessageServiceImpl();
    @Test
    public void createMessage() {
        messageService.createMessage(new Message(null,"20211125123400","10002","why"));
    }

    @Test
    public void deleteMessage() {
    }

    @Test
    public void searchMessage() {
    }

    @Test
    public void showMessages() {
    }
}