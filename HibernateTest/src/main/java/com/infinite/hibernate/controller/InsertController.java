package com.infinite.hibernate.controller;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.hibernate.dimpl.Cartimpl;
import com.infinite.hibernate.pojo.Cart;

@Controller
public class InsertController {
	private static final Logger logger = Logger.getLogger(InsertController.class);
	private ApplicationContext con;
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public String insert(@ModelAttribute("bean") Cart p,Model m){
		con=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Cartimpl obj=con.getBean("dao",Cartimpl.class);
		obj.saveData(p);
		String Name=p.getName();
		int Price=p.getAmount();
		int Quantity=p.getQuantity();
		float Total=p.getTotalprice();
		m.addAttribute("msg",Name); 
		logger.info("inserted");
		return "inserted";	
	}
}





	

