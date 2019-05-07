package com.project.housekeeping.service;

import com.project.housekeeping.dao.StaffMapper;
import com.project.housekeeping.pojo.Staff;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffService {
    @Resource
    StaffMapper staffMapper;

    public List<Staff> staffcha(String name,int set,String degree,String marital,String health,int ante_age,int under_age,int pageNo,int pageSiz){
        return staffMapper.staffcha(name,set,degree,marital,health,ante_age,under_age,pageNo,pageSiz);
    }

    public int count(String name,int set,String degree,String marital,String health,int ante_age,int under_age){
        return staffMapper.count(name,set,degree,marital,health,ante_age,under_age);
    }
}
