package org.mikudd3.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mikudd3.mapper.BrandMapper;
import org.mikudd3.pojo.Brand;

import java.util.List;

/**
 * @project:
 * @author: mikudd3
 * @version: 1.0
 */
public class TestBrand {

    //1.获取SqlSession对象
    private SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    //2.获取mapper对象
    private BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

    @Test
    public void testSelectAll() {
        //3.执行方法
        List<Brand> brands = mapper.selectAll();
        brands.forEach(System.out::println);
        //4.释放资源
        sqlSession.close();
    }


    @Test
    public void testSelectById() {
        int id = 1;
        //3.执行方法
        Brand brand = mapper.selectById(id);
        System.out.println(brand);
        //4.释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectByCondition() {
        //接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        //处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //封装对象
        Brand brand = new Brand();
        //brand.setStatus(status);
        brand.setCompanyName(companyName);
        //brand.setBrandName(brandName);
        //封装参数
        /*Map map = new HashMap();
        map.put("status", status);
        map.put("companyName", companyName);
        map.put("brandName", brandName);*/
        //3.执行方法
        List<Brand> brands = mapper.selectByCondition(brand);
        brands.forEach(System.out::println);
        //4.释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectOneByCondition() {
        //接收参数
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
        //处理参数
        companyName = "%" + companyName + "%";
        brandName = "%" + brandName + "%";
        //封装对象
        Brand brand = new Brand();
        //brand.setStatus(status);
        //brand.setCompanyName(companyName);
        brand.setBrandName(brandName);
        //封装参数
        /*Map map = new HashMap();
        map.put("status", status);
        map.put("companyName", companyName);
        map.put("brandName", brandName);*/
        //3.执行方法
        List<Brand> brands = mapper.selectOneByCondition(brand);

        brands.forEach(System.out::println);

        //4.释放资源
        sqlSession.close();

    }


    //添加数据
    @Test
    public void testAdd() {
        //接收参数
        String brandName = "红米K40";
        String companyName = "小米";
        Integer ordered = 100;
        String description = "年轻人的第一台冤种机";
        int status = 1;

        //封装对象
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);
        brand.setStatus(status);

        //3.执行方法
        mapper.add(brand);
        Integer id = brand.getId();
        System.out.println(id);
        //因为默认开始事务且关闭自动提交，所以需要手动提交事务
        //提交事务
        sqlSession.commit();
        //4.释放资源
        sqlSession.close();
    }


    //修改全部数据
    //动态修改
    @Test
    public void testUpdate() {
        //接收参数
        String brandName = "红米K40";
        String companyName = "小米";
        Integer ordered = 200;
        String description = "红米K40,年轻人的第一台冤种机";
        Integer status = 0;
        Integer id = 5;


        //封装对象
        Brand brand = new Brand();
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        //brand.setOrdered(ordered);
        //brand.setDescription(description);
        brand.setStatus(status);
        brand.setId(id);

        //3.执行方法
        mapper.update(brand);
        //因为默认开始事务且关闭自动提交，所以需要手动提交事务
        //提交事务
        sqlSession.commit();
        //4.释放资源
        sqlSession.close();
    }

    //删除一个
    @Test
    public void testDeleteById() {
        //接收参数
        Integer id = 7;
        //3.执行方法
        mapper.deleteById(id);
        //因为默认开始事务且关闭自动提交，所以需要手动提交事务
        //提交事务
        sqlSession.commit();
        //4.释放资源
        sqlSession.close();
    }

    //批量删除
    @Test
    public void testDeleteByIds() {
        //接收参数
        Integer[] ids = {8, 9, 10};
        //3.执行方法
        mapper.deleteByIds(ids);
        //因为默认开始事务且关闭自动提交，所以需要手动提交事务
        //提交事务
        sqlSession.commit();
        //4.释放资源
        sqlSession.close();
    }
}
