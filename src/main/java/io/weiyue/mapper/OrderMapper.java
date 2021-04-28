package io.weiyue.mapper;

import io.weiyue.entity.Order;
import io.weiyue.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
	
	Order getById(Long id);

	List<Order> getListByUid(Long uid);
	
	int insertOrder(Order order);

	int deleteById(Long id);
}