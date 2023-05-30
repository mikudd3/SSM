package org.mikudd3.converter;

/**
 * @project: 自定义类型处理器
 * @author: mikudd3
 * @version: 1.0
 */

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DateAndBigintConverter extends BaseTypeHandler<Date> {

    /**
     * Java 类型（Date）→ JDBC类型（BIGINT）
     *
     * @param ps:当前的 PreparedStatement 对象
     * @param i:当前参数的位置
     * @param parameter:当前参数值
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType)
            throws SQLException {
        long l = parameter.getTime();
        ps.setLong(i, l);
    }

    /**
     * JDBC类型（BIGINT）-->Java类型（Date）
     */
    @Override
    public Date getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // 通过字段的名称获取值
        long aLong = rs.getLong(columnName);
        return new Date(aLong);
    }

    /**
     * JDBC类型（BIGINT）-->Java类型（Date）
     */
    @Override
    public Date getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // 通过字段的索引获取值
        long aLong = rs.getLong(columnIndex);
        return new Date(aLong);
    }

    /**
     * JDBC类型（BIGINT）-->Java类型（Date）
     */
    @Override
    public Date getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // 通过调用存储过程获取值
        long aLong = cs.getLong(columnIndex);
        return new Date(aLong);
    }

}
