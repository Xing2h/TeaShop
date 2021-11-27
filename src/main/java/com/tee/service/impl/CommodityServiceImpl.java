package com.tee.service.impl;

import com.tee.dao.CommodityDao;
import com.tee.dao.impl.CommodityDaoImpl;
import com.tee.pojo.Commodity;
import com.tee.service.CommodityService;

import java.util.List;

/**
 * @author Xing
 * date 2021-11-21-12-00
 **/
public class CommodityServiceImpl implements CommodityService {
    CommodityDao commodityDao = new CommodityDaoImpl();

    @Override
    public boolean existCommodity(String id) {
        if (commodityDao.queryCommodityById(id) == null) {
            //commodityDao.queryCommodityById(id)为空表示没有查到该id，即该商品不存在，返回false
            return false;
        } else {
            //查询到了商品，返回true，表示商品存在
            return true;
        }
    }

    @Override
    public void createCommodity(Commodity commodity) {
        commodityDao.createCommodity(commodity);
    }

    @Override
    public List<Commodity> showCommodities() {
        return commodityDao.showCommodities();
    }

    @Override
    public List<Commodity> showTypeCommodities(String type) {
        return commodityDao.showCommoditiesOfType(type);
    }

    @Override
    public Commodity searchForOneCommodity(String id) {
        return commodityDao.queryCommodityById(id);
    }

    @Override
    public void modifyCommodity(Commodity commodity) {
        commodityDao.modifyCommodity(commodity);
    }

    @Override
    public void deleteOneCommodity(String id) {
        commodityDao.deleteCommodity(id);
    }

    @Override
    public String maxid() {
        Commodity commodity = commodityDao.searchLastCommodity();
        return commodity.getId();
    }
}
