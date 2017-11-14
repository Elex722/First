package com.Yt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Yt.pojo.product;
import com.Yt.service.productService;
@Controller
public class productController {
	@Autowired
	private productService ps;

	public productService getPs() {
		return ps;
	}

	public void setPs(productService ps) {
		this.ps = ps;
	}
	@RequestMapping("/getAll")
	public String getAll(@RequestParam(defaultValue="1")int pageindex, HttpServletRequest request,HttpServletResponse response){
		if (pageindex < 1) {
			return "index.jsp";
		}else {
			int begin = (pageindex-1)*2;
			List<product> list = ps.getAll(begin,2);
			request.getSession().setAttribute("list", list);
			int count = ps.count();
			int countpage = count%2==0?count/2:count/2+1;
			if (pageindex>countpage) {
				pageindex=countpage;
			}
			request.getSession().setAttribute("pageindex",pageindex);
			request.getSession().setAttribute("countpage", countpage);
			return "index.jsp";
		}
	}
	@RequestMapping("/delInfo")
	public String delInfo(HttpServletRequest request,HttpServletResponse response){
		int id = Integer.valueOf(request.getParameter("id"));
		if (ps.delInfo(id)>0) {
			System.out.println("删除成功");
			return "getAll";
		}else {
			System.out.println("删除失败");
			return "index.jsp";
		}
	}
	@RequestMapping("/addInfo")
	public String addInfo(HttpServletRequest request,HttpServletResponse response){
		product p = new product();
		p.setProductname(request.getParameter("productname"));
		p.setDescs(request.getParameter("descs"));
		p.setCid(Integer.valueOf(request.getParameter("cid")));
		if (ps.addInfo(p)>0) {
			System.out.println("新增成功");
			return "getAll";
		}else {
			System.out.println("新增失败");
			return "addjsp.jsp";
		}
	}
}
