package com.project.housekeeping.pojo;


public class Grabsheet {

  private long id;
  private long orderId;
  private long serviceId;
  private Service service;
  private long budget;
  private java.sql.Timestamp interviewTime;
  private long paymentStatus;
  private String serviceAddress;
  private int singling_status;

  public int getSingling_status() {
    return singling_status;
  }

  public void setSingling_status(int singling_status) {
    this.singling_status = singling_status;
  }

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Service getService() {
    return service;
  }

  public void setService(Service service) {
    this.service = service;
  }

  public long getServiceId() {
    return serviceId;
  }

  public void setServiceId(long serviceId) {
    this.serviceId = serviceId;
  }


  public long getBudget() {
    return budget;
  }

  public void setBudget(long budget) {
    this.budget = budget;
  }


  public java.sql.Timestamp getInterviewTime() {
    return interviewTime;
  }

  public void setInterviewTime(java.sql.Timestamp interviewTime) {
    this.interviewTime = interviewTime;
  }


  public long getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(long paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public String getServiceAddress() {
    return serviceAddress;
  }

  public void setServiceAddress(String serviceAddress) {
    this.serviceAddress = serviceAddress;
  }

}
