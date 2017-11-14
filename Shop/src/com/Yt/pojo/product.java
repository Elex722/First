package com.Yt.pojo;

public class product {
	private int id;
	private String productname;
	private String descs;
	private int cid;
	private catagory cata;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDescs() {
		return descs;
	}
	public void setDescs(String descs) {
		this.descs = descs;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public catagory getCata() {
		return cata;
	}
	public void setCata(catagory cata) {
		this.cata = cata;
	}
}
