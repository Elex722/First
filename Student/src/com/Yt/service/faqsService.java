package com.Yt.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.Yt.pojo.classes;
import com.Yt.pojo.faqs;

public interface faqsService {
	List<faqs> getPage(@Param("b")int begin, @Param("s") int size);
	
	int count();
	
	int delInfo(int id);
	
	List<classes> getCname();
	
	int addInfo(faqs f);
}
