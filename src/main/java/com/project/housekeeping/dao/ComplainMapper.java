package com.project.housekeeping.dao;

import com.project.housekeeping.pojo.Complaint;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface ComplainMapper {
    //投诉管理查询分页
    List<Complaint> SelectAllComplains(
            @Param("status") int status,
            @Param("page") int page,
            @Param("size") int size
    );
    //查询总条数
    int count();
}
