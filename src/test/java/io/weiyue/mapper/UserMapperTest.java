package io.weiyue.mapper;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.weiyue.entity.User;

public class UserMapperTest {

	private SqlSessionFactory sqlSessionFactory;

	//@Before
	public void setUp() throws Exception {
		try {
			InputStream inputStream = null;
			try {
				inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
			} catch (Exception e) {
				e.printStackTrace();
			}
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//@After
	public void cleanUp() {
		//
	}
}