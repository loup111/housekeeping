package com.project.housekeeping.dao;

import com.project.housekeeping.pojo.Discounts;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;


@Mapper
public interface DiscountsMapper {
    //优惠信息分页查询
    List<Discounts> SelectAllDiscounts(@Param("page") int page, @Param("size") int size);
    //记录总条数
    int count();
    //添加优惠
    int DiscountsAdd(Discounts discounts);
    //上架优惠
    int UpdateUpperShelf(int id);
    //下架优惠
    int UpdateLowerShelf(int id);
    //删除优惠
    int DiscountsDel(int id);
}
