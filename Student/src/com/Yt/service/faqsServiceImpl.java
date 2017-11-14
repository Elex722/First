package com.Yt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yt.mapper.faqsMapper;
import com.Yt.pojo.classes;
import com.Yt.pojo.faqs;
@Service
public class faqsServiceImpl implements faqsService {
	@Autowired
	private faqsMapper fm;
	public faqsMapper getFm() {
		return fm;
	}

	public void setFm(faqsMapper fm) {
		this.fm = fm;
	}

	public List<faqs> getPage(int begin, int size) {
		// TODO Auto-generated method stub
		return fm.getPage(begin, size);
	}

	public int count() {
		// TODO Auto-generated method stub
		return fm.count();
	}

	public int delInfo(int id) {
		// TODO Auto-generated method stub
		return fm.delInfo(id);
	}

	public List<classes> getCname() {
		// TODO Auto-generated method stub
		return fm.getCname();
	}

	public int addInfo(faqs f) {
		// TODO Auto-generated method stub
		return fm.addInfo(f);
	}

}
