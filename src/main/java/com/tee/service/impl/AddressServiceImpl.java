package com.tee.service.impl;

import com.tee.dao.AddressDao;
import com.tee.dao.impl.AddressDaoImpl;
import com.tee.pojo.Address;
import com.tee.service.AddressService;

import java.util.List;

public class AddressServiceImpl implements AddressService {
    AddressDao addressDao = new AddressDaoImpl();

    @Override
    public void createAddress(Address address) {
        addressDao.createAddress(address);
    }

    @Override
    public void deleteAddress(Address address) {
        addressDao.deleteAddress(address);
    }

    @Override
    public List<Address> searchAddressByUserId(String userId) {
        return addressDao.queryAddressByUserId(userId);
    }

    @Override
    public void modifyAddress(Address address) {
        addressDao.modifyAddress(address);
    }

    @Override
    public Address searchAddressByAddressId(String addressId) {
        return addressDao.searchAddressByAddressId(addressId);
    }
}
