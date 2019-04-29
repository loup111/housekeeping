package com.project.housekeeping.pojo;


public class Login {

  private long id;
  private String nickname;
  private String password;
  private java.sql.Timestamp sDate;
  private long company;
  private String loginName;
  private String userName;
  private String phone;
  private String mobile;
  private java.sql.Timestamp startDate;
  private java.sql.Timestamp endDate;
  private long service;
  private String address;
  private String referra;
  private long status;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public java.sql.Timestamp getSDate() {
    return sDate;
  }

  public void setSDate(java.sql.Timestamp sDate) {
    this.sDate = sDate;
  }


  public long getCompany() {
    return company;
  }

  public void setCompany(long company) {
    this.company = company;
  }


  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public java.sql.Timestamp getStartDate() {
    return startDate;
  }

  public void setStartDate(java.sql.Timestamp startDate) {
    this.startDate = startDate;
  }


  public java.sql.Timestamp getEndDate() {
    return endDate;
  }

  public void setEndDate(java.sql.Timestamp endDate) {
    this.endDate = endDate;
  }


  public long getService() {
    return service;
  }

  public void setService(long service) {
    this.service = service;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getReferra() {
    return referra;
  }

  public void setReferra(String referra) {
    this.referra = referra;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

}
