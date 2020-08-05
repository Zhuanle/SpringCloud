package com.example.viewservicefeign.controller;

import com.example.viewservicefeign.service.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
  @Autowired MyFeignClient feignClient;
  @GetMapping("/hi")
  public String sayHi(@RequestParam String name){
    String result = this.feignClient.sayHiFromClientOne(name);
    return result;
  }
}
