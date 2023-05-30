package org.mikudd3.mapper;

import org.apache.ibatis.annotations.Param;
import org.mikudd3.pojo.Brand;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    /*
     * 查询所有
     */
    List<Brand> selectAll();

    /*
     查看详情：根据id获取信息
    * */
    Brand selectById(int id);

    /**
     * 条件查询
     * 1.注解开发，有多个参数时，需要一一对应
     * 2.对象开发
     * 3.map结婚开发
     *
     * @return
     */
    //List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String companyName, @Param("brandName") String brandName);

    List<Brand> selectByCondition(Brand brand);
    //List<Brand> selectByCondition(Map map);


    //单条件动态查询
    List<Brand> selectOneByCondition(Brand brand);

    //添加数据
    void add(Brand brand);

    //修改全部字段
    void update(Brand brand);

    //删除一个
    void deleteById(Integer id);

    //批量删除
    void deleteByIds(@Param("ids") Integer[] id);
    //void deleteByIds(Integer[] id);
}
