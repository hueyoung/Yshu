package com.ytl.yshu.dao.po;

public class YshuTask {
    private Integer userId;

    private Integer sendTime;

    private Integer sendPhone;

    private Integer state;

    private String content;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getSendPhone() {
        return sendPhone;
    }

    public void setSendPhone(Integer sendPhone) {
        this.sendPhone = sendPhone;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}