package com.yootk.service;

import com.yootk.common.vo.Message;

import java.util.List;

public interface IMessageService {
    public Message echo(Message message); // 业务方法

    public List<Message> getYootkMessage(); // 业务方法
}

