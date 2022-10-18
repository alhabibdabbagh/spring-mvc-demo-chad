package com.controller;

import com.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Habib
 * @on 8/5/22 - 3:46 PM
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/showpage")
    public String showPage() {
        return "menu";
    }

    @RequestMapping("/showform")
    public String showForm() {
        return "show-form";
    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        theModel.addAttribute("customer",new Customer());
        return "custmer";
    }


    @RequestMapping("/processForm")
    public String processForm(Model model, HttpServletRequest request) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        model.addAttribute("resu2lt", name);
        return "show-process";
    }
}
