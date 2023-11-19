/*
 契约个单系统数据库模型
 Source Server         : tencent_mysql
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : cdb-19urcqui.cd.tencentcdb.com:10057
 Source Schema         : ELECTRONIC_COMMERCE
 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001
 Table Count           : 45
 Date: 10/07/2022 09:16:23
*/
-- 一、用户类信息表
-- 1.用户基本信息表
CREATE TABLE `ACCOUNT` (
    `user_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户真实姓名',
    `id_type` char(2) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '证件类型 I-身份证',
    `id_no` varchar(18) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '证件号码',
    `mobile_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '手机号',
    `e_mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '邮箱',
    `sex` char(2) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '性别  F-女  M-男',
    `register_time` datetime NOT NULL COMMENT '账户注册时间',
    `balance` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '账户余额',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '账户最后更新时间',
    PRIMARY KEY (`user_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '账户基本信息表';


-- 2.用户收货地址表
CREATE TABLE `ACCOUNT_DELIVERY_ADDRESS` (
    `delivery_address_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '收货地址id',
    `user_id` int(11) NOT NULL COMMENT '用户id',
    `consignee` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '收货人姓名',
    `province_id` int(15) NOT NULL COMMENT '省份id',
    `city_id` int(15) COMMENT '市(县,旗)',
    `district_id` int(15) COMMENT '区(乡/镇)',
    `street_id` int(15) COMMENT '街道(社区)',
    `detail_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '详细地址(具体到楼号、单元号、门牌号)',
    `post_code` varchar(8) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '邮政编码',
    `telephone` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '联系电话',
    `mobile_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '手机号',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`delivery_address_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '收货地址表';


-- 3.用户会员级别信息表
CREATE TABLE `ACCOUNT_MEMBER_LEVEL_INFO` (
    `account_member_level_info_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户会员级别信息表',
    `user_id` int(11) NOT NULL COMMENT '用户ID',
    `member_level` int(2) NULL DEFAULT NULL COMMENT '账户会员级别  0-普通会员   1-白银会员   2-黄金会员    3-铂金会员    4-钻石会员    5-至尊会员',
    `member_level_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '账户会员级别中文名  0-普通会员   1-白银会员   2-黄金会员    3-铂金会员    4-钻石会员    5-至尊会员',
    `member_integration` int(10) NOT NULL DEFAULT 0 COMMENT '会员积分',
    `member_expire_time` datetime NOT NULL COMMENT '会员到期时间',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`account_member_level_info_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '用户会员级别信息表';


-- 4.用户店铺收藏表
CREATE TABLE `ACCOUNT_STORE_COLLECT` (
    `account_store_collect_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '用户店铺收藏ID',
    `user_id` int(11) NOT NULL COMMENT '账户ID',
    `shop_id` int(11) NOT NULL COMMENT '商户ID',
    `delete_flag` int(2) NOT NULL DEFAULT 0 COMMENT '删除标识     0-未删除    1-已删除(已取消收藏)',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`account_store_collect_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '用户店铺收藏表';


-- 5.用户品牌收藏表
CREATE TABLE `ACCOUNT_BRAND_COLLECT` (
    `account_brand_collect_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户品牌收藏ID',
    `user_id` int(15) NOT NULL COMMENT '用户ID',
    `brand_id` int(11) NOT NULL COMMENT '品牌ID',
    `delete_flag` int(2) NOT NULL COMMENT '删除标识    0-未删除    1-已删除(已取消收藏)',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`account_brand_collect_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '用户品牌收藏表';


-- 6.用户商品收藏表
CREATE TABLE `ACCOUNT_COMMODITY_COLLECT` (
    `account_commodity_collect_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '用户商品收藏ID',
    `user_id` int(11) NOT NULL COMMENT '账户ID',
    `commodity_id` int(15) NOT NULL COMMENT '商品ID',
    `delete_flag` int(2) NOT NULL DEFAULT 0 COMMENT '删除标识   0-未删除   1-已删除(已取消收藏)',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`account_commodity_collect_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '用户商品收藏表';


-- 7.用户银行卡绑定信息表
CREATE TABLE `ACCOUNT_BINDING_BANK_CARD_INFO` (
    `account_binding_bank_card_info_id` int(15) NOT NULL COMMENT '用户银行卡绑定信息表ID',
    `user_id` int(15) NOT NULL COMMENT '账户ID',
    `bank_card_no` varchar(40) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '银行卡号',
    `bank_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '银行卡所属银行名称',
    `balance` decimal(20,2) NOT NULL DEFAULT 0.00 COMMENT '银行卡余额',
    `bank_card_register_user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '银行卡登记姓名',
    `mobile_phone` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '银行预留手机号',
    `bank_card_type` int(2) NOT NULL COMMENT '银行卡类型    0-储蓄卡     1-信用卡     2-借记卡',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`account_binding_bank_card_info_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '用户银行卡绑定信息表';


-- 8.用户优惠券表
CREATE TABLE `ACCOUNT_PROMOTION` (
    `account_promotion_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '用户优惠券表ID',
    `user_id` int(11) NOT NULL COMMENT '优惠券所属用户ID',
    `promotion_type_id` int(11) NOT NULL COMMENT '优惠券种类ID',
    `shop_id` int(11) NULL COMMENT '优惠券所属商户ID',
    `commodity_id` int(11) NULL COMMENT '优惠券所属商品ID',
    `period_validity` int NOT NULL COMMENT '有效期(单位：天)',
    `create_time` datetime NOT NULL COMMENT '创建日期',
    PRIMARY KEY (`account_promotion_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '用户优惠券表';


-- 9.用户角色表
CREATE TABLE `ACCOUNT_ROLE` (
    `role_id` int(5) NOT NULL AUTO_INCREMENT,
    `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '角色名称',
    `role_type` char(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '角色类型   B-买家   S-卖家   A-管理员',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '角色更新时间',
    PRIMARY KEY (`role_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '用户角色表';


-- 10.用户角色关系表
CREATE TABLE `ACCOUNT_ROLE_RELATION` (
    `user_role_relation_id` int(20) NOT NULL,
    `role_id` int(5) NOT NULL COMMENT '角色ID',
    `user_id` int(15) NOT NULL COMMENT '用户ID',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL COMMENT '更新时间',
    PRIMARY KEY (`user_role_relation_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '用户角色关系表';


-- 11.用户登录信息表
CREATE TABLE `ACCOUNT_LOGIN_INFO` (
    `user_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '用户Id',
    `user_login_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户登录名',
    `user_login_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户登录密码',
    `user_login_status` char(2) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户登录状态    0-未登录   1-已登录',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`user_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '用户登录信息表';


-- 12.用户历史搜索关键字表
CREATE TABLE `ACCOUNT_SEARCH_KEY_WORD` (
    `account_search_key_word_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '用户历史搜索关键字ID',
    `user_id` int(15) NOT NULL COMMENT '账户ID',
    `key_word` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '关键词',
    `frequency` int(15) NOT NULL DEFAULT 0 COMMENT '关键词出现频度',
    `delete_flag` int(2) NOT NULL DEFAULT 0 COMMENT '删除标识      0-未删除     1-已删除',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`account_search_key_word_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '用户历史搜索关键字表';



-- 二、资源类信息表
-- 11.地区字典表
CREATE TABLE `REGION_DICT` (
    `region_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '地区ID',
    `parent_region_id` int(11) NOT NULL DEFAULT '0' COMMENT '地区父ID',
    `region_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '地区名称',
    `region_type` int(2) NOT NULL DEFAULT '0' COMMENT '地区类型  0.省/直辖市/港澳台   1.地级市   2.旗/县/区   3.乡/镇   4.村',
    `post_code` varchar(255) DEFAULT NULL COMMENT '邮政编码',
    `longitude` double(19,16) DEFAULT '0.0000000000000000' COMMENT '经度',
    `latitude` double(19,16) DEFAULT '0.0000000000000000' COMMENT '纬度',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`region_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '地区字典表';


-- 12.银行信息表
CREATE TABLE `BANK_INFO` (
    `bank_id` int(3) NOT NULL AUTO_INCREMENT COMMENT '银行ID',
    `bank_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '银行名称',
    `bank_type` char(255) CHARACTER SET utf8 COLLATE utf8_bin COMMENT '银行类型',
    `bank_code` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin COMMENT '银行编码',
    `display_flag` char(2) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT 'Y' COMMENT '是否展示(是否启用该银行)  Y-是   N-否',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`bank_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '银行信息表';


-- 13.购物车信息表
CREATE TABLE `CART_INFO` (
    `cart_info_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '购物车ID',
    `user_id` int(15) NOT NULL COMMENT '购物车所属账户ID',
    `commodity_id` int(20) NOT NULL COMMENT '商品ID',
    `shop_id` int(10) NOT NULL DEFAULT 0.00 COMMENT '商户ID',
    `shop_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商户名称',
    `commodity_amount` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '商品价格',
    `commodity_quantity` int(10) NOT NULL DEFAULT 0 COMMENT '商品数量',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`cart_info_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '购物车信息表';


-- 14.物流公司信息表
CREATE TABLE `LOGISTICS_COMPANY` (
    `logistics_company_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '物流公司ID(主键)',
    `logistics_company_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '物流公司名称',
    `logistics_company_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '物流公司代码',
    `display_flag` int(2) NOT NULL DEFAULT 0 COMMENT '是否显示    0-显示    1-不显示',
    `sign_flag` int(2) NOT NULL DEFAULT 1 COMMENT '是否已签约    0-已签约    1-未签约',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`logistics_company_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '物流公司信息表';


-- 15.物流信息表
CREATE TABLE `LOGISTICS_INFO` (
    `logistics_info_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '物流信息表ID(主键)',
    `logistics_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '物流编号',
    `logistics_company_id` int(15) NOT NULL COMMENT '所属物流公司',
    `commodity_id` int(15) NOT NULL COMMENT '商品ID',
    `commodity_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商品标题',
    `commodity_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商品名称',
    `order_id` int(15) NOT NULL COMMENT '商品所属订单ID',
    `shop_id` int(15) NOT NULL COMMENT '商品所属商户ID',
    `receive_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '收货人姓名',
    `pay_time` datetime NOT NULL COMMENT '支付时间',
    `deliver_time` datetime NOT NULL COMMENT '发货时间',
    `courier_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '快递员编号',
    `courier_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '快递员姓名',
    `courier_mobile_phone` varchar(13) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '快递员手机号',
    `courier_star` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '快递员星级',
    `package_longitude` double(20,10) NOT NULL COMMENT '包裹所在位置经度',
    `package_latitude` double(20,10) NOT NULL COMMENT '包裹所在位置纬度',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`logistics_info_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '物流信息表';



-- 三、订单类信息表
-- 16.订单信息表
CREATE TABLE `ORDER_INFO` (
    `order_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
    `order_serial_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '订单编号',
    `user_id` int(15) NOT NULL COMMENT '订单所属用户ID',
    `order_type` int(2) NOT NULL COMMENT '订单类型  0-普通订单   1-秒杀订单',
    `order_status` int(2) NOT NULL COMMENT '订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。',
    `order_source` int(2) NOT NULL COMMENT '订单来源     0-PC端订单；1-app订单',
    `order_amount_sum` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '订单总金额',
    `pay_type` int(2) NULL COMMENT '支付方式  0-未支付；1-支付宝；2-微信   3-银行卡快捷支付',
    `pay_amount` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '应付金额(通常指未优惠时的金额)',
    `actual_pay_amount` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '实付金额(通常指优惠打折后的金额)',
    `freight_amount` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '订单运费',
    `shop_id` int(15) NOT NULL COMMENT '订单所属商户ID',
    `logistics_company_id` int(15) NULL DEFAULT NULL COMMENT '物流公司ID',
    `logistics_serial_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '物流单号',
    `integration` int(10) NULL DEFAULT NULL COMMENT '可以获得的积分',
    `beans` int(10) NULL DEFAULT NULL COMMENT '可以获得的欣豆',
    `receiver_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收货人姓名',
    `receiver_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收货人电话',
    `receiver_post_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收货人邮编',
    `receiver_province_id` int(11) NULL DEFAULT NULL COMMENT '收货人所在省份/直辖市ID',
    `receiver_city` int(11) NULL DEFAULT NULL COMMENT '收货人所在地级市/省会城市/县/旗ID',
    `receiver_region` int(11) NULL DEFAULT NULL COMMENT '收货人所在区域/乡/镇',
    `receiver_street` int(11) NULL DEFAULT NULL COMMENT '收货人所在街道',
    `receiver_detail_address` int(11) NULL DEFAULT NULL COMMENT '收货人详细地址(具体到楼号/单元号/门牌号)',
    `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '备注',
    `confirm_status` int(2) NOT NULL DEFAULT 0 COMMENT '确认收货状态   0-未确认    1-已确认',
    `confirm_time` datetime NULL DEFAULT NULL COMMENT '确认收货时间',
    `comment` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '订单评价',
    `comment_time` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '订单评价时间',
    `comment_star_level` int(2) NULL DEFAULT NULL COMMENT '订单评价星级(1-5的数值)',
    `payment_time` datetime NULL DEFAULT NULL COMMENT '支付时间',
    `logistics_time` datetime NULL DEFAULT NULL COMMENT '发货时间',
    `use_integration` int(15) NOT NULL DEFAULT 0 COMMENT '下单时使用的积分',
    `auto_confirm_time` datetime NULL DEFAULT NULL COMMENT '订单自动确认时间',
    `bill_type` int(2) NULL DEFAULT NULL COMMENT '发票类型   0-不开发票    1-电子发票    2-纸质发票',
    `bill_header` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '发票抬头',
    `taxpayer_identification_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '纳税人识别号',
    `bill_receiver_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收票人邮箱',
    `bill_receiver_phones` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收票人电话',
    `promotion_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '活动信息',
    `promotion_amount` decimal(60,0) NULL DEFAULT 0.00 COMMENT '促销优化金额（促销价、满减、阶梯价）',
    `integration_amount` decimal(60,0) NULL DEFAULT 0.00 COMMENT '积分抵扣金额',
    `coupon_amount` decimal(60,0) NULL DEFAULT 0.00 COMMENT '优惠券抵扣金额',
    `discount_amount` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '管理员后台调整订单使用的折扣金额',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `create_time` datetime NOT NULL COMMENT '创建时间(订单创建时间)',
    PRIMARY KEY (`order_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '订单信息表';


-- 17.订单商品明细表
CREATE TABLE `ORDER_COMMODITY_INFO` (
    `order_commodity_info_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '订单商品明细ID',
    `order_id` int(15) NOT NULL COMMENT '订单ID',
    `commodity_id` int(15) NOT NULL COMMENT '商品ID',
    `commodity_quantity` int(10) ZEROFILL NOT NULL DEFAULT 0 COMMENT '商品数量',
    `promotion_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品促销活动名称',
    `promotion_amount` decimal(10,2) NULL DEFAULT 0.00 COMMENT '商品促销分解金额',
    `coupon_amount` decimal(10,2) NULL DEFAULT 0.00 COMMENT '优惠券优惠分解金额',
    `integration_amount` decimal(10,2) NULL DEFAULT 0.00 COMMENT '积分优惠分解金额',
    `beans_amount` decimal(10,2) NULL DEFAULT 0.00 COMMENT '欣豆优惠分解金额',
    `real_amount` decimal(10,2) NULL DEFAULT 0.00 COMMENT '该商品优惠后的金额',
    `gift_integration` int(10) NULL DEFAULT 0 COMMENT '商品赠送积分',
    `gift_beans` int(10) NULL DEFAULT 0 COMMENT '商品赠送欣豆',
    `commodity_attr` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品销售属性',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`order_commodity_info_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '订单商品明细表';


-- 18.历史订单表
CREATE TABLE `ORDER_HISTORY_INFO` (
    `order_history_info_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '历史订单ID',
    `order_serial_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '历史订单编号',
    `user_id` int(15) NOT NULL COMMENT '历史订单所属用户ID',
    `order_type` int(2) NOT NULL COMMENT '历史订单类型  0-普通订单   1-秒杀订单',
    `order_status` int(2) NOT NULL COMMENT '历史订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。',
    `order_source` int(2) NOT NULL COMMENT '历史订单来源     0-PC端订单；1-app订单',
    `order_amount_sum` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '历史订单总金额',
    `pay_type` int(2) NULL COMMENT '支付方式  0-未支付；1-支付宝；2-微信   3-银行卡快捷支付',
    `pay_amount` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '应付金额(通常指未优惠时的金额)',
    `actual_pay_amount` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '实付金额(通常指优惠打折后的金额)',
    `freight_amount` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '历史订单运费',
    `shop_id` int(15) NOT NULL COMMENT '历史订单所属商户ID',
    `logistics_company_id` int(15) NULL DEFAULT NULL COMMENT '物流公司ID',
    `logistics_serial_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '物流单号',
    `integration` int(10) NULL DEFAULT NULL COMMENT '可以获得的积分',
    `beans` int(10) NULL DEFAULT NULL COMMENT '可以获得的欣豆',
    `receiver_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收货人姓名',
    `receiver_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收货人电话',
    `receiver_post_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收货人邮编',
    `receiver_province_id` int(11) NULL DEFAULT NULL COMMENT '收货人所在省份/直辖市ID',
    `receiver_city` int(11) NULL DEFAULT NULL COMMENT '收货人所在地级市/省会城市/县/旗ID',
    `receiver_region` int(11) NULL DEFAULT NULL COMMENT '收货人所在区域/乡/镇',
    `receiver_street` int(11) NULL DEFAULT NULL COMMENT '收货人所在街道',
    `receiver_detail_address` int(11) NULL DEFAULT NULL COMMENT '收货人详细地址(具体到楼号/单元号/门牌号)',
    `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '备注',
    `confirm_status` int(2) NOT NULL DEFAULT 0 COMMENT '确认收货状态   0-未确认    1-已确认',
    `confirm_time` datetime NULL DEFAULT NULL COMMENT '确认收货时间',
    `comment` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '历史订单评价',
    `comment_time` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '历史订单评价时间',
    `comment_star_level` int(2) NULL DEFAULT NULL COMMENT '历史订单评价星级(1-5的数值)',
    `payment_time` datetime NULL DEFAULT NULL COMMENT '支付时间',
    `logistics_time` datetime NULL DEFAULT NULL COMMENT '发货时间',
    `use_integration` int(15) NOT NULL DEFAULT 0 COMMENT '下单时使用的积分',
    `auto_confirm_time` datetime NULL DEFAULT NULL COMMENT '历史订单自动确认时间',
    `bill_type` int(2) NULL DEFAULT NULL COMMENT '发票类型   0-不开发票    1-电子发票    2-纸质发票',
    `bill_header` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '发票抬头',
    `taxpayer_identification_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '纳税人识别号',
    `bill_receiver_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收票人邮箱',
    `bill_receiver_phones` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收票人电话',
    `promotion_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '活动信息',
    `promotion_amount` decimal(60,0) NULL DEFAULT 0.00 COMMENT '促销优化金额（促销价、满减、阶梯价）',
    `integration_amount` decimal(60,0) NULL DEFAULT 0.00 COMMENT '积分抵扣金额',
    `coupon_amount` decimal(60,0) NULL DEFAULT 0.00 COMMENT '优惠券抵扣金额',
    `discount_amount` decimal(60,0) NOT NULL DEFAULT 0.00 COMMENT '管理员后台调整订单使用的折扣金额',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `create_time` datetime NOT NULL COMMENT '创建时间(历史订单创建时间)',
    PRIMARY KEY (`order_history_info_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '历史订单表';


-- 19.历史订单商品明细表
CREATE TABLE `ORDER_DETAIL_HISTORY_INFO` (
    `order_detail_history_info_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '历史订单商品明细ID',
    `order_id` int(15) NOT NULL COMMENT '订单ID',
    `commodity_id` int(15) NOT NULL COMMENT '商品ID',
    `commodity_quantity` int(10) ZEROFILL NOT NULL DEFAULT 0 COMMENT '商品数量',
    `promotion_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品促销活动名称',
    `promotion_amount` decimal(10,2) NULL DEFAULT 0.00 COMMENT '商品促销分解金额',
    `coupon_amount` decimal(10,2) NULL DEFAULT 0.00 COMMENT '优惠券优惠分解金额',
    `integration_amount` decimal(10,2) NULL DEFAULT 0.00 COMMENT '积分优惠分解金额',
    `beans_amount` decimal(10,2) NULL DEFAULT 0.00 COMMENT '欣豆优惠分解金额',
    `real_amount` decimal(10,2) NULL DEFAULT 0.00 COMMENT '该商品优惠后的金额',
    `gift_integration` int(10) NULL DEFAULT 0 COMMENT '商品赠送积分',
    `gift_beans` int(10) NULL DEFAULT 0 COMMENT '商品赠送欣豆',
    `commodity_attr` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品销售属性',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`order_detail_history_info_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '历史订单商品明细表';


-- 20.订单操作记录表
CREATE TABLE `ORDER_OPERATION_RECORD` (
    `order_operation_record_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '订单操作记录ID',
    `order_id` int(11) NOT NULL COMMENT '订单ID',
    `operation_psn` int(2) NOT NULL DEFAULT 0 COMMENT '操作人 0.用户(买家) 1.商户(卖家) 2.系统(包含秒杀超时自动关闭的操作) 3.系统管理员',
    `order_status` int(2) NOT NULL COMMENT '订单状态  0-待付款；1-待发货；2-已发货；3-已完成；4-已关闭；5-无效订单。',
    `operation_time` datetime NOT NULL COMMENT '操作时间',
    `create_time` datetime NOT NULL COMMENT '记录创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`order_operation_record_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '订单操作记录表';



-- 四、商品类信息表
-- 21.商品品牌表
CREATE TABLE `COMMODITY_BRAND` (
    `commodity_brand_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商品品牌ID',
    `brand_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '品牌名称',
    `first_letter` varchar(8) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '首字母',
    `factory_status` int(2) NULL DEFAULT NULL COMMENT '是否为品牌制造商   0-是   1-否',
    `display_flag` int(2) NOT NULL DEFAULT 0 COMMENT '是否显示    0-显示    1-不显示',
    `product_num` int(15) NOT NULL DEFAULT 0 COMMENT '品牌产品数量',
    `product_comment_num` int(15) NOT NULL DEFAULT 0 COMMENT '产品评论数量',
    `logo` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '品牌logo',
    `brand_pic` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '品牌专区大图',
    `brand_story` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '品牌故事',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`commodity_brand_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品品牌表';


-- 22.商品类型表
CREATE TABLE `COMMODITY_TYPE` (
    `commodity_type_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商品类型表',
    `parent_commodity_type_id` int(15) NOT NULL DEFAULT 0 COMMENT '品牌类型父ID(上级分类的ID)    0-一级分类',
    `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '分类名称',
    `type_level` int(2) NOT NULL DEFAULT 1 COMMENT '分类级别(以此类推)     1-一级列表     2-二级列表     3-三级列表',
    `commodity_num` int(13) NOT NULL DEFAULT 0 COMMENT '商品数量',
    `commodity_unit` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品单位',
    `nav_display_flag` int(2) NOT NULL DEFAULT 0 COMMENT '是否在导航栏显示    0-显示    1-不显示',
    `display_flag` int(2) NOT NULL DEFAULT 0 COMMENT '是否显示    0-显示    1-不显示',
    `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '图标',
    `keyword` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '类别关键字',
    `description` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '类别描述',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`commodity_type_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品类型表';


-- 23.商品标签表
CREATE TABLE `COMMODITY_TAG` (
    `commodity_tag_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '商品标签表ID(主键)',
    `tag_serial` int(10) UNSIGNED NOT NULL COMMENT '商品标签序号',
    `tag_type_num` int(2) NULL COMMENT '标签类别序号',
    `tag_type_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '标签类别名称',
    `tag_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '标签名称',
    `tag_description` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '标签描述',
    `del_flag` int(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '删除标识  0-未删除  1-已删除',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`commodity_tag_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品标签表';


-- 24.商品表
CREATE TABLE `COMMODITY` (
    `commodity_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商品ID(主键)',
    `commodity_num` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商品编号(条码编号)',
    `commodity_title` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品标题',
    `commodity_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商品名称',
    `commodity_belong_type_id` int(15) NULL DEFAULT NULL COMMENT '商品所属类型ID',
    `commodity_belong_brand_id` int(15) NULL DEFAULT NULL COMMENT '商品所属品牌ID',
    `commodity_price` decimal(10,2) NOT NULL DEFAULT 0.00 COMMENT '商品价格',
    `commodity_repertory` int(10) UNSIGNED NOT NULL DEFAULT 0 COMMENT '商品库存',
    `commodity_status` int(2) NULL DEFAULT 1 COMMENT '商品状态(0-下架  1-上架  2-已删除)',
    `commodity_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品描述',
    `commodity_click_times` int(15) NOT NULL DEFAULT 0 COMMENT '商品浏览量(点击量)',
    `commodity_keyword` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品关键字',
    `commodity_main_pic` int(15) NOT NULL COMMENT '商品主图ID',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`commodity_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品表';


-- 25.商品标签关系表
CREATE TABLE `COMMODITY_TAG_RELATION` (
    `commodity_tag_relation_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商品标签关系表主键ID',
    `commodity_id` int(15) NOT NULL COMMENT '商品ID',
    `commodity_tag_id` int(15) NOT NULL COMMENT '商品标签ID',
    `del_flag` int(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '删除标识   0-未删除   1-已删除',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`commodity_tag_relation_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品标签关系表';


-- 26.商品图片表
CREATE TABLE `COMMODITY_PIC` (
    `commodity_pic_id` int(16) NOT NULL AUTO_INCREMENT COMMENT '商品图片ID',
    `commodity_id` int(16) NOT NULL COMMENT '商品ID',
    `pic_url` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品图片链接地址',
    `del_flag` int(2) NOT NULL DEFAULT 0 COMMENT '删除标识 0-未删除  1-已删除',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`commodity_pic_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品图片表';


-- 27.商品评价表
CREATE TABLE `COMMODITY_COMMENT` (
    `commodity_comment_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商品评价ID',
    `commodity_id` int(15) NOT NULL COMMENT '商品ID',
    `comment_type` int(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '评价类型   0-好评    1-中评    2-差评',
    `comment_description` varchar(655) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '评价内容',
    `additional_evaluation` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '追加评价',
    `comment_pic_url` varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '评价图片链接地址',
    `del_flag` int(2) NOT NULL DEFAULT 0 COMMENT '删除标识   0-未删除  1-已删除',
    `additional_evaluation_time` datetime NULL DEFAULT NULL COMMENT '追加评价时间',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`commodity_comment_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品评价表';


-- 28.商品打折信息表
CREATE TABLE `COMMODITY_DISCOUNT_INFO` (
    `commodity_discount_info_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商品打折信息ID',
    `commodity_id` int(15) NOT NULL COMMENT '商品ID',
    `commodity_discount` decimal(5,2) NULL DEFAULT NULL COMMENT '折扣比例',
    `discount_start_time` datetime NULL DEFAULT NULL COMMENT '折扣开始时间',
    `discount_end_time` datetime NULL DEFAULT NULL COMMENT '折扣结束时间',
    `del_flag` int(2) NOT NULL DEFAULT 0 COMMENT '删除标识    0-未删除   1-已删除',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`commodity_discount_info_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品打折信息表';


-- 29.商品属性名表
CREATE TABLE `COMMODITY_PROPERTIES` (
    `commodity_properties_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商品属性ID',
    `commodity_properties_serial` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商品属性编号',
    `commodity_properties_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商品属性名称',
    `commodity_properties_type` int(2) NULL DEFAULT NULL COMMENT '商品属性类型  0-一般属性  1-特殊属性',
    `del_flag` int(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '删除标识   0-未删除   1-已删除',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`commodity_properties_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品属性名表';


-- 30.商品属性值表
CREATE TABLE `COMMODITY_PROPERTIES_VALUES` (
    `commodity_properties_values_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商品属性值表ID',
    `commodity_properties_id` int(15) NOT NULL COMMENT '商品属性ID',
    `commodity_properties_values_serial` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商品属性值编号',
    `commodity_properties_value` varchar(500) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商品属性值',
    `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '备注',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`commodity_properties_values_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品属性值表';


-- 31.商品套餐类型表
CREATE TABLE `COMMODITY_PLAN_TYPE` (
    `commodity_plan_type_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商品套餐类型ID',
    `commodity_id` int(15) NOT NULL COMMENT '商品ID',
    `commodity_plan_type_serial` int(2) NULL DEFAULT NULL COMMENT '商品套餐类型序号',
    `commodity_plan_type_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商品套餐类型名称',
    `del_flag` int(2) NOT NULL DEFAULT 0 COMMENT '删除标识   0-未删除   1-已删除',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`commodity_plan_type_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商品套餐类型表';



-- 五、优惠券类信息表
-- 32.优惠券种类表
CREATE TABLE `COUPON_TYPE` (
    `coupon_type_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '优惠券种类ID',
    `coupon_type` int(5) NULL DEFAULT NULL COMMENT '优惠券种类  0-通用满减券;1-通用代金券;2-通用折扣券;3-品类满减券;4-品类代金券;5-品类折扣券;6-会员满减券;7-会员代金券;8-会员折扣券;9-新人首单满减券;10-新人首单代金券;11-新人首单折扣券',
    `coupon_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '优惠券规则描述',
    `coupon_amnt` decimal(10,2) UNSIGNED NULL DEFAULT NULL COMMENT '优惠券金额(作为代金券的金额)',
    `full_amnt` decimal(10,2) NULL COMMENT '满金额',
    `full_reduction_amnt` decimal(10,2) NULL COMMENT '满减金额',
    `reduce_amnt` decimal(10,2) NULL COMMENT '立减金额',
    `discount_proportion` double(10,2) NULL COMMENT '折扣比例',
    `del_flag` int(2) UNSIGNED NOT NULL DEFAULT 0 COMMENT '删除标识   0-未删除   1-已删除',
    `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '备注',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`coupon_type_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '优惠券种类表';


-- 33.优惠券表
CREATE TABLE `COUPON` (
    `coupon_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '优惠券ID',
    `coupon_type_id` int(15) NOT NULL COMMENT '优惠券种类ID',
    `coupon_start_time` datetime NULL COMMENT '优惠券生效时间',
    `coupon_end_time` datetime NULL COMMENT '优惠券失效时间',
    `coupon_amount` int(15) UNSIGNED NOT NULL DEFAULT 0 COMMENT '优惠券数量',
    `coupon_state` int(2) NOT NULL DEFAULT 0 COMMENT '优惠券状态   0-未生效   1-已生效   2-已失效  3-已使用   4-未使用',
    `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '备注',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`coupon_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '优惠券表';


-- 34.优惠券领取记录表
CREATE TABLE `COUPON_RECEIVE_RECORD` (
    `coupon_receive_record_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '优惠券领取记录表ID',
    `buyer_id` int(15) NOT NULL COMMENT '领取人ID',
    `coupon_id` int(15) NOT NULL COMMENT '优惠券ID',
    `create_time` datetime NOT NULL COMMENT '创建时间(优惠券领取时间)',
    PRIMARY KEY (`coupon_receive_record_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '优惠券领取记录表';


-- 35.优惠券消费记录表
CREATE TABLE `COUPON_CONSUME_RECORD` (
    `coupon_consume_record_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '优惠券消费记录ID',
    `buyer_id` int(15) NOT NULL COMMENT '买家ID',
    `order_serial` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '订单号',
    `coupon_id` int(15) NOT NULL COMMENT '优惠券ID',
    `create_time` datetime NOT NULL COMMENT '创建时间(消费时间)',
    PRIMARY KEY (`coupon_consume_record_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '优惠券消费记录表';



-- 六、供应商类信息表
-- 36.供应商信息表
CREATE TABLE `SUPPLIER_INFO` (
    `supplier_info_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '供应商信息ID',
    `supplier_num` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '供应商编号',
    `supplier_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '供应商名称',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`supplier_info_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '供应商信息表';


-- 37.供应商与商品关系表
CREATE TABLE `SUPPLIER_COMMODITY_RELATION` (
    `supplier_commodity_relation_id` int(16) NOT NULL AUTO_INCREMENT COMMENT '供应商与商品关系ID',
    `supplier_info_id` int(11) NOT NULL COMMENT '供应商ID',
    `commodity_id` int(11) NOT NULL COMMENT '商品ID',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`supplier_commodity_relation_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '供应商与商品关系表';



-- 七、商户类信息表
-- 38.商户信息表
CREATE TABLE `SHOP_INFO` (
    `shop_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商户ID(主键)',
    `shop_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商户名称',
    `legal_representative` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商户法定代表人',
    `legal_representative_id_type` char(2) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '商户法定代表人证件类型',
    `legal_representative_id_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '商户法定代表人证件号码',
    `legal_representative_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '商户法定代表人手机号',
    `authentication_flag` int(2) NOT NULL DEFAULT 0 COMMENT '商户是否认证 0-未认证   1-已认证   2-认证中',
    `authentication_date` datetime NULL DEFAULT NULL COMMENT '商户认证时间',
    `shop_link_addr` varchar(510) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '商户链接地址',
    `office_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '商户联系电话',
    `shop_star_level` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '★' COMMENT '店铺星级',
    `shop_language` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '店铺语言',
    `shop_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '店铺说明',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`shop_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商户信息表';


-- 39.商户商品类目表
CREATE TABLE `SHOP_COMMODITY_CATEGORY` (
    `shop_commodity_category_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商户商品类目表',
    `shop_id` int(15) NOT NULL COMMENT '商户ID',
    `shop_category_serial` int(5) UNSIGNED NULL DEFAULT NULL COMMENT '商户类目序号',
    `shop_category_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商户类目名称',
    `shop_category_grade` int(5) NOT NULL DEFAULT 0 COMMENT '商户商品类目级别 0-总类目  1-一级类目  2-二级类目  3-三级类目',
    `shop_commodity_category_parent_id` int(15) NULL DEFAULT NULL COMMENT '商户商品类目父ID',
    `del_flag` int(2) NOT NULL DEFAULT 0 COMMENT '删除标识  0-未删除  1-已删除',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`shop_commodity_category_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商户商品类目表';


-- 40.商户商品信息表
CREATE TABLE `SHOP_COMMODITY_REGISTER` (
    `shop_commodity_register_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '商户商品信息ID',
    `shop_id` int(15) NOT NULL COMMENT '商户ID',
    `commodity_id` int(16) NOT NULL COMMENT '商品ID',
    `shop_commodity_category_id` int(15) NOT NULL COMMENT '商户商品类目ID',
    `del_flag` int NOT NULL COMMENT '删除标识  0-未删除  1-已删除',
    `commodity_status` int NOT NULL DEFAULT 0 COMMENT '商品状态  0-下架  1-上架 ',
    `create_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`shop_commodity_register_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '商户商品信息表';



-- 八、批作业相关信息表
-- 41.批作业任务表
CREATE TABLE `td_batch_task` (
    `batch_task_id` bigint(15) NOT NULL AUTO_INCREMENT COMMENT '批作业任务ID',
    `task_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批作业任务名称',
    `task_description` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批作业任务描述',
    `task_cron_expression` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'cron定时器表达式',
    `bean_class_path` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '任务执行时调用哪个类的方法(包名 + 类名)',
    `job_status` int(10) NOT NULL DEFAULT 0 COMMENT '任务状态(0-未启动，1-正常运行，2-停用下线)',
    `job_group` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务分组',
    `create_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批作业任务创建者',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '批作业任务更新者',
    `update_time` datetime NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`batch_task_id`)
) ENGINE = InnoDB DEFAULT CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '批作业任务表';


-- 42.批作业执行记录表



-- 九、其他类信息表
-- 43.订单设置表
CREATE TABLE `ORDER_SETTING` (
    `order_setting_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单设置ID',
    `flash_order_overtime` int(15) NULL COMMENT '秒杀订单超时关闭时间(分)',
    `normal_order_overtime` int(15) NULL COMMENT '正常订单超时时间(分)',
    `confirm_overtime` int(15) NULL COMMENT '发货后自动确认收货时间（天）',
    `finish_overtime` int(15) NULL COMMENT '自动完成交易时间，不能申请售后（天）',
    `comment_overtime` int(15) NULL COMMENT '订单完成后自动好评时间（天）',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    `update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`order_setting_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '订单设置表';


-- 44.支付流水信息表
CREATE TABLE `PAY_TURNOVER_INFO` (
    `pay_turnover_info_id` int(15) NOT NULL AUTO_INCREMENT COMMENT '支付流水信息ID',
    `pay_turnover_serial` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '支付流水交易号',
    `buyer_id` int(15) NOT NULL COMMENT '买家ID',
    `order_serial` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '订单号',
    `pay_way` int(2) NOT NULL DEFAULT 0 COMMENT '支付方式   1-支付宝；2-微信   3-银行卡快捷支付',
    `pay_amnt` decimal(10,2) UNSIGNED NOT NULL COMMENT '支付金额',
    `create_time` datetime NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`pay_turnover_info_id`)
) ENGINE = InnoDB CHARSET = utf8 COLLATE = utf8_bin COMMENT = '支付流水信息表';


-- 45.字典码值表
CREATE TABLE `DICT_CONTRAST` (
    `dict_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '字典名称',
    `dict_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '字典码值',
    `dict_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '字典码值释义',
    `dict_enable_status` int(4) NOT NULL DEFAULT 0 COMMENT '码值启用状态(0-启用   1-未启用)',
    `remark` varchar(2000) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '备注'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '字典码值表';


-- 46.批作业任务表
CREATE TABLE BATCH_TASK
(
    BATCH_TASK_ID        bigint(15) NOT NULL AUTO_INCREMENT COMMENT '批作业任务ID',
    TASK_NAME            varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '批作业任务名称',
    TASK_DESCRIPTION     varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '批作业任务描述',
    TASK_CRON_EXPRESSION varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'CRON定时器表达式',
    BEAN_CLASS_PATH      varchar(1000) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '任务执行时调用哪个类的方法(包名 + 类名)',
    JOB_STATUS           int(10) NOT NULL DEFAULT 0 COMMENT '任务状态(0-未启动，1-正常运行，2-停用下线)',
    JOB_GROUP            varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '任务分组',
    CREATE_USER          varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '批作业任务创建者',
    CREATE_TIME          datetime NOT NULL COMMENT '创建时间',
    UPDATE_USER          varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '批作业任务更新者',
    UPDATE_TIME          datetime NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间'
    PRIMARY KEY (`BATCH_TASK_ID`)
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '批作业任务表';