package com.lin.gmall.entity;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private Integer id;
    //用户地址
    private String userAddress;
    //用户id
    private String userId;
    //收货人
    private String consignee;
    //电话号码
    private String phoneNum;
    //是否为默认地址    Y-是     N-否
    private String isDefault;

    public Integer getId() {
        return id;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserId() {
        return userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public UserAddress() {
    }
}
