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
        commodityService.createCommodity(new Commodity(null,"111","type",1111,111,0,"origin","2021-04-18 00:00:00","details"));

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

    @Test
    public void modifyCommodity() {
        Commodity commodity = new Commodity("10000001","明前龙井","绿茶",299,10001,30,"浙江省杭州市","2021-5-18","2021新茶，明前绿茶，安吉绿茶，茉莉花茶3大茗茶组合装。");
        commodityService.modifyCommodity(commodity);
    }

    @Test
    public void searchCommodityId(){
        System.out.println(commodityService.maxid());
    }
}