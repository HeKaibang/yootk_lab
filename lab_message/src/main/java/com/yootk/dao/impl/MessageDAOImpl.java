package com.yootk.dao.impl;

import com.yootk.common.vo.Message;
import com.yootk.dao.IMessageDAO;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDAOImpl implements IMessageDAO {
    @Override
    public Message handle(Message msg) {
        Message message = new Message();
        message.setTitle("【ECHO】" + msg.getTitle());
        message.setContent("【ECHO】" + msg.getContent());
        message.setDate(new java.util.Date());
        return message;
    }
}
