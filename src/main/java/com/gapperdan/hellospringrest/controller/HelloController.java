package com.gapperdan.hellospringrest.controller;

import com.gapperdan.hellospringrest.domain.Person;
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

    @RequestMapping(value = "rest/hello/person")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Person helloPerson() {

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(99);

        return person;
    }

}
