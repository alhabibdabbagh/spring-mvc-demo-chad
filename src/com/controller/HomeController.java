package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Habib
 * @on 8/5/22 - 3:46 PM
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String showPage() {
        return "menu";
    }

    @RequestMapping("showform")
    public String showForm() {
        return "show-form";
    }

public String hgavStringString(Model mode)throws Exception  {
        return "hgav";
}
    @RequestMapping("processForm")
    public String processForm(Model model, HttpServletRequest request) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        model.addAttribute("resu2lt", name);
        return "show-process";
    }
}
