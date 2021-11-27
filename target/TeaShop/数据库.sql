-- 创建数据库
drop database if exists sale;
create database sale;
use sale;
-- 建表
create table t_user
(
    id       int primary key unique auto_increment,
    username varchar(30) unique,
    password varchar(32),
    email    varchar(255),
    tel      varchar(11)
);
-- 修改id 自增初始值为 10001
alter table t_user
    auto_increment = 10001;
# 插入数据
insert into t_user(username, password, email, tel)
values ('WYY', 'WYY', 'WYY@qq.com', '19503866856');
insert into t_user(username, password, email, tel)
values ('XYY', 'XYY', 'XYY@qq.com', '19503866856');
insert into t_user(username, password, email, tel)
values ('DYY', 'DYY', 'DYY@qq.com', '19503866856');
# 管理员表
create table t_admin
(
    id       int primary key unique auto_increment,
    username varchar(30) unique,
    password varchar(32),
    email    varchar(255),
    tel      varchar(11)
);
# 修改自增id为1001
alter table t_admin
    auto_increment = 1001;
# 插入管理员数据
insert into t_admin(username, password, email, tel)
values ('admin', 'admin', '2722617059@qq.com', '17539576804');
insert into t_admin(username, password, email, tel)
values ('root', 'root', '2240776653@qq.com', '19545633038');
# 商品表
create table t_commodity
(
    id             int primary key unique auto_increment,
    name           varchar(30)  not null,
    type           varchar(10)  not null,
    price          float        not null,
    num            int          not null,
    salenum        int          ,
    origin         varchar(255) not null,
    productiondate datetime     not null,
    details        varchar(255)
);
# 修改自增id为10000001
alter table t_commodity
    auto_increment = 10000001;
insert into t_commodity(name, type, price, num, salenum, origin, productiondate, details)
values ('明前龙井', '绿茶', 299, 1000, 30, '浙江省杭州市', '2021-5-18', '2021新茶，明前绿茶，安吉绿茶，茉莉花茶3大茗茶组合装。');
insert into t_commodity(name, type, price, num, salenum, origin, productiondate, details)
values ('金骏眉礼盒', '红茶', 169.99, 2000, 200, '武夷山市', '2021-6-17',
        '三款茗茶六种口味，领略相似而又不一样的茶滋味。大红袍：清香、浓香。金骏眉：蜜香、花香。正山小种：花香、花果香。');
insert into t_commodity(name, type, price, num, salenum, origin, productiondate, details)
values ('黄金芽礼盒装茶叶', '白茶', 418, 1500, 300, '福建福鼎', '2021-4-18', '金秋特惠，好茶相伴。');
insert into t_commodity(name, type, price, num, salenum, origin, productiondate, details)
values ('特级明前春茶', '白茶', 468, 2500, 1036, '云南景谷', '2021-4-19', '金秋特惠，好茶相伴。');
insert into t_commodity(name, type, price, num, salenum, origin, productiondate, details)
values ('明前黄山茶', '绿茶', 378, 1200, 260, '安徽', '2021-4-1', '金秋特惠，好茶相伴。');
insert into t_commodity(name, type, price, num, salenum, origin, productiondate, details)
values ('2021中秋茶礼', '红茶', 1999, 500, 150, '武夷山市', '2021-6-17', '每一片叶子都来自武夷山原产地。');
insert into t_commodity(name, type, price, num, salenum, origin, productiondate, details)
values ('明前高山云雾碧螺春', '绿茶', 11932.00, 99, 101, '洞庭湖', '2021-4-1', '洞庭山有茶，微似岕而细，味甚甘香，俗称‘吓煞人’，产碧螺峰者尤佳，名‘ 碧螺春’”。');
insert into t_commodity(name, type, price, num, salenum, origin, productiondate, details)
values ('太平猴魁猴魁', '绿茶', 9560.50, 325, 175, '安徽省黄山市黄山区', '2021-3-28', '太平猴魁，中国传统名茶，中国历史名茶之一，属于绿茶类尖茶，为尖茶之极品，久享盛名。');
insert into t_commodity(name, type, price, num, salenum, origin, productiondate, details)
values ('武夷岩茶', '青茶', 918, 1532, 378, '武夷山', '2021-4-18', '金秋特惠，好茶相伴。');
# 修改商品属性
# 创建购物车
# 需要的数据有：购买者的用户id、商品id、商品数量、商品价格
create table t_cart
(
    uid    int   not null,
    cid    int   not null,
    cname  varchar(255),
    cnum   int   not null,
    cprice float not null
);
# 插入数据
insert into t_cart(uid, cid, cname, cnum, cprice)
values ('10002', '10000001', '明前龙井', '1', '299');
insert into t_cart(uid, cid, cname, cnum, cprice)
values ('10002', '10000002', '金骏眉礼盒', '2', '169.99');
insert into t_cart(uid, cid, cname, cnum, cprice)
values ('10002', '10000003', '黄金芽礼盒装茶叶', '3', '418');
# 创建订单表
create table t_order
(
    orderId       varchar(100) not null,
    orderTime     date         not null,
    userId        int          not null,
    addressId     int          not null,
    commodityId   int          not null,
    commodityName varchar(20)  not null,
    num           int          not null,
    totalPrice    float        not null,
    orderStatus   varchar(20)
);
# 插入订单数据
insert into t_order(orderId, orderTime, userId, addressId, commodityId, commodityName, num, totalPrice, orderStatus)
VALUES ('20211125123400', '2021-05-18 00:00:00', '10002', '2', '10000001', '明前龙井', '1', '299', 'false');
insert into t_order(orderId, orderTime, userId, addressId, commodityId, commodityName, num, totalPrice, orderStatus)
VALUES ('2021112510002100', '2021-11-25 16:25:0', '10002', '1', '10000001', '明前龙井', '1', '299', 'false');
insert into t_order(orderId, orderTime, userId, addressId, commodityId, commodityName, num, totalPrice, orderStatus)
VALUES ('2021112510002100', '2021-11-25 16:25:0', '10002', '1', '10000001', '明前龙井', '1', '299.0', 'false');
insert into t_order(orderId, orderTime, userId, addressId, commodityId, commodityName, num, totalPrice, orderStatus)
values ('2021112510002100', '2021-11-25 16:25:0', '10002', '1', '10000002', '金骏眉礼盒', '2', '339.98', 'false');
# 创建地址表
create table t_address
(
    aid  int unique primary key not null auto_increment,
    uid  int                    not null,
    name varchar(32)            not null,
    tel  varchar(12)            not null,
    addr varchar(255)           not null,
    post varchar(6)             not null
);
# 插入地址数据
insert into t_address(uid, name, tel, addr, post)
VALUES ('10002', '王洋', '110', '河南省焦作市博爱县', '100100');
insert into t_address(uid, name, tel, addr, post)
VALUES ('10002', '王赛龙', '120', '河南省安阳市滑县', '110110');
# 创建会话表
create table t_message(
    messageId   int auto_increment unique primary key,
    orderId     varchar(255) not null ,
    id          int not null ,
    message     varchar(255)
);
# 插入数据
# insert into t_message(messageid, orderid, id, message) values ();
