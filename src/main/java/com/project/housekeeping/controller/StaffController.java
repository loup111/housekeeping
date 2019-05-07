package com.project.housekeeping.controller;
import com.project.housekeeping.pojo.Staff;
import com.project.housekeeping.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StaffController {
    @Resource
    StaffService staffService;

    @RequestMapping("/staffsurface")
    public Object Staffsurface(
            Model model,
            HttpServletRequest request,
            @RequestParam(value = "name") String name,
            @RequestParam(value = "set") int set,
            @RequestParam(value = "degree") String degree,
            @RequestParam(value = "marital") String marital,
            @RequestParam(value = "health") String health,
            @RequestParam(value = "ante_age") int ante_age,
            @RequestParam(value = "under_age") int under_age,
            @RequestParam(value = "pageNo") int pageNo,
            @RequestParam(value = "pageSize") int pageSize,
            @RequestParam(value="yeishu",required=false)String yeishu
            ){
        int size = 1;
        int paze = 3;
        int tiaoshu = staffService.count(name,set,degree,marital,health,ante_age,under_age);
        if(yeishu!=null){
            size = Integer.valueOf(yeishu);
        }
        int tiaojian=tiaoshu%paze==0?tiaoshu/paze:(tiaoshu/paze)+1;
        List<Staff> xian1 = staffService.staffcha(name,set,degree,marital,health,ante_age,under_age,(size-1)*paze,paze);
        model.addAttribute("zongshu", tiaojian);
        model.addAttribute("size", size);
        model.addAttribute("chaxun", xian1);
        return "select";
    }
}
