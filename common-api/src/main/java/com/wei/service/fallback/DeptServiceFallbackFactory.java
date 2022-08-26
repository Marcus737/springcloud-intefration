package com.wei.service.fallback;
import com.wei.dto.DeptDTO;
import com.wei.service.DeptService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DeptServiceFallbackFactory implements FallbackFactory<DeptService> {
    @Override
    public DeptService create(Throwable throwable) {
        return new DeptService() {
            @Override
            public DeptDTO add(DeptDTO deptDTO) {
                DeptDTO dto = new DeptDTO();
                dto.setDname("fallback");
                return dto;
            }

            @Override
            public DeptDTO get(long deptno) {
                DeptDTO dto = new DeptDTO();
                dto.setDname("fallback");
                return dto;
            }

            @Override
            public List<DeptDTO> list() {
                return new ArrayList<>();
            }
        };
    }
}
