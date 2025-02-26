package com.yootk.dao;

import com.yootk.common.vo.Message;

public interface IMessageDAO {
    public Message handle(Message msg); // 消息数据处理
}
