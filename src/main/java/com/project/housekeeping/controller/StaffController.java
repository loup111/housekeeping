package com.project.housekeeping.controller;
import com.project.housekeeping.pojo.Staff;
import com.project.housekeeping.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class StaffController {
    @Autowired
    StaffService staffService;

    @RequestMapping(value = "cate")
    public Object Staffsurface(
            Model model,
            @RequestParam(value = "name",required = false) String name,
            @RequestParam(value = "sex",required = false) Integer sex,
            @RequestParam(value = "degree",required = false) Integer degree,
            @RequestParam(value = "marital",required = false) Integer marital,
            @RequestParam(value = "health",required = false) Integer health,
            @RequestParam(value = "ante_age",required = false) Integer ante_age,
            @RequestParam(value = "under_age",required = false) Integer under_age,
            @RequestParam(value = "yeishu",required=false) String yeishu
            ){
        int size = 1;
        int paze = 3;
        Integer tiaoshu = staffService.count(name,sex,degree,marital,health,ante_age,under_age);
        if(yeishu!=null){
            size = Integer.valueOf(yeishu);
        }
        int tiaojian=tiaoshu%paze==0?tiaoshu/paze:(tiaoshu/paze)+1;
        List<Staff> personnel = staffService.staffcha(name,sex,degree,marital,health,ante_age,under_age,(size-1)*paze,paze);
        model.addAttribute("zongshu", tiaojian);
        model.addAttribute("size", size);
        model.addAttribute("name",name);
        model.addAttribute("personnel", personnel);
        model.addAttribute("yeishu",yeishu);
        model.addAttribute("zong",tiaojian);
        return "cate";
    }
}
