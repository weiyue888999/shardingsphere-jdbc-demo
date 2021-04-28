package io.weiyue.mapper;

import io.weiyue.entity.User ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
	
	User getById(Long id);
	
	int insertUser(User user);
	
	boolean deleteUser(Long id);
}