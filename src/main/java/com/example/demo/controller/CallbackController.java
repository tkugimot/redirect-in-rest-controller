package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;

@RestController
public class CallbackController {

    @GetMapping("/callback")
    public RedirectView callback(HttpServletResponse response) throws InterruptedException {
        Thread.sleep(1000 * 3);
        System.out.println("You reached callback url :)");
        System.out.println("Go back to http://localhost:3000 again");
        return new RedirectView("http://localhost:3000");
    }
}
