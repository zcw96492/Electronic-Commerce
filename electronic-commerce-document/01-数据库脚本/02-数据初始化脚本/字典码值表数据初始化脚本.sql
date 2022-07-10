/*
 Navicat Premium Data Transfer

 Source Server         : tencent_mysql
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : 118.25.236.128:3306
 Source Schema         : market-service

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001
 Table Name            : 字典码值表

 Date: 27/07/2020 21:16:57
*/

BEGIN;

-- 证件类型字典
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','ID','身份证',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','PA','护照',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','SO','军人证',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','RE','在华居住证',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','TP','台湾居民往来大陆通行证',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','GP','港澳居民来往内地通行证',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','FI','外国人永久居留身份证',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','RP','居民户口簿',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','MP','出生医学证明',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','TI','临时身份证',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','GD','港澳台居民居住证',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ID_TYPE','OT','其他',0,null);

-- 订单来源字典
INSERT INTO DICT_CONTRAST VALUES ('ORDER_SOURCE','0','PC端订单',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ORDER_SOURCE','1','APP端订单',0,null);

-- 订单状态字典
INSERT INTO DICT_CONTRAST VALUES ('ORDER_STATUS','0','待付款',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ORDER_STATUS','1','待发货',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ORDER_STATUS','2','已发货',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ORDER_STATUS','3','已完成',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ORDER_STATUS','4','已关闭',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ORDER_STATUS','5','无效订单',0,null);

-- 订单类型字典
INSERT INTO DICT_CONTRAST VALUES ('ORDER_TYPE','0','普通订单',0,null);
INSERT INTO DICT_CONTRAST VALUES ('ORDER_TYPE','1','秒杀订单',0,null);

-- 订单类型字典
INSERT INTO DICT_CONTRAST VALUES ('SEX','F','女',0,null);
INSERT INTO DICT_CONTRAST VALUES ('SEX','M','男',0,null);
INSERT INTO DICT_CONTRAST VALUES ('SEX','G','通用',0,null);

COMMIT;