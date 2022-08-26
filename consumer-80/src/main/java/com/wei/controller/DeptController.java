package com.wei.controller;

import com.wei.dto.DeptDTO;
import com.wei.service.DeptService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer/dept")
public class DeptController {

    private static final String ADD = "http://dept-service/dept/add";
    private static final String GET = "http://dept-service/dept/get";
    private static final String LIST = "http://dept-service/dept/list";

    @Resource
    RestTemplate restTemplate;

    @PostMapping("/add")
    public Object add(@RequestBody DeptDTO deptDTO){
        return restTemplate.getForObject(ADD, DeptDTO.class);
    }

    @GetMapping("/get/{deptno}")
    public Object get(@PathVariable("deptno")long deptno){

        return restTemplate.getForObject(GET, DeptDTO.class);
    }


    @GetMapping("/list")
    public Object list(){
        return restTemplate.getForObject(LIST, List.class);
    }
}
