package org.mikudd3.mapper;

import org.mikudd3.pojo.User;

import java.util.List;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public interface UserMapper {

    //与mapper中的查询语句的id相对应
    List<User> selectAll();
}
