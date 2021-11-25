package com.tee.test;

import com.tee.dao.AddressDao;
import com.tee.dao.impl.AddressDaoImpl;
import com.tee.pojo.Address;
import com.tee.service.AddressService;
import com.tee.service.impl.AddressServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddressServiceImplTest {
    AddressDao addressDao = new AddressDaoImpl();
    AddressService addressService = new AddressServiceImpl();
    @Test
    public void createAddress() {
        addressDao.createAddress(new Address(null,"10004","Xing","2222222","河南省濮阳市","457000"));
    }

    @Test
    public void deleteAddress() {
    }

    @Test
    public void searchAddressByUserId() {
        List<Address> list = addressDao.queryAddressByUserId("10002");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    @Test
    public void modifyAddress() {
    }

    @Test
    public void searchAddressByAddressId(){
        System.out.println(addressService.searchAddressByAddressId("2").toString());
    }

}