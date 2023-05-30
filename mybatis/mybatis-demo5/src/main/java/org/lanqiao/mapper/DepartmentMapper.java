package org.lanqiao.mapper;

import org.lanqiao.pojo.Department;

/**
 * 定义一个 DepartmentMapper 接口
 *
 * @author lanqiao
 */
public interface DepartmentMapper {
    /**
     * 根据部门编号查询部门信息以及部门下的所有岗位信息
     *
     * @param dNo 部门编号
     * @return
     */
    public Department queryDepartmentAndAllJobByDNo(String dNo);
}