 package com.entity;
 
 public class Trading
 {
   private int businessRunWater;
   private String dealDate;
   private int money;
 
   Trading()
   {
   }
 
   public String toString()
   {
     return "Trading [businessRunWater=" + this.businessRunWater + ", dealDate=" + 
       this.dealDate + ", money=" + this.money + "]";
   }
 
   public Trading(String dealDate, int money)
   {
     this.dealDate = dealDate;
     this.money = money;
   }
   public int getBusinessRunWater() {
     return this.businessRunWater;
   }
   public void setBusinessRunWater(int businessRunWater) {
    this.businessRunWater = businessRunWater;
   }
   public String getDealDate() {
     return this.dealDate;
   }
   public void setDealDate(String dealDate) {
     this.dealDate = dealDate;
   }
   public int getMoney() {
     return this.money;
   }
   public void setMoney(int money) {
     this.money = money;
   }
 }

