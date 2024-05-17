
package com.nani.springbootwebapp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Home method called");
		return "index";
	}

    @RequestMapping("add")
    public String result(HttpServletRequest req,HttpSession res){
        
        int n1=Integer.parseInt(req.getParameter("num1"));
        int n2=Integer.parseInt(req.getParameter("num2"));

        System.out.println(n1+n2);
        int  val=n1+n2;
        
        res.setAttribute("val", val);

        return "result";
    }

}
