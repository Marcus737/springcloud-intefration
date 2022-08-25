package com.wei.controller;

import com.wei.dto.DeptDTO;
import com.wei.service.DeptService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Resource
    DeptService deptService;

    @PostMapping("/add")
    @ApiOperation(value = "增加部门", notes = "增加部门数据")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "dept", value = "部门实体", required = true, dataType = "DeptDTO")
    })
    public Object add(@RequestBody DeptDTO deptDTO){
        return deptService.add(deptDTO);
    }

    @ApiOperation(value = "获取一个部门", notes = "根据部门编号获取其信息")
    @GetMapping("/get/{deptno}")
    public Object get(@PathVariable("deptno")long deptno){
        return deptService.get(deptno);
    }


    @GetMapping("/list")
    @ApiOperation(value = "部门信息列表", notes = "获取部门信息列表")
    public Object list(){
        return deptService.list();
    }
}
