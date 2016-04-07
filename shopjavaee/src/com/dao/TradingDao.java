package com.dao;

import com.entity.Trading;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TradingDao {
	private SqlSessionFactory sqlSessionFactory;

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public void addtrading(Trading trade) {
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		sqlSession.insert("TradingNamespace.add", trade);
		sqlSession.close();
	}

	public List<Trading> findalltrade() {
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		List tradings = sqlSession.selectList("TradingNamespace.find");
		return tradings;
	}

	public List<Trading> findbymoneybig(int money) {
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		List tradings = sqlSession.selectList("TradingNamespace.findbymoney",
				Integer.valueOf(money));
		return tradings;
	}
}
