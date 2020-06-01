package com.example.CoursesWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// This annotation tells the SpringBoot that this class is controller class.
public class CoursesController {
    @RequestMapping("/courses")
    // Maps the URL to this function
    public String courses(HttpServletRequest req){
        HttpSession sess=req.getSession();
        String cName=req.getParameter("cName");
        sess.setAttribute("cName",cName);
        System.out.println("Welcome Nikhil");
        return "course";
    }
}
