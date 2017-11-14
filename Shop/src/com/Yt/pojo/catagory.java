package com.Yt.pojo;

import java.util.List;

public class catagory {
	private int id;
	private String name;
	private String explain;
	private List<product> pro;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExplain() {
		return explain;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	public List<product> getPro() {
		return pro;
	}
	public void setPro(List<product> pro) {
		this.pro = pro;
	}
}
