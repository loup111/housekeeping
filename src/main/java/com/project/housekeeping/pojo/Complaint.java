package com.project.housekeeping.pojo;


public class Complaint {

  private long id;
  private long orderId;
  private String compMan;
  private String phone;
  private java.sql.Timestamp compDate;
  private String compFrom;
  private String compType;
  private String compContent;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getCompMan() {
    return compMan;
  }

  public void setCompMan(String compMan) {
    this.compMan = compMan;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public java.sql.Timestamp getCompDate() {
    return compDate;
  }

  public void setCompDate(java.sql.Timestamp compDate) {
    this.compDate = compDate;
  }


  public String getCompFrom() {
    return compFrom;
  }

  public void setCompFrom(String compFrom) {
    this.compFrom = compFrom;
  }


  public String getCompType() {
    return compType;
  }

  public void setCompType(String compType) {
    this.compType = compType;
  }


  public String getCompContent() {
    return compContent;
  }

  public void setCompContent(String compContent) {
    this.compContent = compContent;
  }

}
