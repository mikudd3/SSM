package org.example.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.StudentMapper;
import org.example.pojo.Student;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class MyBatisTest {

    static SqlSessionFactory sessionFactory = null;
    static SqlSession session = null;
    static StudentMapper studentMapper = null;

    @BeforeClass
    public static void before() throws IOException {
        String resource = "mybatis-config.xml";
        //加载 MyBatis 的配置文件
        Reader reader = Resources.getResourceAsReader(resource);
        //创建 SqlSession 的工厂
        sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        //创建能够执行 SQL 映射文件中 SQL 语句的 SqlSession 对象
        session = sessionFactory.openSession();
        studentMapper = session.getMapper(StudentMapper.class);
    }

    @Test
    public void testSelectStudentWithCard() {
        List<Student> list = studentMapper.selectStudentWithCard();

        list.forEach(System.out::println);

        session.close();
    }
}