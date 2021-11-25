package com.tee.dao.impl;

import com.tee.dao.AddressDao;
import com.tee.dao.BaseDao;
import com.tee.pojo.Address;

import java.util.List;

public class AddressDaoImpl extends BaseDao implements AddressDao {
    @Override
    public int createAddress(Address address) {
        String sql = "insert into t_address(uid,name,tel,addr,post)values(?,?,?,?,?);";
        return update(sql,address.getUid(), address.getName(), address.getTel(), address.getAddr(), address.getPost());
    }

    @Override
    public int deleteAddress(Address address) {
        String sql = "delete from t_address where aid=?";
        return update(sql, address.getAid());
    }

    @Override
    public List<Address> queryAddressByUserId(String uid) {
        String sql = "select * from t_address where uid=?";
        return queryForList(Address.class, sql, uid);
    }

    @Override
    public int modifyAddress(Address address) {
        String sql = "update t_address set uid=?,name=?,tel=?,addr=?,post=? where aid=?";
        return update(sql, address.getUid(), address.getName(), address.getTel(), address.getAddr(), address.getPost(), address.getAid());
    }

    @Override
    public Address searchAddressByAddressId(String addressId) {
        String sql ="select * from t_address where aid=?";
        return queryForOne(Address.class,sql,addressId);
    }
}
