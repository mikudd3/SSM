package org.mikudd3.mapper;

import org.mikudd3.pojo.Course;
import org.mikudd3.pojo.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public interface CourseMapper {
    //查询所有课程的信息
    List<Course> queryAll();

    //新增一条课程信息。
    void add(Course course);

    //将课程编号为 1 的课程名改为 “软件测试”，授课老师改为 “李珍”。
    void update(Course course);

    //删除课程编号为 7 的课程信息。
    void deleteById(Integer id);

    //使用模糊查询，查询出授课老师名字带有 “张” 的课程的信息并按照课程编号降序排序
    List<Course> selectLike(Map map);

    //想课程表中批量加入数据，并使用foreach标签
    void insertForEach(List<Course> list);


    List<Course> selectCoursesByName(String cName);

    void updateTeacherByCourseId(Map map);

    HashMap[] selectCoursesByIdList(List list);
}
