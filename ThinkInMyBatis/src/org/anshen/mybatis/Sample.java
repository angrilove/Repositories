package org.anshen.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Sample {
	
	
	static {
		String resource = "org/anshen/mybatis/Configration.xml";
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			
			SqlSession sqlSession = sqlSessionFactory.openSession();
			sqlSession.getMapper(Object.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
