package org.mikudd3.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mikudd3.mapper.DepartmentMapper;
import org.mikudd3.pojo.Department;

import java.io.IOException;
import java.util.List;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class TestDepartment {
    private SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    private DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);

    //根据编号返回部门信息
    @Test
    public void testQueryDepartmentByNo() {
        Integer no = 10;
        //执行查询，返回一个部门编号为 10 的 Department 对象
        Department department = departmentMapper.queryDepartmentByNo(no);
        System.out.println(department);
        // 关闭 session
        sqlSession.close();
    }

    @Test
    public void testQueryAllDepartment() {
        //查询所有部门信息
        List<Department> departments = departmentMapper.queryAllDepartment();
        departments.forEach(System.out::println);
        sqlSession.commit();
    }
}
