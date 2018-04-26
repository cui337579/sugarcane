package com.one.sugarcane.sellercoursetype.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.one.sugarcane.test.service.TestService;

@Controller
@RequestMapping("Test")
public class SellerCourseTypeService {

	@Resource
	private TestService testService;
	
	@RequestMapping(value="/test",method=RequestMethod.POST)
	public void testController() {
		System.out.println("asdf");
		this.testService.testService();
	}
}
