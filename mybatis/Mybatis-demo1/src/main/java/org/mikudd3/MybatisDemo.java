package org.mikudd3;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mikudd3.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @project: 快速入门代码
 * @author: mikudd3
 * @version: 1.0
 */
public class MybatisDemo {
    public static void main(String[] args) {
//        1.加载mybatis核心配置文件



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
        List<User> users = sqlSession.selectList("mikudd3.selectAll");

        users.forEach(System.out::println);

//        4.释放资源
        sqlSession.close();
    }
}
