package com.dao;

import com.entity.Emp;
import java.io.PrintStream;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDao {
	private SqlSessionFactory sqlSessionFactory;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public void add(Emp emp) throws Exception {
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		sqlSession.insert("empNamespace.add", emp);
		sqlSession.close();
	}

	public List<Emp> findemp() throws Exception {
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		return sqlSession.selectList("empNamespace.findemp");
	}

	public List<Emp> findempbyname(String name) {
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		return sqlSession.selectList("empNamespace.findempbyname", name);
	}

	public void deleteemp(String id) {
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		sqlSession.delete("empNamespace.deleteemp", id);
		sqlSession.close();
	}

	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "spring.xml" });
		EmpDao empdao = (EmpDao) ac.getBean("empDaoID");

		List<Emp> emp = empdao.findempbyname("马骁尧");
		for (Emp ep : emp) {
			System.out.println(ep.getEmpId() + " " + ep.getEmpName());
		}
	}
}
