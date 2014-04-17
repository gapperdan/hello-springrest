package com.gapperdan.hellospringrest.controller;

import com.gapperdan.hellospringrest.domain.Person;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;
import java.util.UUID;

@Controller
@RequestMapping("hello-springrest")
public class HelloController {

    private Random random = new Random();

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

    @RequestMapping(value = "rest/person")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Person helloPerson() {

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(99);
        person.setUid(UUID.randomUUID().toString().substring(0,7));

        return person;
    }

    @RequestMapping(value = "rest/person/create", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Person createPerson(@RequestBody Person _person) {

        Person person = new Person();
        person.setFirstName(_person.getFirstName());
        person.setLastName(_person.getLastName());
        person.setAge(_person.getAge());
        person.setUid(UUID.randomUUID().toString().substring(0,7));


        return person;
    }

}