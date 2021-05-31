package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bean.Employee;
import com.example.impl.EmployeeRepoImpl;

@Controller
public class MainController 
{
	@Autowired
	private EmployeeRepoImpl erepoimpl;	
	
																//Goto index Page
	@RequestMapping("/")
	public String view()
	{
		return "index";
	}
																//Goto Register Page
	@RequestMapping("/register")
	public String view1()
	{
		return "registerPage";
	}
																//Save Employee Record
	@RequestMapping(value="/insert", method = RequestMethod.POST)
	public String view2(Employee emp, Model m)
	{
		erepoimpl.save(emp);
		m.addAttribute("msg", "Record insert successfully...");
		return "registerPage";
	}
																//Display All Employee Record
	@RequestMapping(value="/display", method = RequestMethod.GET)
	public String view3(Model m)
	{
		List list = erepoimpl.findAll();
		if(!list.isEmpty())
		{
			m.addAttribute("data", list);
		}
		else
		{
			m.addAttribute("msg", "Sorry record not found!");
		}
		return "displayPage";
	}
															//Update Employee Record Method-1
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String view4(Employee emp, Model m)
	{
		emp.setId(emp.getId());
		erepoimpl.save(emp);
		m.addAttribute("data", erepoimpl.findAll());
		m.addAttribute("msgs", "Record update successfully...");
		return "displayPage";
	} 
															//Update Employee Record Method-2
/*	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String view5(Employee emp, Model m)
	{
		erepoimpl.update(emp);
		m.addAttribute("data", erepoimpl.findAll());
		m.addAttribute("msgs", "Record update successfully...");
		return "displayPage";
	} 
*/
																//Delete Employee Record
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public String view6(Employee emp, Model m)
	{
		erepoimpl.deleteById(emp.getId());
		m.addAttribute("data", erepoimpl.findAll());
		m.addAttribute("msgss", "Delete successfully...");
		return "displayPage";
	}
																//Goto Seacrh Page
	@RequestMapping("/search")
	public String view7()
	{
		return "searchPage";
	}
																//Search Employee Record
	@RequestMapping(value="/find", method = RequestMethod.GET)
	public String view8(String empid,String empname,String address,String gender,Model m)
	{
		List<Employee> list = new ArrayList<Employee>();
		if(!empid.isEmpty())
		{
			list = erepoimpl.findByEmpid(empid);
		}
		else if(!empname.isEmpty())
		{
			list = erepoimpl.findByEmpname(empname);
		}
		else if(!address.isEmpty())
		{
			list = erepoimpl.findByAddress(address);
		}
		else if(!gender.isEmpty())
		{
			list = erepoimpl.findByGender(gender);
		}
		//Check list is empty or not.
		if(!list.isEmpty())
		{
			m.addAttribute("data", list);
		}
		else {
			m.addAttribute("msg", "Sorry record not found!");
		}
		return "searchPage";
	}
																//Delete All Employee Record
	@RequestMapping(value="/deleteall")
	public String view9(Model m)
	{
		List list = erepoimpl.findAll();
		if(!list.isEmpty())
		{
			erepoimpl.deleteAll();
			m.addAttribute("msg", "All record deleted!");
		}
		else {
			m.addAttribute("msgs", "Sorry record not found!");
		}
		return "index";
	}
}
