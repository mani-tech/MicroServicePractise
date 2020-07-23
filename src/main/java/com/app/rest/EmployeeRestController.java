package com.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
	@Value("${server.port}")
	private int portNo;
	
	@GetMapping("/employee")
	public String getEmp()
	{
		return "From Employee Having the Port No is "+portNo;
	}

}
