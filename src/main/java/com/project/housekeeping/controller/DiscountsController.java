package com.project.housekeeping.controller;

import com.project.housekeeping.pojo.Discounts;
import com.project.housekeeping.pojo.Page;
import com.project.housekeeping.service.DiscountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DiscountsController {
    @Autowired
    DiscountsService discountsService;

    @GetMapping(value = "/selectalldiscounts")
    public String selectalldiscounts(@RequestParam(value = "page", required = false) String page, HttpServletRequest request) {
        request.setAttribute("currentPage", page);
        if (page == null) {
            page = "1";
        }
        List<Discounts> dislist = discountsService.SelectAllDiscounts((Integer.valueOf(page) - 1) * 3, 3);
        Page pages = new Page();
        pages.setPageSize(3);
        pages.setTotalCount(discountsService.count());
        pages.setCurrPage(Integer.valueOf(page));
        if (dislist.size() > 0) {
            request.setAttribute("pages", pages);
            request.setAttribute("dislist", dislist);
        }
        return "discount";
    }

    @GetMapping(value = "/getdiscountadd")
    public String getdiscountadd() {
        return "discountadd";
    }

    @PostMapping(value = "/discountadd")
    public String discountadd(Discounts discounts) {
        discountsService.DiscountsAdd(discounts);
        return "redirect:/selectalldiscounts";
    }


    @GetMapping(value = "/updateuppershelf")
    @ResponseBody
    public Object updateuppershelf(int id) {
        Map<Object,String> map=new HashMap<Object,String>();
        int result = discountsService.UpdateUpperShelf(id);
        if (result > 0) {
            map.put("error","yes");
        }
        return map;
    }

    @GetMapping(value = "/updatelowershelf")
    @ResponseBody
    public Object updatelowershelf(int id) {
        Map<Object,String> map=new HashMap<Object,String>();
        int result = discountsService.UpdateLowerShelf(id);
        if (result > 0) {
            map.put("error","yes");
        }
        return map;
    }

        @GetMapping(value = "/discountsdel")
    public String discountsdel(int id){
        int result=discountsService.DiscountsDel(id);
        if(result>0){
            return "redirect:/selectalldiscounts";
        }else{
            return "discount";
        }
    }
}
