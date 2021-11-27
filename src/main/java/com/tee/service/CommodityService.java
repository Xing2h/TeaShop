package com.tee.service;

import com.tee.pojo.Commodity;

import java.util.List;

/**
 * @author Xing
 * date 2021-11-21-11-55
 **/
public interface CommodityService {
    /**
     * 检查商品是否存在
     *
     * @param id 要检查的商品编号
     * @return 返回false表示商品不存在；true表示商品存在
     */
    public boolean existCommodity(String id);

    /**
     * 创建商品
     *
     * @param commodity
     */
    public void createCommodity(Commodity commodity);

    /**
     * 查询所有商品
     *
     * @return
     */
    public List<Commodity> showCommodities();

    /**
     * 查询某一类商品
     *
     * @param type
     * @return
     */
    public List<Commodity> showTypeCommodities(String type);

    /**
     * 通过id查询返回指定商品信息
     *
     * @param id
     * @return
     */
    public Commodity searchForOneCommodity(String id);

    /**
     * 修改商品信息
     *
     * @param commodity
     */
    public void modifyCommodity(Commodity commodity);

    /**
     * 通过id删除商品
     * @param id
     */
    public void deleteOneCommodity(String id);

    /**
     * 查找最后一个id
     * @return
     */
    public String maxid();
}
