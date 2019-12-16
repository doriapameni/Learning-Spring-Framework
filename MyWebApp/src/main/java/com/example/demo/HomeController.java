package com.example.demo;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
  
 /**
  * using servlet
  */
  
 /*
  @RequestMapping("home")
  public String home (HttpServletRequest req, HttpServletResponse res) {
    String name = req.getParameter("name");
    //why do we need session?
    //because we are adding data in the page
    HttpSession session = req.getSession();
    System.out.println("hi " + name);
    //if you input this in the browser : http://localhost:8080/home?name=gaelle
    //it print "hi gaelle"
    session.setAttribute("name", name);
    return "home"; //view name
  }
  */
  
  /**
   * using MVC
   */
 
  /*@RequestMapping("home")
  public ModelAndView home (@RequestParam("name") String myName) {
    ModelAndView mv = new ModelAndView();
    mv.addObject("name", myName);
    mv.setViewName("home");
    return mv; 
  }
  */
  
  /**
   * using Spring Boot Model Object
   * 
   * note that this is not using REST services
   * 
   */
 
  @RequestMapping("home")
  public ModelAndView home(Alien alien) {
    ModelAndView mv = new ModelAndView();
    mv.addObject("obj", alien);
    mv.setViewName("home");
    return mv; 
    //if you put this in the browser : http://localhost:8080/home?aid=1&aname=navin&lang=java
    //it prints Welcome 1, navin, java
  }
    
  
 
   
  
}
