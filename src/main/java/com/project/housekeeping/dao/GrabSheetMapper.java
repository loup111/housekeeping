package com.project.housekeeping.dao;

import com.project.housekeeping.pojo.Grabsheet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;


@Mapper
public interface GrabSheetMapper {
    //抢单管理分页查询
    List<Grabsheet> SelectAllGrab(@Param("status") int status, @Param("page") int page, @Param("size") int size);
    //记录总条数
    int count();
}
