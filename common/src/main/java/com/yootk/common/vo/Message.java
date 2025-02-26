package com.yootk.common.vo;

import java.util.Date;

public class Message {
    private String title; // 消息标题
    private String content; // 消息内容
    private Date date; // 处理日期时间

    public Message() {
    }

    public Message(String title, String content, Date date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
