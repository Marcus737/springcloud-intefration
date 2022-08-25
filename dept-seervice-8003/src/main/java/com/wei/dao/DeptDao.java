package com.wei.dao;

import com.wei.po.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptDao extends JpaRepository<Dept, Long> {

}
