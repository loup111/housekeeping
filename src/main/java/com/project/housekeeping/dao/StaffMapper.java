package com.project.housekeeping.dao;

import com.project.housekeeping.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StaffMapper {

    List<Staff> staffcha(
             @Param("name") String name,
             @Param("sex") Integer sex,
             @Param("degree") Integer degree,
             @Param("marital") Integer marital,
             @Param("health") Integer health,
             @Param("ante_age") Integer ante_age,
             @Param("under_age") Integer under_age,
             @Param("pageNo") int pageNo,
             @Param("pageSize") int pageSize
             );
    Integer count(
              @Param("name") String name,
              @Param("sex") Integer sex,
              @Param("degree") Integer degree,
              @Param("marital") Integer marital,
              @Param("health") Integer health,
              @Param("ante_age") Integer ante_age,
              @Param("under_age") Integer under_age
              );
    /*int count();
    List<Staff> staffcha();*/
}
