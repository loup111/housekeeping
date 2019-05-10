package com.project.housekeeping.service;

import com.project.housekeeping.dao.StaffMapper;
import com.project.housekeeping.pojo.Staff;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StaffService {
    @Autowired(required = false)
    StaffMapper staffMapper;

    public List<Staff> staffcha(String name,Integer sex,Integer degree,Integer marital,Integer health,Integer ante_age,Integer under_age,int pageNo,int pageSiz){
        return staffMapper.staffcha(name,sex,degree,marital,health,ante_age,under_age,pageNo,pageSiz);
    }

    public Integer count(String name,Integer sex,Integer degree,Integer marital,Integer health,Integer ante_age,Integer c){
        return staffMapper.count(name,sex,degree,marital,health,ante_age,ante_age);
    }

}
