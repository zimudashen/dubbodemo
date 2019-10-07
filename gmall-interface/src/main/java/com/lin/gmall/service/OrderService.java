package com.lin.gmall.service;

import com.lin.gmall.entity.UserAddress;

import java.util.List;

public interface OrderService {
    //初始化订单
    List<UserAddress> initOrder(String userId);
}
