package com.Yt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.Yt.pojo.product;

public interface productMapper {
	
	List<product> getAll(@Param("b")int begin,@Param("s")int size);
	
	int count();
	
	int delInfo(int id);
	
	int addInfo(product p);
}
