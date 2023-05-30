package org.mikudd3.test;


import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import org.mikudd3.mapper.StudentMapper;
import org.mikudd3.pojo.Student;


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

    //增加一个学生
    @Test
    public void testAddStudent() {
        Student stu = new Student(29, "路人甲", 22, "一年级");
        mapper.addStudent(stu);
        //mapper.addStudentWithConverter(stu);
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }

    //根据学号，删除一个学生
    @Test
    public void testDeleteStudentByNo() {
        mapper.deleteStudentByNo(7);
        sqlSession.commit();
        sqlSession.close();
    }

    //根据学号，修改学生信息
    @Test
    public void testUpdateStudentByNo() {
        Student stu = new Student(7, "路人乙", 33, "二年级");
        mapper.updateStudentByNo(stu);
        sqlSession.commit();
        sqlSession.close();
    }

    //根据学号，查询一个学生
    @Test
    public void testQueryStudentByNo() {
        //执行查询，返回一个学号为 32 的 Student 对象
        Integer no = 32;
        //3.执行方法
        Student student = mapper.queryStudentByStuNo(no);
        //Student student = mapper.queryStudentByStuNoWithConverter(no);
        System.out.println(student);
        //4.释放资源
        sqlSession.close();
    }

    //查询全部学生
    @Test
    public void testQueryAllStudent() {
        List<Student> students = mapper.queryAllStudent();
        students.forEach(System.out::println);
        sqlSession.close();
    }

    //调用存储过程，查询指定年级的学生人数
    @Test
    public void testQueryCountByGradeWithProcedure() {
        Map<String, Object> params = new HashMap<>();
        //通过Map对象，给SQL映射文件传递输入参数
        params.put("gName", "初级");
        mapper.queryCountByGradeWithProcedure(params);
        //根据Map对象，获取存储过程的OUT参数
        Object result = params.get("sCount");
        System.out.println("就业班的人数为：" + result);
        sqlSession.close();
    }

    //调用存储过程，删除指定学号的学生
    @Test
    public void testDeleteByStunoWithProcedure() {
        Map<String, Object> params = new HashMap<>();
        params.put("sno", 34);
        if (mapper.deleteByStuNoWithProcedure(params) != 0) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败！");
        }
        sqlSession.commit();
        sqlSession.close();
    }


}
