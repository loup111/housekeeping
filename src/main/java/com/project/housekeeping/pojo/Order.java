package com.project.housekeeping.pojo;


public class Order {

  private int id;
  private Integer order_id;
  private int server_type;
  private int server_project;
  private int staff_state;
  private int staff_service;
  private String interview_date;
  private String server_date;
  private String num_money;
  private String order_status;
  private String servicename;
  private String service_scope;
  private String name;
  private String health;
  private String state;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Integer getOrder_id() {
    return order_id;
  }

  public void setOrder_id(Integer order_id) {
    this.order_id = order_id;
  }

  public int getServer_type() {
    return server_type;
  }

  public void setServer_type(int server_type) {
    this.server_type = server_type;
  }

  public int getServer_project() {
    return server_project;
  }

  public void setServer_project(int server_project) {
    this.server_project = server_project;
  }

  public int getStaff_state() {
    return staff_state;
  }

  public void setStaff_state(int staff_state) {
    this.staff_state = staff_state;
  }

  public int getStaff_service() {
    return staff_service;
  }

  public void setStaff_service(int staff_service) {
    this.staff_service = staff_service;
  }

  public String getInterview_date() {
    return interview_date;
  }

  public void setInterview_date(String interview_date) {
    this.interview_date = interview_date;
  }

  public String getServer_date() {
    return server_date;
  }

  public void setServer_date(String server_date) {
    this.server_date = server_date;
  }

  public String getNum_money() {
    return num_money;
  }

  public void setNum_money(String num_money) {
    this.num_money = num_money;
  }

  public String getOrder_status() {
    return order_status;
  }

  public void setOrder_status(String order_status) {
    this.order_status = order_status;
  }

  public String getServicename() {
    return servicename;
  }

  public void setServicename(String servicename) {
    this.servicename = servicename;
  }

  public String getService_scope() {
    return service_scope;
  }

  public void setService_scope(String service_scope) {
    this.service_scope = service_scope;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getHealth() {
    return health;
  }

  public void setHealth(String health) {
    this.health = health;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
