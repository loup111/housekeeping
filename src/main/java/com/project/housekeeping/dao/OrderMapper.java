package com.project.housekeeping.dao;

import com.project.housekeeping.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    //条件查询与分页与查询
    List<Order> getorderlist(@Param("order_id") Integer order_id, @Param("servicename") String servicename, @Param("name") String name, @Param("stat") int stat, @Param("end") int end);
    //初始页面的数量
    Integer count();
    //条件查询以后的数量
    Integer counts(@Param("order_id") Integer order_id, @Param("servicename") String servicename, @Param("name") String name);
    //查看订单信息
    Order getop(@Param("id") int id);
    //修改订单
    Integer getupdate(Order orders);
    //查询服务类型
    List<Servicelei> getlei();
    //查询服务项目
    List<Services> getservicelist();
    //查看服务人员
    List<Staff> getstaff();
    //查看人员状态
    List<Servicestate> getstate();
    //查询服务类型

    //待派人
    //条件查询与分页与查询
    List<Order> getorder1(@Param("order_id") Integer order_id, @Param("servicename") String servicename, @Param("name") String name, @Param("stat") int stat, @Param("end") int end);
    //初始页面的数量
    Integer count1();
    //条件查询以后的数量
    Integer counts1(@Param("order_id") Integer order_id, @Param("servicename") String servicename, @Param("name") String name);
    //接单
    Integer getupdate1(int id);

    //服务
    //条件查询与分页与查询
    List<Order> getorder2(@Param("order_id") Integer order_id, @Param("servicename") String servicename, @Param("name") String name, @Param("stat") int stat, @Param("end") int end);
    //初始页面的数量
    Integer count2();
    //条件查询以后的数量
    Integer counts2(@Param("order_id") Integer order_id, @Param("servicename") String servicename, @Param("name") String name);
    //服务
    Integer getupdate2(int id);

    //完成
    //条件查询与分页与查询
    List<Order> getorder3(@Param("order_id") Integer order_id, @Param("stat") int stat, @Param("end") int end);
    //初始页面的数量
    Integer count3();
    //条件查询以后的数量
    Integer counts3(@Param("order_id") Integer order_id);

    //取消
    //条件查询与分页与查询
    List<Order> getorder4(@Param("order_id") Integer order_id, @Param("stat") int stat, @Param("end") int end);
    //初始页面的数量
    Integer count4();
    //条件查询以后的数量
    Integer counts4(@Param("order_id") Integer order_id);

    //完成订单
    Integer getupdate3(int id);

    //取消订单
    Integer getupdate4(int id);
}
