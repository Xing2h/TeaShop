package com.tee.test;

import com.tee.pojo.Commodity;
import com.tee.service.CommodityService;
import com.tee.service.impl.CommodityServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Xing
 * date 2021-11-22-14-28
 **/
public class CommodityServiceImplTest {
    CommodityService commodityService = new CommodityServiceImpl();
    @Test
    public void existCommodity() {
        //存在
        System.out.println(commodityService.existCommodity("10000001"));
        //不存在
        System.out.println(commodityService.existCommodity("10000011"));
    }

    @Test
    public void createCommodity() {
    }

    @Test
    public void showCommodities() {
    }

    @Test
    public void showTypeCommodities() {
        List<Commodity> list = commodityService.showTypeCommodities("绿茶");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    @Test
    public void searchForOneCommodity() {
    }
}