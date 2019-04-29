package com.project.housekeeping.dao;

import com.project.housekeeping.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface ProductMapper {

    //产品查看+搜索
    List<Product> productAll(String name, Integer pageNo, Integer pageSize);

    //产品删除
    int productDel(Integer id);

    //产品添加
    int productAdd(Product product);

    //产品详情查看
    Product packages(Integer id);

    //产品修改
    int productUpd(Product product);

    //上下架操作
    int frames(Integer number, Integer num, Integer[] id);

    //查询所有数据
    Long geProduct(@Param("name") String name);
}
