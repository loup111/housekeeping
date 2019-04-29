package com.project.housekeeping.pojo;


public class Discounts {

  private long id;
  private long discountType;
  private String discountMoney;
  private String minMoney;
  private long firstImpose;
  private long superposition;
  private long discountCount;
  private java.sql.Timestamp useDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDiscountType() {
    return discountType;
  }

  public void setDiscountType(long discountType) {
    this.discountType = discountType;
  }


  public String getDiscountMoney() {
    return discountMoney;
  }

  public void setDiscountMoney(String discountMoney) {
    this.discountMoney = discountMoney;
  }


  public String getMinMoney() {
    return minMoney;
  }

  public void setMinMoney(String minMoney) {
    this.minMoney = minMoney;
  }


  public long getFirstImpose() {
    return firstImpose;
  }

  public void setFirstImpose(long firstImpose) {
    this.firstImpose = firstImpose;
  }


  public long getSuperposition() {
    return superposition;
  }

  public void setSuperposition(long superposition) {
    this.superposition = superposition;
  }


  public long getDiscountCount() {
    return discountCount;
  }

  public void setDiscountCount(long discountCount) {
    this.discountCount = discountCount;
  }


  public java.sql.Timestamp getUseDate() {
    return useDate;
  }

  public void setUseDate(java.sql.Timestamp useDate) {
    this.useDate = useDate;
  }

}
