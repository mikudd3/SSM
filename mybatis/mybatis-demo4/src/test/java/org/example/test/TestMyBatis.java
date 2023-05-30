package org.example.test;

import org.apache.ibatis.session.SqlSession;
import org.example.mapper.IStudentMapper;
import org.example.pojo.StudentClass;
import org.junit.Test;

import java.io.IOException;

public class TestMyBatis {
    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    IStudentMapper studentMapper = sqlSession.getMapper(IStudentMapper.class);

    @Test
    public void queryClassAndStudentsByClassId() {
        StudentClass stuclass = studentMapper.queryClassAndStudentsByClassId(1);
        System.out.println(stuclass);
    }
}