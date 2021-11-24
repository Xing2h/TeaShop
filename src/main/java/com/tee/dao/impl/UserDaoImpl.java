package com.tee.dao.impl;

import com.tee.dao.BaseDao;
import com.tee.dao.UserDao;
import com.tee.pojo.AdminUser;
import com.tee.pojo.User;

/**
 * @author Xing
 * date 2021-11-21-11-55
 **/
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "select * from t_user where username=?";
        return queryForOne(User.class, sql, username);
    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select * from t_user where username=? and password=?";
        return queryForOne(User.class, sql, username, password);
    }

    @Override
    public int createUser(User user) {
        String sql = "insert into t_user(username,password,email,tel)values(?,?,?,?)";
        return update(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getTel());
    }

    @Override
    public AdminUser queryAdminUserByUsername(String username) {
        String sql ="select * from t_admin where username=?";
        return queryForOne(AdminUser.class, sql, username);
    }

    @Override
    public AdminUser queryAdminUserByUsernameAndPassword(String username, String password) {
        String sql ="select * from t_admin where username=? and password=?";
        return queryForOne(AdminUser.class, sql, username,password);
    }

    @Override
    public int createAdminUser(AdminUser adminUser) {
        String sql ="insert into t_admin(username,password,email,tel)values(?,?,?,?)";
        return update(sql, adminUser.getUsername(),adminUser.getPassword(),adminUser.getEmail(),adminUser.getTel());
    }

    @Override
    public int modifyUserData(User user) {
        String sql = "update t_user set username=?,email=?,tel=?,password=? where id=?";
        return update(sql,user.getUsername(),user.getEmail(),user.getTel(),user.getPassword(),user.getId());
    }

    @Override
    public int modifyAdminUserData(AdminUser adminuser) {
        String sql = "update t_admin set username=?,email=?,tel=?,password=? where id=?";
        return update(sql,adminuser.getUsername(),adminuser.getEmail(),adminuser.getTel(),adminuser.getPassword(),adminuser.getId());
    }
}
