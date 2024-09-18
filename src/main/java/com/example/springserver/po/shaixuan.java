package com.example.springserver.po;

public class shaixuan {
    private String blackListName;
    private String phoneNumber;
    private String introducer;
    private String endTime;
    private String startTime;

    public shaixuan() {
    }

    @Override
    public String toString() {
        return "shaixuan{" +
                "blackListName='" + blackListName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", introducer='" + introducer + '\'' +
                ", endTime='" + endTime + '\'' +
                ", startTime='" + startTime + '\'' +
                '}';
    }

    public String getBlackListName() {
        return blackListName;
    }

    public void setBlackListName(String blackListName) {
        this.blackListName = blackListName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
