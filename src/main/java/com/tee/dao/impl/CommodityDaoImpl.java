package com.tee.dao.impl;

import com.tee.dao.BaseDao;
import com.tee.dao.CommodityDao;
import com.tee.pojo.Commodity;

import java.util.List;

/**
 * @author Xing
 * date 2021-11-21-11-22
 **/
public class CommodityDaoImpl extends BaseDao implements CommodityDao {
    /**
     * 通过 id 查询商品
     */
    @Override
    public Commodity queryCommodityById(String id) {
        String sql = "select * from t_commodity where id=?";
        return queryForOne(Commodity.class, sql, id);
    }

    /**
     * 创建商品
     */
    @Override
    public int createCommodity(Commodity commodity) {
        String sql = "insert into t_commodity(type,name,price,num,salenum,origin,productiondate,details)values(?,?,?,?,?,?,?,?)";
        return update(sql, commodity.getType(), commodity.getName(), commodity.getPrice(), commodity.getNum(), commodity.getSalenum(), commodity.getOrigin(), commodity.getProductiondate(), commodity.getDetails());
    }

    /**
     * 删除商品
     */
    @Override
    public int deleteCommodity(Commodity commodity) {
        String sql = "delete from t_commodity where id=?";
        return update(sql, commodity.getId());
    }

    /**
     * 查询所有的商品
     */
    @Override
    public List<Commodity> showCommodities() {
        String sql = "select * from t_commodity";
        return queryForList(Commodity.class, sql);
    }

    @Override
    public int deleteCommodity(String id) {
        String sql="delete from t_commodity where id=?";
        return update(sql,id);
    }

    /**
     * 查询 指定类型 的所有商品
     */
    @Override
    public List<Commodity> showCommoditiesOfType(String type) {
        String sql = "select * from t_commodity where type=?";
        return queryForList(Commodity.class, sql, type);
    }

    @Override
    public int modifyCommodity(Commodity commodity) {
        String sql = "update t_commodity set name=?,type=?,price=?,num=?,origin=?,productiondate=?,details=? where id=?";
        return update(sql, commodity.getName(), commodity.getType(), commodity.getPrice(), commodity.getNum(), commodity.getOrigin(), commodity.getProductiondate(), commodity.getDetails(), commodity.getId());
    }

    @Override
    public Commodity searchLastCommodity() {
        String sql =" select * from t_commodity where id = (select max(id) from t_commodity)";
        return queryForOne(Commodity.class,sql);
    }
}
