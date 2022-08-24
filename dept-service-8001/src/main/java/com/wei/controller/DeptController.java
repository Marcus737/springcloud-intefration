package com.wei.controller;

import com.wei.dao.DeptDao;
import com.wei.dto.DeptDTO;
import com.wei.service.DeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Resource
    DeptService deptService;

    @PostMapping("/add")
    public Object add(@RequestBody DeptDTO deptDTO){
        return deptService.add(deptDTO);
    }

    @GetMapping("/get/{deptno}")
    public Object get(@PathVariable("deptno")long deptno){
        return deptService.get(deptno);
    }


    @GetMapping("/list")
    public Object list(){
        return deptService.list();
    }
}
