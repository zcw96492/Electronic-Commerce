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
 Table Name            : 优惠券种类表

 Date: 19/11/2023 13:39:23
*/

BEGIN;

-- 全场通用满减券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (1,0,'通用满减优惠券',NULL,100.00,10.00,NULL,NULL,0,'全场满减券-满100减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (2,0,'通用满减优惠券',NULL,100.00,20.00,NULL,NULL,0,'全场满减券-满100减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (3,0,'通用满减优惠券',NULL,100.00,30.00,NULL,NULL,0,'全场满减券-满100减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (4,0,'通用满减优惠券',NULL,100.00,40.00,NULL,NULL,0,'全场满减券-满100减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (5,0,'通用满减优惠券',NULL,100.00,50.00,NULL,NULL,0,'全场满减券-满100减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (6,0,'通用满减优惠券',NULL,200.00,10.00,NULL,NULL,0,'全场满减券-满200减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (7,0,'通用满减优惠券',NULL,200.00,20.00,NULL,NULL,0,'全场满减券-满200减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (8,0,'通用满减优惠券',NULL,200.00,30.00,NULL,NULL,0,'全场满减券-满200减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (9,0,'通用满减优惠券',NULL,200.00,40.00,NULL,NULL,0,'全场满减券-满200减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (10,0,'通用满减优惠券',NULL,200.00,50.00,NULL,NULL,0,'全场满减券-满200减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (11,0,'通用满减优惠券',NULL,300.00,10.00,NULL,NULL,0,'全场满减券-满300减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (12,0,'通用满减优惠券',NULL,300.00,20.00,NULL,NULL,0,'全场满减券-满300减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (13,0,'通用满减优惠券',NULL,300.00,30.00,NULL,NULL,0,'全场满减券-满300减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (14,0,'通用满减优惠券',NULL,300.00,40.00,NULL,NULL,0,'全场满减券-满300减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (15,0,'通用满减优惠券',NULL,300.00,50.00,NULL,NULL,0,'全场满减券-满300减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (16,0,'通用满减优惠券',NULL,400.00,10.00,NULL,NULL,0,'全场满减券-满400减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (17,0,'通用满减优惠券',NULL,400.00,20.00,NULL,NULL,0,'全场满减券-满400减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (18,0,'通用满减优惠券',NULL,400.00,30.00,NULL,NULL,0,'全场满减券-满400减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (19,0,'通用满减优惠券',NULL,400.00,40.00,NULL,NULL,0,'全场满减券-满400减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (20,0,'通用满减优惠券',NULL,400.00,50.00,NULL,NULL,0,'全场满减券-满400减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (21,0,'通用满减优惠券',NULL,500.00,10.00,NULL,NULL,0,'全场满减券-满500减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (22,0,'通用满减优惠券',NULL,500.00,20.00,NULL,NULL,0,'全场满减券-满500减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (23,0,'通用满减优惠券',NULL,500.00,30.00,NULL,NULL,0,'全场满减券-满500减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (24,0,'通用满减优惠券',NULL,500.00,40.00,NULL,NULL,0,'全场满减券-满500减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (25,0,'通用满减优惠券',NULL,500.00,50.00,NULL,NULL,0,'全场满减券-满500减50优惠券',current_timestamp, current_timestamp);



-- 全场通用代金券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (26,1,'通用代金优惠券',10.00,NULL,NULL,NULL,NULL,0,'全场代金券-10元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (27,1,'通用代金优惠券',20.00,NULL,NULL,NULL,NULL,0,'全场代金券-20元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (28,1,'通用代金优惠券',30.00,NULL,NULL,NULL,NULL,0,'全场代金券-30元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (29,1,'通用代金优惠券',40.00,NULL,NULL,NULL,NULL,0,'全场代金券-40元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (30,1,'通用代金优惠券',50.00,NULL,NULL,NULL,NULL,0,'全场代金券-50元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (31,1,'通用代金优惠券',60.00,NULL,NULL,NULL,NULL,0,'全场代金券-60元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (32,1,'通用代金优惠券',70.00,NULL,NULL,NULL,NULL,0,'全场代金券-70元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (33,1,'通用代金优惠券',80.00,NULL,NULL,NULL,NULL,0,'全场代金券-80元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (34,1,'通用代金优惠券',90.00,NULL,NULL,NULL,NULL,0,'全场代金券-90元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (35,1,'通用代金优惠券',100.00,NULL,NULL,NULL,NULL,0,'全场代金券-100元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (36,1,'通用代金优惠券',200.00,NULL,NULL,NULL,NULL,0,'全场代金券-200元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (37,1,'通用代金优惠券',300.00,NULL,NULL,NULL,NULL,0,'全场代金券-300元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (38,1,'通用代金优惠券',400.00,NULL,NULL,NULL,NULL,0,'全场代金券-400元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (39,1,'通用代金优惠券',500.00,NULL,NULL,NULL,NULL,0,'全场代金券-500元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (40,1,'通用代金优惠券',600.00,NULL,NULL,NULL,NULL,0,'全场代金券-600元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (41,1,'通用代金优惠券',700.00,NULL,NULL,NULL,NULL,0,'全场代金券-700元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (42,1,'通用代金优惠券',800.00,NULL,NULL,NULL,NULL,0,'全场代金券-800元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (43,1,'通用代金优惠券',900.00,NULL,NULL,NULL,NULL,0,'全场代金券-900元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (44,1,'通用代金优惠券',1000.00,NULL,NULL,NULL,NULL,0,'全场代金券-1000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (45,1,'通用代金优惠券',2000.00,NULL,NULL,NULL,NULL,0,'全场代金券-2000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (46,1,'通用代金优惠券',3000.00,NULL,NULL,NULL,NULL,0,'全场代金券-3000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (47,1,'通用代金优惠券',4000.00,NULL,NULL,NULL,NULL,0,'全场代金券-4000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (48,1,'通用代金优惠券',5000.00,NULL,NULL,NULL,NULL,0,'全场代金券-5000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (49,1,'通用代金优惠券',6000.00,NULL,NULL,NULL,NULL,0,'全场代金券-6000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',7000.00,NULL,NULL,NULL,NULL,0,'全场代金券-7000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',8000.00,NULL,NULL,NULL,NULL,0,'全场代金券-8000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',9000.00,NULL,NULL,NULL,NULL,0,'全场代金券-9000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',10000.00,NULL,NULL,NULL,NULL,0,'全场代金券-10000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',20000.00,NULL,NULL,NULL,NULL,0,'全场代金券-20000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',30000.00,NULL,NULL,NULL,NULL,0,'全场代金券-30000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',40000.00,NULL,NULL,NULL,NULL,0,'全场代金券-40000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',50000.00,NULL,NULL,NULL,NULL,0,'全场代金券-50000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',60000.00,NULL,NULL,NULL,NULL,0,'全场代金券-60000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',70000.00,NULL,NULL,NULL,NULL,0,'全场代金券-70000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',80000.00,NULL,NULL,NULL,NULL,0,'全场代金券-80000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',90000.00,NULL,NULL,NULL,NULL,0,'全场代金券-90000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (50,1,'通用代金优惠券',100000.00,NULL,NULL,NULL,NULL,0,'全场代金券-100000元代金券',current_timestamp, current_timestamp);

COMMIT;