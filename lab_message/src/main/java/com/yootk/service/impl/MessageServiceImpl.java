package com.yootk.service.impl;

import com.yootk.common.vo.Message;
import com.yootk.dao.IMessageDAO;
import com.yootk.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl implements IMessageService {
    // 创建全局消息集合，保存标题包含有“yootk”消息内容
    private static final List<Message> YOOTK_MESSAGE_LIST = new ArrayList<>();
    @Autowired
    private IMessageDAO messageDAO; // 注入数据层接口实例

    @Override
    public Message echo(Message message) {
        if (message != null) { // 有消息数据
            if (message.getTitle().toLowerCase().contains("yootk")) { // 敏感消息
                YOOTK_MESSAGE_LIST.add(message);// 消息保存
            }
            return this.messageDAO.handle(message); // 数据层处理
        }
        return null;
    }

    public List<Message> getYootkMessage() {
        return YOOTK_MESSAGE_LIST;
    }
}
