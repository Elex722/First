package com.Yt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Yt.pojo.classes;
import com.Yt.pojo.faqs;
import com.Yt.service.faqsService;

@Controller
public class faqsController {
	@Autowired
	private faqsService fs;

	public faqsService getFs() {
		return fs;
	}

	public void setFs(faqsService fs) {
		this.fs = fs;
	}
	@RequestMapping("/getPage")
	public String getPage(@RequestParam(defaultValue="1")int pageindex, HttpServletRequest request,HttpServletResponse response){
		if (pageindex<1) {
			return "index.jsp";
		}else {
			int begin = (pageindex-1)*2;
			List<faqs> list = fs.getPage(begin, 2);
			request.getSession().setAttribute("list", list);
			request.getSession().setAttribute("pageindex", pageindex);
			int count = fs.count();
			int countpage = count%2==0?count/2:count/2+1;
			request.getSession().setAttribute("countpage", countpage);
			return "index.jsp";
		}
	}
	@RequestMapping("delInfo")
	public String delInfo(HttpServletRequest request,HttpServletResponse response){
		int id = Integer.valueOf(request.getParameter("id"));
		if (fs.delInfo(id)>0) {
			System.out.println("删除成功");
			return "getPage";
		}else {
			System.out.println("删除失败");
			return "index.jsp";
		}
	}
	@RequestMapping("getCname")
	public String getCname(HttpServletRequest request,HttpServletResponse response){
		List<classes> list = fs.getCname();
		request.getSession().setAttribute("list", list);
		return "addJsp.jsp";
	}
	@RequestMapping("addInfo")
	public String addInfo(HttpServletRequest request,HttpServletResponse response){
		faqs f = new faqs();
		f.setTitle(request.getParameter("title"));
		f.setContent(request.getParameter("content"));
		f.setClassid(Integer.valueOf(request.getParameter("cname")));
		if (fs.addInfo(f)>0) {
			System.out.println("添加成功");
			return "getPage";
		}else {
			System.out.println("添加失败");
			return "addJsp.jsp";
		}
	}
}
