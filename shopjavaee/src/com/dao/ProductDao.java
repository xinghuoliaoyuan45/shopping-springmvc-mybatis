 package com.dao;
 
 import com.entity.Product;
 import java.util.List;
 import org.apache.ibatis.session.SqlSession;
 import org.apache.ibatis.session.SqlSessionFactory;
 
 public class ProductDao
 {
   private SqlSessionFactory sqlSessionFactory;
 
   public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
   {
    this.sqlSessionFactory = sqlSessionFactory;
   }
 
   public void add(Product product)
     throws Exception
   {
     SqlSession sqlSession = this.sqlSessionFactory.openSession();
     sqlSession.insert("ProductNamespace.add", product);
     sqlSession.close();
   }
 
   public void updateproduct(Product product)
     throws Exception
   {
    SqlSession sqlSession = this.sqlSessionFactory.openSession();
    sqlSession.update("ProductNamespace.updateproduct", product);
 
     sqlSession.close();
   }
 
   public void updateproductnumber(Product product)
     throws Exception
   {
    SqlSession sqlSession = this.sqlSessionFactory.openSession();
    sqlSession.update("ProductNamespace.updatenumberproduct", product);
 
     sqlSession.close();
   }
 
   public void delete(String id)
     throws Exception
   {
     SqlSession sqlSession = this.sqlSessionFactory.openSession();
     sqlSession.delete("ProductNamespace.deleteproduct", id);
 
    sqlSession.close();
   }
 
   public List<Product> findAll()
     throws Exception
   {
     SqlSession sqlSession = this.sqlSessionFactory.openSession();
    return sqlSession.selectList("ProductNamespace.findAll");
   }
 
   public List<Product> findByid(String id)
     throws Exception
   {
    SqlSession sqlSession = this.sqlSessionFactory.openSession();
    return sqlSession.selectList("ProductNamespace.findbyid", id);
   }
 
   public List<Product> findByname(String name)
     throws Exception
   {
     SqlSession sqlSession = this.sqlSessionFactory.openSession();
     return sqlSession.selectList("ProductNamespace.findbyname", name);
   }
 
   public Product findbyProductcode(String code)
     throws Exception
   {
     SqlSession sqlSession = this.sqlSessionFactory.openSession();
    return (Product)sqlSession.selectOne("ProductNamespace.findbyproductcode", code);
   }
 }

