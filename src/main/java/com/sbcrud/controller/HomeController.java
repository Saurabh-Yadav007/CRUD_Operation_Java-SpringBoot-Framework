package com.sbcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbcrud.model.Student;
import com.sbcrud.servicei.HomeServiceI;

@Controller
public class HomeController {

	@Autowired
	HomeServiceI hs;
	
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	@RequestMapping("/opensuccess")
	public String openSuccess(@RequestParam("uname") String un, @RequestParam("password") String ps, Model m)
	{
		Student std = hs.loginCheck(un, ps);
		if(std!=null)
		{
			Iterable<Student> stuList = hs.displayAll();
			m.addAttribute("data", stuList);
			return "success";
		}
		else
		{
			return "login";
		}
	}
	
	@RequestMapping("/openregister")
	public String openReg()
	{
		return "register";
	}
	
	@RequestMapping("/save")
	public String saveData(@ModelAttribute Student s)
	{
		hs.saveData(s);
		return "login";
	}
	
	@RequestMapping("/edit")
	public String editPage(@RequestParam("uid") int uid, Model m)
	{
		Student stu = hs.editData(uid);
		m.addAttribute("data", stu);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updateSt(@ModelAttribute Student s, Model m)
	{
		hs.saveData(s);
		Iterable<Student> displayAll = hs.displayAll();
		m.addAttribute("data", displayAll);
		return "success";
	}
	
	@RequestMapping("/delete")
	public String deleteSt(@ModelAttribute Student s, Model m)
	{
		hs.deleteData(s);
		Iterable<Student> displayAll = hs.displayAll();
		m.addAttribute("data", displayAll);
		return "success";
	}
	
	
}
