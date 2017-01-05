package com.merkan.controller;

import com.merkan.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by volodymyr on 05.01.17.
 */

@Controller
@RequestMapping("/simplerequest")
public class CoolController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.POST)
    public String simpleAnswer() {
        return "Hello";
    }


}
