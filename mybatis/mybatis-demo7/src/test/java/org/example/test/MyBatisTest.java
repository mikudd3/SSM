package org.example.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.CourseMapper;
import org.example.mapper.StudentMapper;
import org.example.pojo.Course;
import org.example.pojo.Student;
import org.junit.Before;
import org.junit.Test;

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

    //列出每门课程的多项成绩信息
    @Test
    public void testQueryCourseAndScore() {
        CourseMapper mapper = session.getMapper(CourseMapper.class);
        List<Course> list = mapper.queryCourseAndScore();
        list.forEach(System.out::println);
        session.close();
    }

    //列出与每门课成绩都大于等于 80 分的所有学生信息以及对应的课程信息。
    @Test
    public void testQueryStudentAndCourse() {
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> list = mapper.queryStudentAndCourse();
        list.forEach(System.out::println);
        session.close();
    }
}