package com.Yt.pojo;

import java.util.List;

public class classes {
	private int id;
	private String cname;
	private List<faqs> faqs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<faqs> getFaqs() {
		return faqs;
	}
	public void setFaqs(List<faqs> faqs) {
		this.faqs = faqs;
	}
}
