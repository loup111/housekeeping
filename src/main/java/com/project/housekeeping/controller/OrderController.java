package com.project.housekeeping.controller;

import com.project.housekeeping.pojo.*;
import com.project.housekeeping.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {
    @Resource
    OrderService orderService;

    @GetMapping("/login")
    public ModelAndView getlogin(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    //初始页面查询数据，分页，订单数量
    @GetMapping("/index")
    public ModelAndView getmodel(Integer order_id,String servicename, String name){
        ModelAndView modelAndView=new ModelAndView();
        Page page=new Page();
        page.setJilu(1);
        int cou=orderService.count();
        page.setTiaoshu(cou);
        Integer co=orderService.count();
        List<Order> list=orderService.getorderlist(order_id,servicename,name,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        List<Servicelei> lei=orderService.getlei();
        Integer sers=orderService.count2();
        Integer cooo=orderService.count1();
        Integer serss=orderService.count3();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",serss);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("coco",sers);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",list);
        modelAndView.addObject("page",page);
        modelAndView.addObject("co",co);
        modelAndView.setViewName("renyuan_index");
        return modelAndView;
    }


    //条件查询，也可以查询订单数量
    @PostMapping("/cha")
    public ModelAndView getvice(Integer order_id,String servicename, String name){
        ModelAndView modelAndView=new ModelAndView();
        Page page=new Page();
        page.setJilu(1);
        Integer order=orderService.count();
        Integer ter=orderService.counts(order_id,servicename,name);
        page.setTiaoshu(order);
        List<Order> lists=orderService.getorderlist(order_id,servicename,name,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        List<Servicelei> lei=orderService.getlei();

        Integer sers=orderService.count2();
        Integer cooo=orderService.count1();
        Integer serss=orderService.count3();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",serss);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("coco",sers);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",lists);
        modelAndView.addObject("co",ter);
        modelAndView.addObject("page",page);
        modelAndView.setViewName("renyuan_index");
        return modelAndView;
    }


    //分页，上一页，首页，下一页，末页
    @GetMapping("/ye")
    public ModelAndView getye(Integer order_id,String servicename, String name,int pages){
        if(pages==0){
            pages=1;
        }

        Page page=new Page();
        page.setJilu(pages);
        Integer ser=orderService.count();
        page.setTiaoshu(ser);
        if(pages>page.getZongtiao()){
            pages=page.getZongtiao();
            page.setJilu(pages);
        }
        List<Order> listss=orderService.getorderlist(order_id,servicename,name,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        ModelAndView modelAndView=new ModelAndView();
        List<Servicelei> lei=orderService.getlei();
        Integer sers=orderService.count2();
        Integer cooo=orderService.count1();
        Integer serss=orderService.count3();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",serss);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("coco",sers);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",listss);
        modelAndView.addObject("page",page);
        modelAndView.addObject("co",ser);
        modelAndView.setViewName("renyuan_index");
        return modelAndView;
    }
    //查看订单详情
    @GetMapping("/xiu")
    public ModelAndView getup(int id){
        Order op=orderService.getop(id);
        List<Servicelei> lists=orderService.getlei();
        List<Services> services=orderService.getservicelist();
        List<Staff> staff=orderService.getstaff();
        List<Servicestate> state=orderService.getstate();
        ModelAndView modelAndView=new ModelAndView();
        Integer serss=orderService.count3();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",serss);
        modelAndView.addObject("lists",lists);
        modelAndView.addObject("services",services);
        modelAndView.addObject("op",op);
        modelAndView.addObject("staff",staff);
        modelAndView.addObject("state",state);
        modelAndView.setViewName("update");
        return modelAndView;
    }
    //修改订单
    @PostMapping("/xiugai")
    public ModelAndView getxiugai(int id,Integer order_id,int server_type,int server_project,
                                  int staff_state,int staff_service,String num_money){
        ModelAndView modelAndView=new ModelAndView();
        Order order=new Order();
        order.setId(id);
        order.setOrder_id(order_id);
        order.setServer_type(server_type);
        order.setServer_project(server_project);
        order.setStaff_state(staff_state);
        order.setStaff_service(staff_service);
        order.setNum_money(num_money);
        Integer dates=orderService.getupdate(order);
        if(dates>0){
            modelAndView.setViewName("redirect:/index");
            return modelAndView;
        }else{
            modelAndView.setViewName("update");
            return modelAndView;
        }

    }

    //查询订单
    @GetMapping("/selectcha")
    public ModelAndView getselectcha(int id){
        ModelAndView modelAndView=new ModelAndView();
        Order order=orderService.getop(id);
        modelAndView.addObject("top",order);
        modelAndView.setViewName("sele");
        return modelAndView;
    }




    //带派人
    @GetMapping("/selectdai")
    public ModelAndView getselectdai(Integer order_id,String servicename, String name){
        ModelAndView modelAndView=new ModelAndView();
        Page page=new Page();
        page.setJilu(1);
        int cou=orderService.count1();
        page.setTiaoshu(cou);
        Integer coo=orderService.count1();//查询数量
        List<Order> list=orderService.getorder1(order_id,servicename,name,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        List<Servicelei> lei=orderService.getlei();
        Integer co=orderService.count();
        Integer sers=orderService.count2();
        Integer serss=orderService.count3();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",serss);
        modelAndView.addObject("coco",sers);
        modelAndView.addObject("co",co);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",list);
        modelAndView.addObject("page",page);
        modelAndView.addObject("coo",coo);
        modelAndView.setViewName("pang");
        return modelAndView;
    }
    //带派人条件查询
    @PostMapping("/chaxun")
    public ModelAndView getchaxun(Integer order_id,String servicename, String name) {
        ModelAndView modelAndView = new ModelAndView();
        Page page = new Page();
        page.setJilu(1);
        Integer order = orderService.count1();
        Integer ter = orderService.counts1(order_id, servicename, name);//查询数量
        page.setTiaoshu(order);
        List<Order> lists = orderService.getorder1(order_id, servicename, name, (page.getJilu() - 1) * page.getPagesize(), page.getPagesize());
        List<Servicelei> lei=orderService.getlei();
        Integer co=orderService.count();
        Integer sers=orderService.count2();
        Integer serss=orderService.count3();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",serss);
        modelAndView.addObject("coco",sers);
        modelAndView.addObject("co",co);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list", lists);
        modelAndView.addObject("coo", ter);
        modelAndView.addObject("page", page);
        modelAndView.setViewName("pang");
        return modelAndView;
    }

    //分页，上一页，首页，下一页，末页
    @GetMapping("/yes")
    public ModelAndView getyes(Integer order_id,String servicename, String name,int pages){
        if(pages==0){
            pages=1;
        }

        Page page=new Page();
        page.setJilu(pages);
        Integer ser=orderService.count1();
        page.setTiaoshu(ser);
        if(pages>page.getZongtiao()){
            pages=page.getZongtiao();
            page.setJilu(pages);
        }
        List<Order> listss=orderService.getorder1(order_id,servicename,name,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        ModelAndView modelAndView=new ModelAndView();
        Integer co=orderService.count();
        Integer serss=orderService.count3();
        modelAndView.addObject("cococo",serss);
        modelAndView.addObject("co",co);
        List<Servicelei> lei=orderService.getlei();
        Integer sers=orderService.count2();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("coco",sers);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",listss);
        modelAndView.addObject("page",page);
        modelAndView.addObject("coo",ser);
        modelAndView.setViewName("pang");
        return modelAndView;
    }
//    //查看带派人订单
//    @GetMapping("/selectxiugai")
//    public ModelAndView getselectxiugai(int id) {
//        Order op = orderService.getop(id);
//        List<Servicelei> lists = orderService.getlei();
//        List<Services> services = orderService.getservicelist();
//        List<Staff> staff = orderService.getstaff();
//        List<Servicestate> state = orderService.getstate();
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("lists", lists);
//        modelAndView.addObject("services", services);
//        modelAndView.addObject("op", op);
//        modelAndView.addObject("staff", staff);
//        modelAndView.addObject("state", state);
//        modelAndView.setViewName("updates");
//        return modelAndView;
//    }
//    //修改带派人订单
//    @PostMapping("/xiugais")
//    public ModelAndView getxiugais(int id,Integer order_id,int server_type,int server_project,
//                                  int staff_state,int staff_service,String num_money) {
//        ModelAndView modelAndView = new ModelAndView();
//        Order order = new Order();
//        order.setId(id);
//        order.setOrder_id(order_id);
//        order.setServer_type(server_type);
//        order.setServer_project(server_project);
//        order.setStaff_state(staff_state);
//        order.setStaff_service(staff_service);
//        order.setNum_money(num_money);
//        Integer dates = orderService.getupdate(order);
//        if (dates > 0) {
//            modelAndView.setViewName("redirect:/selectdai");
//            return modelAndView;
//        } else {
//            modelAndView.setViewName("updates");
//            return modelAndView;
//        }
//    }
    //查询带派人订单
    @GetMapping("/selectchas")
    public ModelAndView getselectchas(int id){
        ModelAndView modelAndView=new ModelAndView();
        Order order=orderService.getop(id);
        modelAndView.addObject("top",order);
        modelAndView.setViewName("seles");
        return modelAndView;
    }
    //订单的接单
    @GetMapping("/jiedan")
    public ModelAndView getjiedans(int id) {
        ModelAndView modelAndView = new ModelAndView();
        Integer ups = orderService.getupdate1(id);
        if (ups > 0) {
            modelAndView.setViewName("redirect:/index");
            return modelAndView;
        }else{
            modelAndView.setViewName("renyuan_index");
            return modelAndView;
        }
    }
    //派人
    @GetMapping("/pairen")
    public ModelAndView getpairen(int id) {
        ModelAndView modelAndView = new ModelAndView();
        Integer ups = orderService.getupdate2(id);
        if (ups > 0) {
            modelAndView.setViewName("redirect:/selectdai");
            return modelAndView;
        }else{
            modelAndView.setViewName("selectdai");
            return modelAndView;
        }
    }




    //服务

    @GetMapping("/fuwu")
    public ModelAndView getselect2(Integer order_id,String servicename, String name){
        ModelAndView modelAndView=new ModelAndView();
        Page page=new Page();
        page.setJilu(1);
        int cou=orderService.count2();
        page.setTiaoshu(cou);
        Integer co=orderService.count2();//查询数量
        List<Order> list=orderService.getorder2(order_id,servicename,name,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        List<Servicelei> lei=orderService.getlei();
        Integer coo=orderService.count();
        Integer cooo=orderService.count1();
        Integer serss=orderService.count3();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",serss);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("co",coo);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",list);
        modelAndView.addObject("page",page);
        modelAndView.addObject("coco",co);
        modelAndView.setViewName("serve");
        return modelAndView;
    }
    //带派人条件查询
    @PostMapping("/serve")
    public ModelAndView getserve(Integer order_id,String servicename, String name) {
        ModelAndView modelAndView = new ModelAndView();
        Page page = new Page();
        page.setJilu(1);
        Integer order = orderService.count2();
        Integer ter = orderService.counts2(order_id, servicename, name);//查询数量
        page.setTiaoshu(order);
        List<Order> lists = orderService.getorder2(order_id, servicename, name, (page.getJilu() - 1) * page.getPagesize(), page.getPagesize());
        List<Servicelei> lei=orderService.getlei();
        Integer co=orderService.count();
        Integer cooo=orderService.count1();
        Integer serss=orderService.count3();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",serss);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("co",co);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list", lists);
        modelAndView.addObject("coco", ter);
        modelAndView.addObject("page", page);
        modelAndView.setViewName("serve");
        return modelAndView;
    }

    //分页，上一页，首页，下一页，末页
    @GetMapping("/yess")
    public ModelAndView getyess(Integer order_id,String servicename, String name,int pages){
        if(pages==0){
            pages=1;
        }

        Page page=new Page();
        page.setJilu(pages);
        Integer ser=orderService.count2();
        page.setTiaoshu(ser);
        if(pages>page.getZongtiao()){
            pages=page.getZongtiao();
            page.setJilu(pages);
        }
        List<Order> listss=orderService.getorder2(order_id,servicename,name,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        ModelAndView modelAndView=new ModelAndView();
        List<Servicelei> lei=orderService.getlei();
        Integer co=orderService.count();
        Integer cooo=orderService.count1();
        Integer serss=orderService.count3();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",serss);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("co",co);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",listss);
        modelAndView.addObject("page",page);
        modelAndView.addObject("coco",ser);
        modelAndView.setViewName("serve");
        return modelAndView;
    }



    //已完成

    @GetMapping("/cheng")
    public ModelAndView getselect3(Integer order_id){
        ModelAndView modelAndView=new ModelAndView();
        Page page=new Page();
        page.setJilu(1);
        int cou=orderService.count3();
        page.setTiaoshu(cou);
        Integer co=orderService.count2();//查询数量
        Integer counts=orderService.count3();
        List<Order> list=orderService.getorder3(order_id,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        List<Servicelei> lei=orderService.getlei();
        Integer coo=orderService.count();
        Integer cooo=orderService.count1();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",counts);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("co",coo);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",list);
        modelAndView.addObject("page",page);
        modelAndView.addObject("coco",co);
        modelAndView.setViewName("cheng");
        return modelAndView;
    }
    //完成条件查询
    @PostMapping("/wancheng")
    public ModelAndView wancheng(Integer order_id) {
        ModelAndView modelAndView = new ModelAndView();
        Page page = new Page();
        page.setJilu(1);
        Integer order = orderService.count3();
        Integer ter = orderService.count2();//查询数量
        Integer ters = orderService.counts3(order_id);
        page.setTiaoshu(order);
        List<Order> lists = orderService.getorder3(order_id,(page.getJilu() - 1) * page.getPagesize(), page.getPagesize());
        List<Servicelei> lei=orderService.getlei();
        Integer co=orderService.count();
        Integer cooo=orderService.count1();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("cococo",ters);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("co",co);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list", lists);
        modelAndView.addObject("coco", ter);
        modelAndView.addObject("page", page);
        modelAndView.setViewName("cheng");
        return modelAndView;
    }

    //分页，上一页，首页，下一页，末页
    @GetMapping("/yesss")
    public ModelAndView getyesss(Integer order_id,int pages){
        if(pages==0){
            pages=1;
        }

        Page page=new Page();
        page.setJilu(pages);
        Integer ser=orderService.count3();
        page.setTiaoshu(ser);
        if(pages>page.getZongtiao()){
            pages=page.getZongtiao();
            page.setJilu(pages);
        }
        List<Order> listss=orderService.getorder3(order_id,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        ModelAndView modelAndView=new ModelAndView();
        List<Servicelei> lei=orderService.getlei();
        Integer co=orderService.count();
        Integer cooo=orderService.count1();
        Integer coo=orderService.count2();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("co",co);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",listss);
        modelAndView.addObject("page",page);
        modelAndView.addObject("coco",coo);
        modelAndView.addObject("cococo",ser);
        modelAndView.setViewName("cheng");
        return modelAndView;
    }


    //已取消

    @GetMapping("/xiao")
    public ModelAndView getselect4(Integer order_id){
        ModelAndView modelAndView=new ModelAndView();
        Page page=new Page();
        page.setJilu(1);
        int cou=orderService.count4();
        page.setTiaoshu(cou);
        Integer co=orderService.count2();//查询数量
        Integer counts=orderService.count3();
        List<Order> list=orderService.getorder4(order_id,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        List<Servicelei> lei=orderService.getlei();
        Integer coo=orderService.count();
        Integer cooo=orderService.count1();
        modelAndView.addObject("cocoo",cou);
        modelAndView.addObject("cococo",counts);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("co",coo);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",list);
        modelAndView.addObject("page",page);
        modelAndView.addObject("coco",co);
        modelAndView.setViewName("quxiao");
        return modelAndView;
    }
    //完成条件查询
    @PostMapping("/quxiao")
    public ModelAndView wanchengs(Integer order_id) {
        ModelAndView modelAndView = new ModelAndView();
        Page page = new Page();
        page.setJilu(1);
        Integer orders = orderService.count4();
        Integer ter = orderService.count2();//查询数量
        Integer ters = orderService.count3();
        page.setTiaoshu(orders);
        List<Order> lists = orderService.getorder4(order_id,(page.getJilu() - 1) * page.getPagesize(), page.getPagesize());
        List<Servicelei> lei=orderService.getlei();
        Integer co=orderService.count();
        Integer cooo=orderService.count1();
        modelAndView.addObject("cocoo",orders);
        modelAndView.addObject("cococo",ters);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("co",co);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list", lists);
        modelAndView.addObject("coco", ter);
        modelAndView.addObject("page", page);
        modelAndView.setViewName("quxiao");
        return modelAndView;
    }

    //分页，上一页，首页，下一页，末页
    @GetMapping("/yessss")
    public ModelAndView getyessss(Integer order_id,int pages){
        if(pages==0){
            pages=1;
        }

        Page page=new Page();
        page.setJilu(pages);

        Integer sers=orderService.count4();
        page.setTiaoshu(sers);
        if(pages>page.getZongtiao()){
            pages=page.getZongtiao();
            page.setJilu(pages);
        }
        List<Order> listss=orderService.getorder4(order_id,(page.getJilu()-1)*page.getPagesize(),page.getPagesize());
        ModelAndView modelAndView=new ModelAndView();
        List<Servicelei> lei=orderService.getlei();
        Integer co=orderService.count();
        Integer cooo=orderService.count1();
        Integer coo=orderService.count2();
        Integer ser=orderService.count3();
        int cous=orderService.count4();
        modelAndView.addObject("cocoo",cous);
        modelAndView.addObject("coo",cooo);
        modelAndView.addObject("co",co);
        modelAndView.addObject("lei",lei);
        modelAndView.addObject("list",listss);
        modelAndView.addObject("page",page);
        modelAndView.addObject("coco",coo);
        modelAndView.addObject("cococo",ser);
        modelAndView.setViewName("quxiao");
        return modelAndView;
    }

    //完成订单
    @GetMapping("/wan")
    public ModelAndView getwan(int id) {
        ModelAndView modelAndView = new ModelAndView();
        Integer ups = orderService.getupdate3(id);
        if (ups > 0) {
            modelAndView.setViewName("redirect:/fuwu");
            return modelAndView;
        }else{
            modelAndView.setViewName("fuwu");
            return modelAndView;
        }
    }
    //取消订单
    @GetMapping("/qu")
    public ModelAndView getqu(int id) {
        ModelAndView modelAndView = new ModelAndView();
        Integer ups = orderService.getupdate4(id);
        if (ups > 0) {
            modelAndView.setViewName("redirect:/fuwu");
            return modelAndView;
        }else{
            modelAndView.setViewName("fuwu");
            return modelAndView;
        }
    }
}
