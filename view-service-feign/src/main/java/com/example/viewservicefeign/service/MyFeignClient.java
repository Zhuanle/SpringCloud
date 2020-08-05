package com.example.viewservicefeign.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="dataservice")
public interface MyFeignClient {
  @GetMapping(value="/hi")
  String sayHiFromClientOne(@RequestParam(value="name") String name);
}
