package com.tee.dao;

import com.tee.pojo.Address;

import java.util.List;

public interface AddressDao {
    /**
     * 创建收件人地址
     * @return
     */
    public int createAddress(Address address);

    /**
     * 删除收件人地址
     * @return
     */
    public int deleteAddress(Address address);

    /**
     * 通过用户名查询收件人地址
     * @param userId
     * @return
     */
    public List<Address> queryAddressByUserId(String userId);

    /**
     * 修改收件人信息
     * @param address
     * @return
     */
    public int modifyAddress(Address address);
}
