package com.tee.dao;

import com.tee.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.util.List;

/**
 * @author Xing
 * date 2021-11-21-11-55
 **/
public abstract class BaseDao {
    //使用DBUtils操作数据库
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * 查询返回一个JavaBean的sql语句
     *
     * @param <T>  返回对象的泛型
     * @param type 返回对象的类型
     * @param sql  执行的sql语句
     * @param args sql语句的参数
     * @return
     */
    public <T> T queryForOne(Class<T> type, String sql, Object... args) {
        try {
            Connection connection = JdbcUtils.getConnection();
            return queryRunner.query(connection, sql, new BeanHandler<T>(type), args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询返回一个JavaBean列表的sql语句
     *
     * @param <T>  返回对象的泛型
     * @param type 返回对象的类型
     * @param sql  执行的sql语句
     * @param args sql语句的参数
     * @return
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        try {
            Connection connection = JdbcUtils.getConnection();
            return queryRunner.query(connection, sql, new BeanListHandler<T>(type), args);
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * update() 方法 执行 inser/update/delete 语句
     *
     * @param sql  执行的sql语句
     * @param args sql语句的参数
     * @return 返回值为 -1 表示没有执行成功，其他则是sql语句影响的行数
     */
    public int update(String sql, Object... args) {
        try {
            Connection connection = JdbcUtils.getConnection();
            return queryRunner.update(connection, sql, args);
        } catch (Exception e) {
        }
        return -1;
    }
}
