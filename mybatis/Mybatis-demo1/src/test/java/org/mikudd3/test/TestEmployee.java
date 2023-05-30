package org.mikudd3.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mikudd3.mapper.EmployeeMapper;
import org.mikudd3.pojo.Department;
import org.mikudd3.pojo.Employee;

import java.io.IOException;
import java.io.Reader;
import java.util.*;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class TestEmployee {
    private SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    private EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);

    //新增一个员工的信息
    @Test
    public void testInsertEmployee() {
        //执行插入操作
        Employee e = new Employee();
        e.setENo(7937);
        e.setComm(300);
        e.setEName("小蓝");
        e.setDNo(30);
        e.setHireDate(new Date());
        e.setJob("推销员");
        e.setMgr(7689);
        e.setSal(6000);
        //执行增加
        employeeMapper.insertEmployee(e);
        sqlSession.commit();
        System.out.println(e);
        // 关闭 session
        sqlSession.close();
    }

    //根据员工编号，删除一个员工的信息
    @Test
    public void testDeleteEmployee() {
        //执行删除操作   将员工编号为 7935 的员工删除
        employeeMapper.deleteEmployeeByNo(7935);
        sqlSession.commit();
        // 关闭 session
        sqlSession.close();
    }

    //根据员工编号，修改员工信息
    @Test
    public void testUpdateEmployee() {
        //执行修改操作   将员工编号为 7935 的员工的姓名改为 “蓝桥”，其他信息不变
        Employee e = new Employee();
        e.setENo(7935);
        e.setComm(300);
        e.setEName("蓝桥");
        e.setDNo(30);
        e.setHireDate(new Date());
        e.setJob("推销员");
        e.setMgr(7689);
        e.setSal(6000);
        employeeMapper.updateEmployeeByNo(e);
        sqlSession.commit();
        System.out.println(e);
        // 关闭 session
        sqlSession.close();
    }

    //根据员工编号查询员工信息
    @Test
    public void testQueryEmployeeByNo() {
        Integer no = 7369;
        Employee employee = employeeMapper.queryEmployeeByNo(no);
        System.out.println(employee);
        // 关闭 session
        sqlSession.close();
    }

    //根据员工姓名和岗位查询员工信息
    //如果 eName 为空，就只根据 job 查询；反之只根据 eName 查询。
    @Test
    public void testQueryEmployeeByNameAndJob() {
        Employee employee = new Employee();
        employee.setEName("张三");
        employee.setJob("推销员");
        Employee newEmp = employeeMapper.queryEmployeeByNameAndJob(employee);
        System.out.println(newEmp);
        sqlSession.close();
    }

    //根据员工编号修改员工信息
    @Test
    public void updateEmployee() {
        // 将员工编号为 7902 的员工的姓名改为 “蓝桥”，其他信息不变
        Employee e = new Employee();
        e.setENo(7902);
        e.setEName("蓝桥");

        // 调用方法进行修改
        int i = employeeMapper.updateEmployee(e);
        sqlSession.commit();
        if (i != 0) {
            System.out.println("数据修改成功！！！");
        } else {
            System.out.println("数据修改失败！！！");
        }
        // 关闭session
        sqlSession.close();
    }

    //根据员工编号或者员工姓名或者岗位查询员工信息(一次只能满足一个条件)
    @Test
    public void queryEmployeeByEnoOrNameOrJob() {
        // 将条件封装到实体类中
        Employee e = new Employee();
        e.setENo(7903);
        e.setEName("蓝桥");
        e.setJob("职员");
        // 调用方法进行查询
        List<Employee> employees = employeeMapper.queryEmployeeByEnoOrNameOrJob(e);
        System.out.println(employees);
        // 关闭session
        sqlSession.close();
    }


    @Test
    public void queryEmployeeWithForeachAndList() {
        // 使用集合存放员工编号
        List<Integer> eNos = new ArrayList<>();
        eNos.add(7369);
        eNos.add(7499);
        eNos.add(7521);

        // 调用方法进行查询
        List<Employee> employees = employeeMapper.queryEmployeeWithForeachAndList(eNos);
        System.out.println(employees);
        // 关闭session
        sqlSession.close();
    }

    //调用存储过程查询名字相同的员工个数
    @Test
    public void testQueryCountByNameWithProcedure() {
        //执行查询操作   查询名字同为 “小蓝” 的有几个人
        Map<String, Object> param = new HashMap<>();
        param.put("empName", "小蓝");
        employeeMapper.queryCountByNameWithProcedure(param);
        sqlSession.commit();
        System.out.println("名字相同的人的个数：" + param.get("eCount"));
        // 关闭 session
        sqlSession.close();
    }

    //调用存储过程删除员工信息
    @Test
    public void testDeleteByENoWithProcedure() {
        //执行删除操作   删除员工编号为 7935 的员工
        Map<String, Object> param = new HashMap<>();
        param.put("eNo", "7935");
        int i = employeeMapper.deleteByENoWithProcedure(param);
        sqlSession.commit();
        System.out.println("影响的行数：" + i);
        // 关闭 session
        sqlSession.close();
    }
}
