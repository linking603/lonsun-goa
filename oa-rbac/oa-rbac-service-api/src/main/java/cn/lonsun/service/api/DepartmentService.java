package cn.lonsun.service.api;

import cn.lonsun.entity.*;
import cn.lonsun.entity.Department;
import cn.lonsun.vo.*;

import java.math.BigDecimal;

public interface DepartmentService {
    public Department getDepartmentByDepartmentId(BigDecimal departmentId);

    public PaginationResultVo getDepartmentPaginationResult(PageQueryVo pageQueryVo);
}
