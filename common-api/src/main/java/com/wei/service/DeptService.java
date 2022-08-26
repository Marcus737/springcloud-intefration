package com.wei.service;

import com.wei.dto.DeptDTO;
import com.wei.service.fallback.DeptServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@FeignClient(value = "dept-service", fallbackFactory = DeptServiceFallbackFactory.class)
public interface DeptService {
    @PostMapping("/dept/add")
    DeptDTO add(DeptDTO deptDTO);
    @GetMapping("/dept/get/{deptno}")
    DeptDTO get(@PathVariable("deptno") long deptno);
    @GetMapping("/dept/list")
    List<DeptDTO> list();
}
