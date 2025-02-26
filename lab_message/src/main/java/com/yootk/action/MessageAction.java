package com.yootk.action;

import com.yootk.common.vo.Message;
import com.yootk.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pages/message/")
public class MessageAction {
    @Autowired
    private IMessageService messageService;

    @ResponseBody // 直接数据响应
    @RequestMapping("message_echo")
    public Object message_echo(Message message) {
        return this.messageService.echo(message);
    }

    @ResponseBody // 直接数据响应
    @RequestMapping("message_list")
    public Object message_list() {
        return this.messageService.getYootkMessage();
    }
}
