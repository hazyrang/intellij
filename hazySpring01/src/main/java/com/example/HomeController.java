package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hazyrang on 2016. 3. 15..
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String helloworld() {
        return "Hello World!!!!";
    }
}
