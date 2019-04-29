package com.project.housekeeping.pojo;


public class Product {

  private long id;
  private String prName;
  private String prPrice;
  private long serviceItem;
  private String state;
  private String introduce;
  private String preference;
  private String icon;
  private String picture;
  private String introducePicture;
  private String priceMin;
  private String priceMax;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getPrName() {
    return prName;
  }

  public void setPrName(String prName) {
    this.prName = prName;
  }


  public String getPrPrice() {
    return prPrice;
  }

  public void setPrPrice(String prPrice) {
    this.prPrice = prPrice;
  }


  public long getServiceItem() {
    return serviceItem;
  }

  public void setServiceItem(long serviceItem) {
    this.serviceItem = serviceItem;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }


  public String getPreference() {
    return preference;
  }

  public void setPreference(String preference) {
    this.preference = preference;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }


  public String getIntroducePicture() {
    return introducePicture;
  }

  public void setIntroducePicture(String introducePicture) {
    this.introducePicture = introducePicture;
  }


  public String getPriceMin() {
    return priceMin;
  }

  public void setPriceMin(String priceMin) {
    this.priceMin = priceMin;
  }


  public String getPriceMax() {
    return priceMax;
  }

  public void setPriceMax(String priceMax) {
    this.priceMax = priceMax;
  }

}
