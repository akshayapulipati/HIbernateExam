package com.infinite.hibernate.controller;

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
public class DeleteController {
	private ApplicationContext con;
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String insert(@ModelAttribute("bean") Cart e,Model m){
		con=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Cartimpl obj=con.getBean("dao",Cartimpl.class);
		obj.saveData(e);
		int id=e.getId();
		//Session sessionobj = sessionFactory;
	//	m.addAttribute("msg",StudentName); 
		System.out.println("records deleted");
		return "delete";	
	}
}


