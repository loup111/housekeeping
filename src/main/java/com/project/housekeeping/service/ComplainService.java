package com.project.housekeeping.service;

import com.project.housekeeping.dao.ComplainMapper;
import com.project.housekeeping.pojo.Complaint;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplainService {
    @Autowired(required = false)
    ComplainMapper complainsMapper;

    //投诉管理查询分页
    public List<Complaint> SelectAll(@Param("status")int status, @Param("page")int page, @Param("size")int size){
        return complainsMapper.SelectAllComplains(status,page,size);
    }
    //查询总条数
    public int count(){
        return complainsMapper.count();
    }
}
