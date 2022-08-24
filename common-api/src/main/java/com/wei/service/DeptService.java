package com.wei.service;

import com.wei.dto.DeptDTO;

import java.util.List;

public interface DeptService {
    public DeptDTO add(DeptDTO deptDTO);
    public DeptDTO get(long deptno);
    public List<DeptDTO> list();
}
