package io.weiyue.mapper;

import io.weiyue.entity.Order;
import io.weiyue.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserOrderSrpingTest extends SpringBaseTest{


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testCreateUser(){

        User user = new User();
        user.setId(1L);
        user.setName("weiguangyue");
        user.setAge("111");

        int cnt = this.userMapper.insertUser(user);
        if(cnt > 0){
            System.out.println("创建用户成功");
            System.out.println(user);
            //查找这个user

            User currentUser = this.userMapper.getById(user.getId());
            System.out.println(currentUser);

            //创建订单
            Order order = new Order();
            order.setId(1L);
            order.setUid(currentUser.getId());
            order.setPid(1L);

            int c = this.orderMapper.insertOrder(order);
            if(c > 0){
                System.out.println("创建订单成功");
                System.out.println(order);
            }
        }
    }
}
