package org.mikudd3;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mikudd3.mapper.UserMapper;
import org.mikudd3.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @project: Mapper代理开发
 * @author: mikudd3
 * @version: 1.0
 */
public class MybatisDemo2 {
    public static void main(String[] args) {
        //1.加载mybatis核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//        2。获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        3。执行sql语句
        //List<User> users = sqlSession.selectList("mikudd3.selectAll");
//        3.1获取对应userMapper代理对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();

        users.forEach(System.out::println);
//        4.释放资源
        sqlSession.close();
    }
}
