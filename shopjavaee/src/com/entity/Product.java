 package com.entity;
 
 public class Product
 {
   private String productId;
   private String productName;
   private String productCode;
   private String productClass;
   private int pdSalePrice;
   private int pdPurchasePrice;
   private int productNumber;
 
   public Product()
   {
   }
 
   public Product(String productId, String productName)
   {
     this.productNumber = this.productNumber;
     this.productId = productId;
   }
   public Product(String productId, int pdSalePrice, int pdPurchasePrice) {
     this.productId = productId;
     this.pdSalePrice = pdSalePrice;
     this.pdPurchasePrice = pdPurchasePrice;
   }
 
   public Product(String productId, String productName, String productCode, String productClass, int pdSalePrice, int pdPurchasePrice, int productNumber)
   {
     this.productNumber = productNumber;
     this.productId = productId;
     this.productName = productName;
     this.productCode = productCode;
     this.productClass = productClass;
     this.pdSalePrice = pdSalePrice;
     this.pdPurchasePrice = pdPurchasePrice;
   }
   public String getProductId() {
     return this.productId;
   }
   public void setProductId(String productId) {
     this.productId = productId;
   }
   public String getProductName() {
    return this.productName;
   }
   public void setProductName(String productName) {
     this.productName = productName;
   }
   public String getProductCode() {
    return this.productCode;
   }
   public void setProductCode(String productCode) {
     this.productCode = productCode;
   }
   public String getProductClass() {
    return this.productClass;
   }
   public void setProductClass(String productClass) {
     this.productClass = productClass;
   }
   public int getPdSalePrice() {
     return this.pdSalePrice;
   }
   public void setPdSalePrice(int pdSalePrice) {
   this.pdSalePrice = pdSalePrice;
   }
   public int getPdPurchasePrice() {
    return this.pdPurchasePrice;
   }
   public void setPdPurchasePrice(int pdPurchasePrice) {
     this.pdPurchasePrice = pdPurchasePrice;
   }
   public int getProductNumber() {
     return this.productNumber;
   }
   public void setProductNumber(int productNumber) {
     this.productNumber = productNumber;
   }
 }

