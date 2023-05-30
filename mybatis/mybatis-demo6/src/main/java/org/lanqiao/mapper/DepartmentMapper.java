package org.lanqiao.mapper;

import org.lanqiao.pojo.Employee;
import org.lanqiao.pojo.Project;

import java.util.List;

/**
 * 定义一个 DepartmentMapper 接口
 *
 * @author lanqiao
 */
public interface DepartmentMapper {
    /**
     * 根据项目编号查询参与该项目的所有员工信息
     *
     * @param pNo 项目编号
     * @return 返回该项目下的所有员工信息
     */
    public List<Employee> queryAllEmployeeByPNo(String pNo);

    /**
     * 根据员工编号查询该员工参与的所有项目信息
     *
     * @param eNo 员工编号
     * @return 返回该员工参与的所有项目信息
     */
    public List<Project> queryAllProjectByEno(String eNo);


}