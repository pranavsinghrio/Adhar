package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    Service service;

    @PostMapping("/saveAdhar")

    public String saveAdhar(@RequestParam("id") Long id, @RequestParam("name")String name)
    {
        service.saveAdhar(id,name);
        return "Success";
    }

    @GetMapping("/getById")
    public String getnamebyId(@RequestParam("id") Long id)
    {
        return  service.getnamebyId(id);
}
}