package com.project.housekeeping.controller;

import com.project.housekeeping.pojo.Complaint;
import com.project.housekeeping.pojo.Page;
import com.project.housekeeping.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ComplainController {
    @Autowired
    ComplainService complainsService;

    @GetMapping(value = "/selectallcomplains")
    public String selectallcomplains(
            @RequestParam(value="status",required=false)String status,
            @RequestParam(value = "page",required = false)String page,
            HttpServletRequest request){
        request.setAttribute("currentPage",page);
        if(page==null||page==""){
            page="1";
        }
        if(status==null){
            status="0";
        }
        Page pages=new Page();
        List<Complaint> comlist=complainsService.SelectAll(Integer.valueOf(status),(Integer.valueOf(page)-1)*3, 3);
        pages.setPageSize(3);
        pages.setTotalCount(complainsService.count());
        pages.setCurrPage((Integer.valueOf(page)));
        if(comlist.size()>0){
            request.setAttribute("pages",pages);
            request.setAttribute("comlist",comlist);
        }
        return "complains";
    }
}
