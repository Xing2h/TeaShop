package com.tee.pojo;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author Xing
 * date 2021-11-21-11-22
 **/
public class Commodity {
    /**
     * id               商品编号
     * type             商品类型
     * name             商品名
     * price            商品价格
     * num              库存
     * salenum          销售数量
     * origin           原产地
     * productiondate   生产日期
     * details          商品描述
     */
    private String id;
    private String type;
    private String name;
    private float price;
    private int num;
    private int salenum;
    private String origin;
    private String productiondate;
    private String details;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSalenum() {
        return salenum;
    }

    public void setSalenum(int salenum) {
        this.salenum = salenum;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getProductiondate() {
        return productiondate;
    }

    public void setProductiondate(String productiondate) {
        this.productiondate = productiondate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", salenum=" + salenum +
                ", origin='" + origin + '\'' +
                ", productiondate='" + productiondate + '\'' +
                ", details='" + details + '\'' +
                '}';
    }

    public Commodity() {
    }

    public Commodity(String id, String type, String name, float price, int num, int salenum, String origin, String productiondate, String details) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
        this.num = num;
        this.salenum = salenum;
        this.origin = origin;
        this.productiondate = productiondate;
        this.details = details;
    }
}
