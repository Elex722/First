package com.Yt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Yt.mapper.productMapper;
import com.Yt.pojo.product;
@Service("pp")
public class productServiceImpl implements productService {
	@Autowired
	private productMapper pm;
	public productMapper getPm() {
		return pm;
	}
	public void setPm(productMapper pm) {
		this.pm = pm;
	}
	public List<product> getAll(int begin, int size) {
		// TODO Auto-generated method stub
		return pm.getAll(begin, size);
	}
	public int count() {
		// TODO Auto-generated method stub
		return pm.count();
	}
	public int delInfo(int id) {
		// TODO Auto-generated method stub
		return pm.delInfo(id);
	}
	public int addInfo(product p) {
		// TODO Auto-generated method stub
		return pm.addInfo(p);
	}

}
