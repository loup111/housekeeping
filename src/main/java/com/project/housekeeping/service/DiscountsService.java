package com.project.housekeeping.service;

import com.project.housekeeping.dao.DiscountsMapper;
import com.project.housekeeping.pojo.Discounts;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountsService {
    @Autowired(required = false)
    DiscountsMapper discountsMapper;
    //优惠信息分页查询
    public List<Discounts> SelectAllDiscounts(@Param("page")int page, @Param("size")int size){
        return discountsMapper.SelectAllDiscounts(page,size);
    }
    //添加优惠
    public int DiscountsAdd(Discounts discounts){
        return discountsMapper.DiscountsAdd(discounts);
    }
    //上架优惠
    public int UpdateUpperShelf(int id){
        return discountsMapper.UpdateUpperShelf(id);
    }
    //下架优惠
    public int UpdateLowerShelf(int id){
        return discountsMapper.UpdateLowerShelf(id);
    }
    //删除优惠
    public int DiscountsDel(int id){
        return discountsMapper.DiscountsDel(id);
    }
    //记录总条数
    public int count(){
        return discountsMapper.count();
    }
}
