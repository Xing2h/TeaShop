package com.tee.dao.impl;

import com.tee.dao.AddressDao;
import com.tee.dao.BaseDao;
import com.tee.pojo.Address;

import java.util.List;

public class AddressDaoImpl extends BaseDao implements AddressDao {
    @Override
    public int createAddress(Address address) {
        String sql = "insert into t_address(aid,uid,name,tel,address,post)values(?,?,?,?,?,?);";
        return update(sql, address.getAddressId(), address.getUserId(), address.getRecipient(), address.getTel(), address.getAddress(), address.getPostalCode());
    }

    @Override
    public int deleteAddress(Address address) {
        String sql = "delete from t_address where aid=?";
        return update(sql, address.getAddressId());
    }

    @Override
    public List<Address> queryAddressByUserId(String userId) {
        String sql = "select * from t_address where uid=?";
        return queryForList(Address.class, sql, userId);
    }

    @Override
    public int modifyAddress(Address address) {
        String sql = "update t_address set uid=?,name=?,tel=?,address=?,post=? where aid=?";
        return update(sql, address.getUserId(), address.getRecipient(), address.getTel(), address.getAddress(), address.getPostalCode(), address.getAddressId());
    }
}
