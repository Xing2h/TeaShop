package com.tee.service.impl;

import com.tee.dao.UserDao;
import com.tee.dao.impl.UserDaoImpl;
import com.tee.pojo.AdminUser;
import com.tee.pojo.User;
import com.tee.service.UserService;
/**
 * @author Xing
 * date 2021-11-21-12-00
 **/
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    @Override
    public User loginUser(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public void registUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public boolean existUser(String username) {
        if (userDao.queryUserByUsername(username) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public AdminUser loginAdminUser(AdminUser adminUser) {
        return userDao.queryAdminUserByUsernameAndPassword(adminUser.getUsername(), adminUser.getPassword());
    }

    @Override
    public void registAdminUser(AdminUser adminUser) {
        userDao.createAdminUser(adminUser);
    }

    @Override
    public boolean existAdminUser(String username) {
        if (userDao.queryAdminUserByUsername(username)==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public void modifyUserData(User user) {
        userDao.modifyUserData(user);
    }

    @Override
    public void modifyAdminData(AdminUser adminUser) {
        userDao.modifyAdminUserData(adminUser);
    }
}
