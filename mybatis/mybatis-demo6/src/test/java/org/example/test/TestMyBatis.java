package org.example.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.IStudentMapper;
import org.example.pojo.Student;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class TestMyBatis {
    @Test
    public void testQueryStudentByStuNoWithConverter() throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        IStudentMapper studentMapper = session.getMapper(IStudentMapper.class);

        List<Student> students = studentMapper.queryStudentsAndCourses();

        for (Student student : students) {
            System.out.println(student + "\n" + student.getCourses());
        }
        session.close();
    }
}