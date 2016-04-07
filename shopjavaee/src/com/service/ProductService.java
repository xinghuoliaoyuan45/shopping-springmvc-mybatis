 package com.service;
 
 import com.dao.ProductDao;
 import com.entity.Product;
 import java.util.List;
 
 public class ProductService
 {
   private ProductDao productdao;
 
   public void setProductdao(ProductDao productdao)
   {
     this.productdao = productdao;
   }
 
   public ProductDao getProductdao()
   {
     return this.productdao;
   }
 
   public void addproduct(Product product)
     throws Exception
   {
     this.productdao.add(product);
   }
 
   public void deletebyid(String id)
     throws Exception
   {
     this.productdao.delete(id);
   }
 
   public void updatesaleproduct(Product product)
     throws Exception
   {
     this.productdao.updateproduct(product);
   }
 
   public void updatenumberproduct(Product product)
     throws Exception
   {
    this.productdao.updateproductnumber(product);
   }
 
   public void updatenumberjian1product(String code)
     throws Exception
   {
     Product product = this.productdao.findbyProductcode(code);
     int number = product.getProductNumber();
     number--;
     product.setProductNumber(number);
    this.productdao.updateproductnumber(product);
   }
 
   public List<Product> findbyid(String id)
     throws Exception
   {
     List product = this.productdao.findByid(id);
    return product;
   }
 
   public List<Product> findbyname(String name)
     throws Exception
   {
    List product = this.productdao.findByname(name);
    return product;
   }
 
   public List<Product> findallproduct()
     throws Exception
   {
    List products = this.productdao.findAll();
     return products;
   }
 
   public Product findbyproductcode(String produtcode)
     throws Exception
   {
     Product productfindbyproductcode = this.productdao.findbyProductcode(produtcode);
     return productfindbyproductcode;
   }
 }
