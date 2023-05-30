package org.mikudd3.mapper;


import org.mikudd3.pojo.Department;

import java.util.List;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public interface DepartmentMapper {
    //根据编号返回部门信息
    Department queryDepartmentByNo(Integer no);

    //查询所有部门信息
    List<Department> queryAllDepartment();
}
