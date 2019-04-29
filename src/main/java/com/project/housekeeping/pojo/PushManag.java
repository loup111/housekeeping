package com.project.housekeeping.pojo;


public class PushManag {

  private long id;
  private String pushTitle;
  private String pushType;
  private String pushContent;
  private java.sql.Timestamp pushDate;
  private String pushStatus;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPushTitle() {
    return pushTitle;
  }

  public void setPushTitle(String pushTitle) {
    this.pushTitle = pushTitle;
  }


  public String getPushType() {
    return pushType;
  }

  public void setPushType(String pushType) {
    this.pushType = pushType;
  }


  public String getPushContent() {
    return pushContent;
  }

  public void setPushContent(String pushContent) {
    this.pushContent = pushContent;
  }


  public java.sql.Timestamp getPushDate() {
    return pushDate;
  }

  public void setPushDate(java.sql.Timestamp pushDate) {
    this.pushDate = pushDate;
  }


  public String getPushStatus() {
    return pushStatus;
  }

  public void setPushStatus(String pushStatus) {
    this.pushStatus = pushStatus;
  }

}
