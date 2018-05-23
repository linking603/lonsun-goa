package cn.lonsun.controller;

import cn.lonsun.entity.Department;
import cn.lonsun.service.api.DepartmentService;
import cn.lonsun.vo.PageQueryVo;
import cn.lonsun.vo.PaginationResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

@Controller
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("getDepartmentByDepartmentId")
    @ResponseBody
    public Department getDepartmentByDepartmentId(BigDecimal departmentId, HttpServletResponse response, HttpServletRequest request) {
        HttpSession se=request.getSession();

        Department department = departmentService.getDepartmentByDepartmentId(departmentId);
        return null;
    }

    @RequestMapping("getDepartmentPaginationResult")
    @ResponseBody
    public PaginationResultVo getDepartmentPaginationResult(PageQueryVo pageQueryVo, HttpServletRequest request) {
        HttpSession se=request.getSession();
        se.setAttribute("test",pageQueryVo.getPageSize());
        PaginationResultVo result = departmentService.getDepartmentPaginationResult(pageQueryVo);
        return result;
    }
}
