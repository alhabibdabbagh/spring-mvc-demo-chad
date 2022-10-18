package com.controller;

import com.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Habib
 * @on 10/18/22 - 8:28 AM
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {


    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        theModel.addAttribute("customer",new Customer());
        return "custmer";
    }
}
