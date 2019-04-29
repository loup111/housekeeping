package com.project.housekeeping.controller;

import com.project.housekeeping.pojo.Product;
import com.project.housekeeping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    //查询
    @RequestMapping(value = "/productAll", method = RequestMethod.GET)
    public String productAll(@RequestParam(defaultValue = "1") Integer pageNo,
                             @RequestParam(defaultValue = "10") Integer pageSize,
                             @RequestParam(defaultValue = "")String name,
                             HttpServletRequest request){

        List<Product> list = productService.productAll(pageNo,pageSize,name);
        request.setAttribute("list",list);
        return "";
    }
    //删除
    @RequestMapping(value = "productDel")
    public String productDel(Integer[] id){
        if(productService.productDel(id)){
            return "redirect:/show?b=1";
        }else{
            return "redirect:/show?b=0";
        }
    }
    //添加
    @PostMapping("/upload")
    @ResponseBody
    public String productAdd(Product product, MultipartFile file) {

        int i = productService.productAdd(product);
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }
        String fileName = file.getOriginalFilename();
        String filePath = "/Users/itinypocket/workspace/temp/";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            LOGGER.info("上传成功");
            if (i>0){
                return "添加成功";
            }else{
                return "添加失败！";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }
    //产品详情查看
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String packages(Integer id,HttpServletRequest request){
        Product product = null;
        product=productService.packages(id);
        request.setAttribute("product",product);
        return "";
    }
    //产品修改
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String productUpd(Product product, MultipartFile files){
        int i = productService.productUpd(product);
        if (files.isEmpty()) {
            return "上传失败，请选择文件";
        }
        String fileName = files.getOriginalFilename();
        String filePath = "/Users/itinypocket/workspace/temp/";
        File dest = new File(filePath + fileName);
        try {
            files.transferTo(dest);
            LOGGER.info("上传成功");
            if (i>0){
                return "修改成功";
            }else{
                return "修改失败！";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }
    //上下架操作
    @RequestMapping(value = "")
    public String frames(Integer number,Integer num ,Integer[] id){
        if (number==0){
            num=1;
        }else {
            num=0;
        }
        for (Integer aids : id){
            int su = 1;
            //su = productService.frames(0,0,{0,0});
            if(num==1){
                if (su>0){
                    System.out.println("上架成功！");
                }else{
                    System.out.println("上架失败，请联系管理员了解详情！");
                }
            }else if (num==0){
                if (su>0){
                    System.out.println("下架成功！");
                }else{
                    System.out.println("下架失败，请联系管理员了解详情！");
                }
            }else{
                System.out.println("此功能暂时维护中！请稍后尝试！");
            }

        }
        return "";
    }

}
