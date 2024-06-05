
package com.nani.springbootwebapp;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String result(@RequestParam("num1")int n1,@RequestParam("num2")int n2,Model model){
        
        // int n1=Integer.parseInt(req.getParameter("n1"));
        // int n2=Integer.parseInt(req.getParameter("n2"));

        System.out.println(n1+n2);
        int  val=n1+n2;
        
        model.addAttribute("val", val);

        return "result";
    }

}
