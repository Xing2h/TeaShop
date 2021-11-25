package com.tee.pojo;

public class Address {
    /**
     * aid      地址编号
     * uid      用户编号
     * name     收件人
     * tel      电话
     * addr     地址
     * post     邮政编码
     */

    private String aid;
    private String uid;
    private String name;
    private String tel;
    private String addr;
    private String post;


    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public Address() {
    }

    public Address(String aid, String uid, String name, String tel, String addr, String post) {
        this.aid = aid;
        this.uid = uid;
        this.name = name;
        this.tel = tel;
        this.addr = addr;
        this.post = post;
    }

    @Override
    public String toString() {
        return " 姓名：" + name +
                ", 电话：" + tel +
                ", 地址：" + addr +
                ", 邮政编码：" + post;
    }
}
