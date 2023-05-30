package org.mikudd3.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mikudd3.mapper.CourseMapper;
import org.mikudd3.pojo.Course;
import org.mikudd3.pojo.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class TestCourse {
    private static SqlSession sqlSession = null;
    private static CourseMapper courseMapper = null;

    @BeforeClass
    public static void before() {
        //1.加载mybatis核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        courseMapper = sqlSession.getMapper(CourseMapper.class);
    }

    //查询所有课程的信息
    @Test
    public void testQueryAll() {
        List<Course> courses = courseMapper.queryAll();
        courses.forEach(System.out::println);
        sqlSession.close();
    }

    //新增一条课程信息。
    @Test
    public void testAdd() {
        Course course = new Course(12, "web前端", "张三");
        //Course course = new Course(12, "web前端", "张三", true);
        courseMapper.add(course);
        sqlSession.commit();
        sqlSession.close();
    }

    //将课程编号为 1 的课程名改为 “软件测试”，授课老师改为 “李珍”。
    @Test
    public void testUpdate() {
        Course course = new Course(1, "软件测试", "李珍");
        //Course course = new Course(1, "软件测试", "李珍", true);
        courseMapper.update(course);
        sqlSession.commit();
        sqlSession.close();
    }

    //删除课程编号为 7 的课程信息。
    @Test
    public void testDeleteById() {
        courseMapper.deleteById(7);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectLike() {
        //封装hashmap集合
        Map map = new HashMap<>();
        String teacher = "张%";
        map.put("teacher", teacher);
        List<Course> courses = courseMapper.selectLike(map);
        courses.forEach(System.out::println);
    }

    @Test
    public void testInsertForEach() {
        /*课程编号：8 课程名称：Golang 语言 任课教师：王五
        课程编号：9 课程名称：Oracle 任课教师：薛仁贵
        课程编号：10 课程名称：大数据 任课教师：刘邦*/
        //封装为数组
        List<Course> list = new ArrayList<>();
        list.add(new Course(8, "Golang 语言", "王五"));
        list.add(new Course(9, "Oracle", "薛仁贵"));
        list.add(new Course(10, "大数据", "刘邦"));
        //执行添加
        courseMapper.insertForEach(list);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectCoursesByName() {
        List<Course> courses = courseMapper.selectCoursesByName("C");
        courses.forEach(System.out::println);
    }

    @Test
    public void testUpdateTeacherByCourseId() {
        int cNo = 7;
        String teacher = "小蓝";
        Map<String, Object> params = new HashMap<>();
        params.put("cNo", cNo);
        params.put("teacher", teacher);
        courseMapper.updateTeacherByCourseId(params);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectCoursesByIdList() {
        List<Integer> idList = Arrays.asList(1, 2, 3); // 批量查询的课程编号列表
        HashMap[] hashMaps = courseMapper.selectCoursesByIdList(idList);
        for (HashMap hashMap : hashMaps) {
            System.out.println(hashMap.values());
        }
        sqlSession.close();
    }
}
