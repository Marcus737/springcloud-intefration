package wei.service.impl;


import com.wei.dto.DeptDTO;

import com.wei.service.DeptService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import wei.dao.DeptDao;
import wei.po.Dept;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    DeptDao deptDao;

    @Override
    public DeptDTO add(DeptDTO deptDTO) {
        Dept po = new Dept();
        BeanUtils.copyProperties(deptDTO, po);
        DeptDTO returnTO = new DeptDTO();
        BeanUtils.copyProperties(deptDao.save(po), returnTO);
        return returnTO;
    }

    @Override
    public DeptDTO get(long deptno) {
        Dept dt = new Dept();
        dt.setDeptno(deptno);
        Dept dept = deptDao.findById(deptno).get();
        DeptDTO dto = new DeptDTO();
        BeanUtils.copyProperties(dept, dto);
        return dto;
    }

    @Override
    public List<DeptDTO> list() {
        List<DeptDTO> dtoList = new ArrayList<>();
        List<Dept> deptList = deptDao.findAll();
        deptList.forEach((dept) -> {
            DeptDTO dto = new DeptDTO();
            BeanUtils.copyProperties(dept, dto);
            dtoList.add(dto);
        });
        return dtoList;
    }
}
