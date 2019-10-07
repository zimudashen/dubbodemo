package com.lin.gmall.service;

import com.lin.gmall.entity.UserAddress;

import java.util.List;

public interface UserService {
    //按照用户id返回所有的收货地址
    List<UserAddress> getUserAddressList(String userId);
}
