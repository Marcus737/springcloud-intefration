package com.wei.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wei.dao.DeptDao;
import com.wei.dto.DeptDTO;
import com.wei.service.DeptService;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Resource
    DeptService deptService;

    @Resource
    DiscoveryClient client;

    @PostMapping("/add")
    @HystrixCommand
    public Object add(@RequestBody DeptDTO deptDTO){
        return deptService.add(deptDTO);
    }

    @GetMapping("/get/{deptno}")
    @HystrixCommand
    public Object get(@PathVariable("deptno")long deptno){
        return deptService.get(deptno);
    }


    @GetMapping("/list")
    @HystrixCommand
    public Object list(){
        return deptService.list();
    }

    @RequestMapping("/discover")
    public Object di(){
        return client;
    }
}
