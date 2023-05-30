package org.mikudd3.test;


import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import org.mikudd3.mapper.StudentMapper;
import org.mikudd3.pojo.Student;
import org.mikudd3.pojo.StudentAndCardBusiness;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class TestStudent {
    //1.获取SqlSession对象
    private SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    //2.获取mapper对象
    private StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

    @Test
    public void queryStudentAndCardBusinessByStuNo() {
        StudentAndCardBusiness studentAndCard
                = mapper.queryStudentAndCardBusinessByStuNo(32);
        System.out.println(studentAndCard);
    }


}
