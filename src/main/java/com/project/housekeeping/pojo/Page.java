package com.project.housekeeping.pojo;

import java.util.List;

public class Page {
    private int totalPage;  //总页
    private int pageSize;   //条数
    private int currPage;   //当前页数
    private int totalCount; //总记录数
    private List<Order> orderlist;//显示数据
    private int tiaoshu;//条数
    private int zongtiao;//总条数
    private int jilu;//记录数
    private int pagesize=10;//显示几条

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        if(totalCount>0) {
            this.totalCount = totalCount;
            totalPage=(this.totalCount%this.pageSize==0)?(this.totalCount/this.pageSize):(this.totalCount/this.pageSize+1);
        }
    }

    public List<Order> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(List<Order> orderlist) {
        this.orderlist = orderlist;
    }

    public int getTiaoshu() {
        return tiaoshu;
    }

    public void setTiaoshu(int tiaoshu) {
        this.tiaoshu = tiaoshu;
        this.zongtiao=tiaoshu%pagesize==0?this.tiaoshu/pagesize:tiaoshu/pagesize+1;
    }

    public int getZongtiao() {
        return zongtiao;
    }

    public void setZongtiao(int zongtiao) {
        this.zongtiao = zongtiao;
    }

    public int getJilu() {
        return jilu;
    }

    public void setJilu(int jilu) {
        this.jilu = jilu;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

}
