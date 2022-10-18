package com.iti.chatproject.service;

import com.iti.chatproject.entity.Message;
import com.iti.chatproject.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public void addMessage(Message message){
        messageRepository.save(message);
    }
}
