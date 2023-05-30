package org.lanqiao.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.lanqiao.mapper.DepartmentMapper;
import org.lanqiao.pojo.Department;

public class MyBatisTest {
    SqlSessionFactory sessionFactory = null;
    SqlSession session = null;

    @Before
    public void before() throws IOException {
        String resource = "mybatis-config.xml";
        //加载 MyBatis 的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建 SqlSession 的工厂
        sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行 SQL 映射文件中 SQL 语句的 SqlSession 对象
        session = sessionFactory.openSession();
    }

}