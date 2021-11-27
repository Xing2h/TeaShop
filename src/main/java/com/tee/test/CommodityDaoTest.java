package com.tee.test;

import com.tee.dao.CommodityDao;
import com.tee.dao.impl.CommodityDaoImpl;
import com.tee.pojo.Commodity;
import org.junit.jupiter.api.Test;

public class CommodityDaoTest {
    CommodityDao commodityDao = new CommodityDaoImpl();
    @Test
    public void modifyCommodity(){
        Commodity commodity = new Commodity("10000001","明前龙井","绿茶",299,10001,30,"浙江省杭州市","2021-5-18","2021新茶，明前绿茶，安吉绿茶，茉莉花茶3大茗茶组合装。");
        System.out.println(commodityDao.modifyCommodity(commodity));
    }

    @Test
    public void maxid(){
        System.out.println(commodityDao.searchLastCommodity().getId());
    }


}