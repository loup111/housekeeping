package com.project.housekeeping.service;

import com.project.housekeeping.dao.ProductMapper;
import com.project.housekeeping.pojo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.Id;
import java.util.List;

@Service
public class ProductService {
    @Resource
    ProductMapper productMapper;

    //查询所有
    public List<Product> productAll(Integer pageNo, Integer pageSize, String name){
        int start = (pageNo - 1) * pageSize;
        return productMapper.productAll(name,start,pageSize);
    }
    //批量删除产品
    public boolean productDel(Integer[] id){
        int sum = 0;
        for(Integer ids : id){
            int result = productMapper.productDel(ids);
            sum += result;
        }
        if(sum==id.length){
            return true;
        }
        return false;
    }

    //添加产品
    public int productAdd(Product product){
        return productMapper.productAdd(product);
    }

    //产品详情查看
    public Product packages(Integer id){
        return productMapper.packages(id);
    }

    //产品修改
    public int productUpd(Product product){
        return productMapper.productUpd(product);
    }

    //上下架操作
    public int frames(Integer number,Integer num, Integer[] id){
        return productMapper.frames(number,num, id);
    }

    //查询所有数据条数
    public Long geProduct(String name){
        return productMapper.geProduct(name);
    }

}
