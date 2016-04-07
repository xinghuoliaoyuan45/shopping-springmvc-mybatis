 package com.entity;
 
 public class Scanbarcode
 {
   private String productCode;
   private String scanCode;
 
   public Scanbarcode()
   {
   }
 
   public Scanbarcode(String productCode, String scanCode)
   {
     this.productCode = productCode;
    this.scanCode = scanCode;
   }
   public String getProductCode() {
     return this.productCode;
   }
   public void setProductCode(String productCode) {
     this.productCode = productCode;
   }
   public String getScanCode() {
     return this.scanCode;
   }
   public void setScanCode(String scanCode) {
    this.scanCode = scanCode;
   }
 }

