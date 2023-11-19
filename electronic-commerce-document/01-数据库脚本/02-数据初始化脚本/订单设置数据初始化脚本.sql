/*
 Navicat Premium Data Transfer

 Source Server         : tencent_mysql
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : 118.25.236.128:3306
 Source Schema         : ELECTRONIC_COMMERCE

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001
 Table Name            : 订单设置表

 Date: 19/11/2023 14:32:23
*/

BEGIN;

-- 秒杀订单超时关闭时间(分)/正常订单超时时间(分)/发货后自动确认收货时间（天）/自动完成交易时间，不能申请售后（天）/订单完成后自动好评时间（天）
INSERT INTO ELECTRONIC_COMMERCE.ORDER_SETTING VALUES (1,30,30,7,3,5,current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.ORDER_SETTING VALUES (2,25,25,7,3,5,current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.ORDER_SETTING VALUES (3,20,20,7,3,5,current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.ORDER_SETTING VALUES (4,10,10,7,3,5,current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.ORDER_SETTING VALUES (5,5,5,7,3,5,current_timestamp, current_timestamp);

COMMIT;