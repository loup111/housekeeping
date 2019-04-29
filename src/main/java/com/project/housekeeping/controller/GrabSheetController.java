package com.project.housekeeping.controller;

import com.project.housekeeping.pojo.Grabsheet;
import com.project.housekeeping.pojo.Page;
import com.project.housekeeping.service.GrabSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class GrabSheetController {
    @Autowired
    GrabSheetService grabSheetService;
    @GetMapping(value = "/selectallgrab")
    public String selectallgrab(@RequestParam(value="status",required=false)String status,
                                @RequestParam(value = "page",required = false)String page,
                                HttpServletRequest request){
        request.setAttribute("currentPage",page);
        if(page==null || page==""){
            page="1";
        }
        if(status==null){
            status="0";
        }
        Page pages=new Page();
        List<Grabsheet> grablist=grabSheetService.SelectAllGrab(Integer.valueOf(status),(Integer.valueOf(page)-1)*5,5);
        pages.setPageSize(5);
        pages.setTotalCount(grabSheetService.count());
        pages.setCurrPage(Integer.valueOf(page));
        if(grablist.size()>0){
            request.setAttribute("pages",pages);
            request.setAttribute("grablist",grablist);
        }
        return "grabsheet";
    }
}
