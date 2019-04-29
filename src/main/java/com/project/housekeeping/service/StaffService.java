package com.project.housekeeping.service;

import com.project.housekeeping.dao.StaffMapper;
import com.project.housekeeping.pojo.Staff;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffService {
    @Resource
    StaffMapper staffMapper;

    List<Staff> staffcha(
            @Param("name") String name,
            @Param("set") int set,
            @Param("degree") String degree,
            @Param("marital") String marital,
            @Param("health") String health,
            @Param("age") int age,
            @Param("pageNo") int pageNo,
            @Param("pageSize") int pageSize,
            @Param("state") int state){
        return staffMapper.staffcha(name,set,degree,marital,health,age,pageNo,pageSize,state);
    }

    int currentPage(
            @Param("name") String name,
            @Param("set") int set,
            @Param("degree") String degree,
            @Param("marital") String marital,
            @Param("health") String health,
            @Param("age") int age,
            @Param("state") int state){
        return staffMapper.currentPage(name,set,degree,marital,health,age,state);
    }

}
