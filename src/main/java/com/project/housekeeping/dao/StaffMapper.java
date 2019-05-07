package com.project.housekeeping.dao;

import com.project.housekeeping.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StaffMapper {

    List<Staff> staffcha(
             @Param("name") String name,
             @Param("set") int set,
             @Param("degree") String degree,
             @Param("marital") String marital,
             @Param("health") String health,
             @Param("age") int ante_age,
             @Param("age") int under_age,
             @Param("pageNo") int pageNo,
             @Param("pageSize") int pageSize
             );
    int count(
              @Param("name") String name,
              @Param("set") int set,
              @Param("degree") String degree,
              @Param("marital") String marital,
              @Param("health") String health,
              @Param("age") int ante_age,
              @Param("age") int under_age
              );
}
