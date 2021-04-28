package io.weiyue.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import io.weiyue.entity.User;

public class UserMapperSpringTest extends SpringBaseTest{

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testQuery(){
		this.userMapper.getById(1L);
	}

	@Test
	public void test() {
		for (int i = 1; i < 3; i++) {
			User u1 = new User();
			u1.setId(i);
			u1.setName("wei1");
			u1.setAge("1");
			this.userMapper.insertUser(u1);
		}
	}
}
