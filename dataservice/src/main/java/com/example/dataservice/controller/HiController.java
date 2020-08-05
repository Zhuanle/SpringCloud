package com.example.dataservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
  @Value("${server.port}")
  String port;

  @RequestMapping("/hi")
  public String hi(@RequestParam(value = "name",defaultValue = "minbo") String name){
    String result = "hi "+name +" ,i am port "+port;
    System.out.println(result);
    return result;
  }
}
