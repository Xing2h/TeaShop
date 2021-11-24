package com.tee.service;

import com.tee.pojo.Address;

import java.util.List;

public interface AddressService {
    /**
     * 创建收件人信息
     * @param address
     */
    public void createAddress(Address address);

    /**
     * 删除收件人信息
     * @param address
     */
    public void deleteAddress(Address address);

    /**
     * 通过用户id查询收件人信息
     * @param userId
     * @return
     */
    public List<Address> searchAddressByUserId(String userId);

    /**
     * 修改收件人信息
     * @param address
     */
    public void modifyAddress(Address address);
}
