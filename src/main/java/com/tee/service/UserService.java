package com.tee.service;

import com.tee.pojo.AdminUser;
import com.tee.pojo.User;
/**
 * @author Xing
 * date 2021-11-21-11-55
 **/
public interface UserService {
    /**
     * 登录用户
     *
     * @param user 要登录的用户
     * @return 返回null说明登录失败，其它为登录结果
     */
    public User loginUser(User user);

    /**
     * 注册用户
     *
     * @param user 要注册的用户
     */
    public void registUser(User user);

    /**
     * 检查用户是否存在
     *
     * @param username 要检查的用户
     * @return 返回false表示用户不存在，可以注册；返回true表示用户存在，不可以注册
     */
    public boolean existUser(String username);

    /**
     * 管理员登录
     * @param adminUser 要登录的管理员
     * @return  返回null说明登录失败，其它为登录结果
     */
    public AdminUser loginAdminUser(AdminUser adminUser);

    /**
     * 注册管理员
     * @param adminUser 要注册的管理员
     */
    public void registAdminUser(AdminUser adminUser);

    /**
     * 检查管理预案是否存在
     * @param username  要检查的管理员账号
     * @return  返回false表示管理员不存在，可以再次注册；返回true表示该管理原账号不存在，不可以进行注册。
     */
    public boolean existAdminUser(String username);

    /**
     * 修改用户资料
     * @param user
     */
    public void modifyUserData(User user);

    /**
     * 修改管理员资料
     * @param adminUser
     */
    public void modifyAdminData(AdminUser adminUser);
}
