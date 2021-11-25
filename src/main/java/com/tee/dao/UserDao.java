package com.tee.dao;

import com.tee.pojo.AdminUser;
import com.tee.pojo.User;

import java.util.List;

/**
 * @author Xing
 * date 2021-11-21-11-55
 **/
public interface UserDao {
    /**
     * 通过 用户名 查询用户
     *
     * @param username 用户名
     * @return
     */
    public User queryUserByUsername(String username);

    /**
     * 通过 用户名和密码 查询用户
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    public User queryUserByUsernameAndPassword(String username, String password);

    /**
     * 创建用户
     *
     * @param user
     */
    public int createUser(User user);

    /**
     * 通过   用户名 查询管理员
     *
     * @param username 用户名
     * @return
     */
    public AdminUser queryAdminUserByUsername(String username);

    /**
     * 通过   用户名和密码  查询用户
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    public AdminUser queryAdminUserByUsernameAndPassword(String username, String password);

    /**
     * 创建  管理员
     *
     * @param adminUser
     * @return
     */
    public int createAdminUser(AdminUser adminUser);

    /**
     * 修改用户个人信息
     *
     * @param user
     * @return
     */
    public int modifyUserData(User user);

    /**
     * 修改管理员个人信息
     *
     * @param dminuser
     * @return
     */
    public int modifyAdminUserData(AdminUser dminuser);

    /**
     * 通过用户id查询用户
     *
     * @param userId
     * @return
     */
    public User queryUserByUserId(String userId);

    /**
     * 展示所有用户
     *
     * @return
     */
    public List<User> showAllUsers();

    /**
     * 修改用户密码
     *
     * @param id
     * @param password
     * @return
     */
    public int modifyPassword(String id, String password);

    /**
     * 修改管理员密码
     *
     * @param id
     * @param password
     * @return
     */
    public int modifyAdminPassword(String id, String password);
}
