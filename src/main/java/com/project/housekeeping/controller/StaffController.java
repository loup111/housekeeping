package com.project.housekeeping.controller;

import com.project.housekeeping.dao.StaffMapper;
import com.project.housekeeping.pojo.Page;
import com.project.housekeeping.pojo.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StaffController {
    @Resource
    StaffMapper staffMapper;
    @MessageMapping("/staff")
    public Object Staffsurface(
            Model model,
            HttpServletRequest request,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "set") int set,
            @RequestParam(value = "degree") String degree,
            @RequestParam(value = "marital") String marital,
            @RequestParam(value = "health") String health,
            @RequestParam(value = "age") int age,
            @RequestParam(value = "pageNo") int currentPage,
            @RequestParam(value = "state") int state
            ){
        Page page=new Page();
        page.setJilu(1);
        int cou=staffMapper.currentPage(name,set,degree,marital,health,age,state);
        page.setTiaoshu(cou);
        Integer co=staffMapper.currentPage(name,set,degree,marital,health,age,state);
        List<Staff> inquire = staffMapper.staffcha(name,set,degree,marital,health,age,page.getPagesize(),(page.getJilu()-1)*page.getPagesize(),state);
        request.setAttribute("inquire",inquire);
        request.setAttribute("zong",cou);
        request.setAttribute("start",currentPage);
        return "renyuan_index";
    }
}
