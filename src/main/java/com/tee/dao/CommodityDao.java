package com.tee.dao;

import com.tee.pojo.Commodity;

import java.util.List;

/**
 * @author Xing
 * date 2021-11-21-11-22
 **/
public interface CommodityDao {
    /**
     * 通过商品id查询商品
     * @param id
     * @return
     */
    public Commodity queryCommodityById(String id);

    /**
     * 创建商品
     * @param commodity
     * @return
     */
    public int createCommodity(Commodity commodity);

    /**
     * 删除商品
     * @param commodity
     * @return
     */
    public int deleteCommodity(Commodity commodity);

    /**
     * 查询返回所有商品
     * @return
     */
    public List<Commodity>  showCommodities();

    /**
     * 通过上皮id删除商品
     * @param id
     * @return
     */
    public int deleteCommodity(String id);
    /**
     * 通过 type 查询某一类的商品
     * @param type
     * @return
     */
    public List<Commodity>  showCommoditiesOfType(String type);

    /**
     *修改商品信息
     * @param commodity
     * @return
     */
    public int modifyCommodity(Commodity commodity);

    /**
     * 查询最后一个商品
     * @return
     */
    public Commodity searchLastCommodity();
}
