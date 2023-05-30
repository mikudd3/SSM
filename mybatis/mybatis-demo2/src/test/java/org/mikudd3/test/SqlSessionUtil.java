package org.mikudd3.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession() {
        //1.加载mybatis核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2。获取SqlSession对象
        return sqlSessionFactory.openSession();
    }
}
