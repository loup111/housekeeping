package com.project.housekeeping.service;

import com.project.housekeeping.dao.GrabSheetMapper;
import com.project.housekeeping.pojo.Grabsheet;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrabSheetService {
    @Autowired(required = false)
    GrabSheetMapper grabSheetMapper;
    //抢单管理分页查询
    public List<Grabsheet> SelectAllGrab(@Param("status")int status, @Param("page")int page, @Param("size")int size){
        return grabSheetMapper.SelectAllGrab(status,page,size);
    }
    //记录总条数
    public int count(){
        return grabSheetMapper.count();
    }
}
