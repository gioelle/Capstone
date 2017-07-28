package com.joelle.capstone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.joelle.models.User;

@Controller
public class LoginController {
//    @RequestMapping(value = "login", method = RequestMethod.GET)
//    public String init(Model model) {
//        model.addAttribute("msg", "Please Enter Your Login Details");
//        return "login.jsp";
//    }
 
    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public String submit(Model model,
            @ModelAttribute("loginBean") LoginBean loginBean) {
    	
    	System.out.println("inside loginbean" + loginBean.getUserName() + loginBean.getPassword());
    	//Checks that the loginbean isn't empty, that username and password aren't empty
        if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
            if (loginBean.getUserName().equals("user@user.com") && loginBean.getPassword().equals("pass")) {
            	//Make a method call to DAO to get the user/account model object.
            	
            	User user = new User(); //userService.find(loginBean.getUserName(), loginBean.getPassword())
            //	user.setTransactions(userService.getTransaction(user.getEmail()));
            	model.addAttribute("u", user);
                return "account";
            } else {
                model.addAttribute("error", "Invalid Details");
                return "home";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "home";
        }
    }
    
    @RequestMapping(value = "/RegistrationServlet", method = RequestMethod.POST)
    public String sumbit(Model model,
    		@ModelAttribute("registrationBean") RegistrationBean registrationBean) {
    	if(registrationBean != null) {
    		return "account";
    	} else {
    		return "home";
    	}
    }
}
