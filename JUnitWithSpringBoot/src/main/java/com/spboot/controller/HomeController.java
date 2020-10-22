package com.spboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spboot.model.Teststudent;
@RestController
public class HomeController {
	
	
@RequestMapping( "/getdata")
public Teststudent m1()
{
	System.out.println("changes made");
	System.out.println("In get data");
	Teststudent s= new Teststudent();
	s.setSid(1);
	s.setSname("snehal");
	s.setSaddr("Pune");
	System.out.println("Data is: "+s);
	return s;
}


}
