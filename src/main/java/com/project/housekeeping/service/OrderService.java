package com.project.housekeeping.service;

import com.project.housekeeping.dao.OrderMapper;
import com.project.housekeeping.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired(required = false)
    OrderMapper orderMapper;

    public List<Order> getorderlist(Integer order_id, String servicename, String name, int stat, int end){
        return orderMapper.getorderlist(order_id,servicename,name,stat,end);
    }

    public Integer counts(Integer order_id,String servicename,String name){
        return orderMapper.counts(order_id,servicename,name);
    }

    public Integer count(){
        return orderMapper.count();
    }
    public Order getop(int id){
        return orderMapper.getop(id);
    }

    public List<Servicelei> getlei(){
        return orderMapper.getlei();
    }
    public List<Services> getservicelist(){
        return orderMapper.getservicelist();
    }
    public List<Staff> getstaff(){
        return orderMapper.getstaff();
    }
    public List<Servicestate> getstate(){
        return orderMapper.getstate();
    }
    public Integer getupdate(Order orders){
        return orderMapper.getupdate(orders);
    }
    public List<Order> getorder1(Integer order_id,String servicename,String name,int stat,int end){
        return orderMapper.getorder1(order_id,servicename,name,stat,end);
    }

    public Integer counts1(Integer order_id,String servicename,String name){
        return orderMapper.counts1(order_id,servicename,name);
    }

    public Integer count1(){
        return orderMapper.count1();
    }

    public Integer getupdate1(int id){
        return orderMapper.getupdate1(id);
    }

    public List<Order> getorder2(Integer order_id,String servicename,String name,int stat,int end){
        return orderMapper.getorder2(order_id,servicename,name,stat,end);
    }

    public Integer counts2(Integer order_id,String servicename,String name){
        return orderMapper.counts2(order_id,servicename,name);
    }

    public Integer count2(){
        return orderMapper.count2();
    }

    public Integer getupdate2(int id){
        return orderMapper.getupdate2(id);
    }

    public List<Order> getorder3(Integer order_id,int stat,int end){
        return orderMapper.getorder3(order_id,stat,end);
    }

    public Integer counts3(Integer order_id){
        return orderMapper.counts3(order_id);
    }

    public Integer count3(){
        return orderMapper.count3();
    }

    //取消
    public List<Order> getorder4(Integer order_id,int stat,int end){
        return orderMapper.getorder4(order_id,stat,end);
    }

    public Integer counts4(Integer order_id){
        return orderMapper.counts4(order_id);
    }

    public Integer count4(){
        return orderMapper.count4();
    }

    public Integer getupdate3(int id){
        return orderMapper.getupdate3(id);
    }
    public Integer getupdate4(int id){
        return orderMapper.getupdate4(id);
    }
}
