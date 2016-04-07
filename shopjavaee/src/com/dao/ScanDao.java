 package com.dao;
 
 import com.entity.Scanbarcode;
 import org.apache.ibatis.session.SqlSession;
 import org.apache.ibatis.session.SqlSessionFactory;
 
 public class ScanDao
 {
   private SqlSessionFactory sqlSessionFactory;
 
   public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
   {
   this.sqlSessionFactory = sqlSessionFactory;
   }
 
   public void addScanbarcode(Scanbarcode scan)
     throws Exception
   {
    SqlSession sqlSession = this.sqlSessionFactory.openSession();
     sqlSession.insert("ScanNamespace.addscan", scan);
     sqlSession.close();
   }
   public void deleteScanbarcode(String scancode) throws Exception {
    SqlSession sqlSession = this.sqlSessionFactory.openSession();
     sqlSession.insert("ScanNamespace.deletescan", scancode);
     sqlSession.close();
   }
   public Scanbarcode findScancode(String scancode) throws Exception {
   SqlSession sqlSession = this.sqlSessionFactory.openSession();
    return (Scanbarcode)sqlSession.selectOne("ScanNamespace.findScancode", scancode);
   }
 }

