package com.prashant.page.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/petapp")
public class DepartingPageController {

    @GetMapping("/departing")
    public String returnDepartingPage() {
        return "departingpage";
    }
}
