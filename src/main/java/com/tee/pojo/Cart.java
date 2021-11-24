package com.tee.pojo;

/**
 * @author Xing
 * date 2021-11-22-13-03
 **/
public class Cart {
    /**
     * 购物车类，存放购物车数据
     * uid      用户编号
     * cid      商品编号
     * cnum     商品数量
     * cprice   商品单价
     */
    private String uid;
    private String cid;
    private String cname;
    private int cnum;
    private float cprice;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    public float getCprice() {
        return cprice;
    }

    public void setCprice(float cprice) {
        this.cprice = cprice;
    }

    public Cart() {
    }

    public Cart(String uid, String cid, String cname, int cnum, float cprice) {
        this.uid = uid;
        this.cid = cid;
        this.cname = cname;
        this.cnum = cnum;
        this.cprice = cprice;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "uid='" + uid + '\'' +
                ", cid='" + cid + '\'' +
                ", cnum=" + cnum +
                ", cprice=" + cprice +
                '}';
    }
}
