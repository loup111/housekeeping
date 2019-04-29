package com.project.housekeeping.pojo;


public class ServiceSuffer {

  private long id;
  private String typeServe;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp endTime;
  private String description;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTypeServe() {
    return typeServe;
  }

  public void setTypeServe(String typeServe) {
    this.typeServe = typeServe;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
