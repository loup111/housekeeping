package com.project.housekeeping.dao;

import com.project.housekeeping.pojo.Staff;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface StaffMapper {
    List<Staff> staffcha(
            @Param("name") String name,
            @Param("set") int set,
            @Param("degree") String degree,
            @Param("marital") String marital,
            @Param("health") String health,
            @Param("age") int age,
            @Param("pageNo") int pageNo,
            @Param("pageSize") int pageSize,
            @Param("state") int state
            );
    int currentPage(
            @Param("name") String name,
            @Param("set") int set,
            @Param("degree") String degree,
            @Param("marital") String marital,
            @Param("health") String health,
            @Param("age") int age,
            @Param("state") int state
            );
}
