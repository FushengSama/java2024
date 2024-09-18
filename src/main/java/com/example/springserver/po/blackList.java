package com.example.springserver.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("黑名单")
public class blackList {
    @ApiModelProperty("黑名单uuid")
    private String blackListUuid;
    @ApiModelProperty("电话号码")
    private String phoneNumber;
    private String blackListName;
    private String reason;
    private String introducer;
    private String adder;
    private String startTime;
    private String endTime;
    private String updateTime;
    private String updater;

    public blackList() {
    }

    public blackList(String blackListUuid, String phoneNumber, String updater, String updateTime, String endTime, String startTime, String adder, String introducer, String reason, String blackListName) {
        this.phoneNumber = phoneNumber;
        this.updater = updater;
        this.updateTime = updateTime;
        this.endTime = endTime;
        this.startTime = startTime;
        this.adder = adder;
        this.introducer = introducer;
        this.reason = reason;
        this.blackListName = blackListName;
        this.blackListUuid = blackListUuid;
    }

    @Override
    public String toString() {
        return "blackList{" +
                "blackListUuid='" + blackListUuid + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", blackListName='" + blackListName + '\'' +
                ", reason='" + reason + '\'' +
                ", introducer='" + introducer + '\'' +
                ", adder='" + adder + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", updater='" + updater + '\'' +
                '}';
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBlackListName() {
        return blackListName;
    }

    public void setBlackListName(String blackListName) {
        this.blackListName = blackListName;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getIntroducer() {
        return introducer;
    }

    public void setIntroducer(String introducer) {
        this.introducer = introducer;
    }

    public String getAdder() {
        return adder;
    }

    public void setAdder(String adder) {
        this.adder = adder;
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getBlackListUuid() {
        return blackListUuid;
    }

    public void setBlackListUuid(String blackListUuid) {
        this.blackListUuid = blackListUuid;
    }
}
