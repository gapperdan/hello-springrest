package com.gapperdan.hellospringrest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("hello-springrest")
public class HelloController {

    @RequestMapping(value = "rest/hello", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String hello() {
        return "Hello Spring REST!";
    }

    @RequestMapping(value = "rest/hello/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String helloName(@PathVariable String name) {
        return "Hello there, " + name;
    }

}
