package org.lanqiao.mapper;

import org.lanqiao.pojo.Employee;

/**
 * 定一个 EmployeeMapper 接口
 * @author lanqiao
 */
public interface EmployeeMapper {
    /**
     * 根据员工编号查询员工信息及该员工所参与的项目信息
     * @param eNo 员工编号
     * @return
     */
    public Employee queryEmployeeByEno(String eNo);
}