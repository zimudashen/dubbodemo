package com.lin.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lin.gmall.entity.UserAddress;
import com.lin.gmall.service.OrderService;
import com.lin.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1、将服务提供者注册到注册中心（暴露服务）
 *         1）、导入dubbo依赖（2.6.2）\操作zookeeper的客户端(curator)
 *         2）、配置服务提供者
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id："+userId);

        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }
}
