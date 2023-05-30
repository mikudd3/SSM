package org.mikudd3.mapper;


import org.mikudd3.pojo.Employee;

import java.util.List;
import java.util.Map;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public interface EmployeeMapper {

    //新增一个员工的信息
    void insertEmployee(Employee employee);

    //根据员工编号，删除一个员工的信息
    void deleteEmployeeByNo(Integer no);

    //根据员工编号，修改员工信息
    void updateEmployeeByNo(Employee employee);

    //根据员工编号查询员工信息
    Employee queryEmployeeByNo(Integer no);

    //根据员工姓名和岗位查询员工信息
    //如果 eName 为空，就只根据 job 查询；反之只根据 eName 查询。
    Employee queryEmployeeByNameAndJob(Employee employee);

    /**
     * 根据员工编号修改员工信息
     *
     * @param e 员工对象
     * @return 返回修改的记录数
     */
    int updateEmployee(Employee e);

    /**
     * 根据员工编号或者员工姓名或者岗位查询员工信息(一次只能满足一个条件)
     *
     * @param e 实体类对象
     * @return
     */
    List<Employee> queryEmployeeByEnoOrNameOrJob(Employee e);

    /**
     * 调用存储过程查询名字相同的员工个数
     *
     * @param map 存放调用存储过程需要的参数
     */
    void queryCountByNameWithProcedure(Map<String, Object> map);

    /**
     * 调用存储过程删除员工信息
     *
     * @param map 存放调用存储过程需要的参数
     * @return 返回删除记录的个数
     */
    int deleteByENoWithProcedure(Map<String, Object> map);

    /**
     * 根据员工编号查询多个员工信息
     *
     * @param eNos 参数为是 List 集合，里面存放的是员工编号
     * @return
     */
    List<Employee> queryEmployeeWithForeachAndList(List<Integer> eNos);
}
