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
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (51,1,'通用代金优惠券',8000.00,NULL,NULL,NULL,NULL,0,'全场代金券-8000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (52,1,'通用代金优惠券',9000.00,NULL,NULL,NULL,NULL,0,'全场代金券-9000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (53,1,'通用代金优惠券',10000.00,NULL,NULL,NULL,NULL,0,'全场代金券-10000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (54,1,'通用代金优惠券',20000.00,NULL,NULL,NULL,NULL,0,'全场代金券-20000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (55,1,'通用代金优惠券',30000.00,NULL,NULL,NULL,NULL,0,'全场代金券-30000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (56,1,'通用代金优惠券',40000.00,NULL,NULL,NULL,NULL,0,'全场代金券-40000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (57,1,'通用代金优惠券',50000.00,NULL,NULL,NULL,NULL,0,'全场代金券-50000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (58,1,'通用代金优惠券',60000.00,NULL,NULL,NULL,NULL,0,'全场代金券-60000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (59,1,'通用代金优惠券',70000.00,NULL,NULL,NULL,NULL,0,'全场代金券-70000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (60,1,'通用代金优惠券',80000.00,NULL,NULL,NULL,NULL,0,'全场代金券-80000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (61,1,'通用代金优惠券',90000.00,NULL,NULL,NULL,NULL,0,'全场代金券-90000元代金券',current_timestamp, current_timestamp);



-- 全场通用折扣券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (62,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,10.00,0,'全场折扣券-1折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (63,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,20.00,0,'全场折扣券-2折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (64,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,30.00,0,'全场折扣券-3折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (65,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,40.00,0,'全场折扣券-4折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (66,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,50.00,0,'全场折扣券-5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (67,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,60.00,0,'全场折扣券-6折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (68,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,65.00,0,'全场折扣券-6.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (69,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,70.00,0,'全场折扣券-7折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (70,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,75.00,0,'全场折扣券-7.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (71,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,80.00,0,'全场折扣券-8折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (72,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,85.00,0,'全场折扣券-8.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (73,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,90.00,0,'全场折扣券-9折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (74,2,'通用折扣优惠券',NULL,NULL,NULL,NULL,95.00,0,'全场折扣券-9.5折折扣券',current_timestamp, current_timestamp);



-- 指定品类满减券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (75,3,'指定品类满减优惠券',NULL,100.00,10.00,NULL,NULL,0,'指定品类满减券-满100减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (76,3,'指定品类满减优惠券',NULL,100.00,20.00,NULL,NULL,0,'指定品类满减券-满100减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (77,3,'指定品类满减优惠券',NULL,100.00,30.00,NULL,NULL,0,'指定品类满减券-满100减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (78,3,'指定品类满减优惠券',NULL,100.00,40.00,NULL,NULL,0,'指定品类满减券-满100减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (79,3,'指定品类满减优惠券',NULL,100.00,50.00,NULL,NULL,0,'指定品类满减券-满100减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (80,3,'指定品类满减优惠券',NULL,200.00,10.00,NULL,NULL,0,'指定品类满减券-满200减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (81,3,'指定品类满减优惠券',NULL,200.00,20.00,NULL,NULL,0,'指定品类满减券-满200减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (82,3,'指定品类满减优惠券',NULL,200.00,30.00,NULL,NULL,0,'指定品类满减券-满200减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (83,3,'指定品类满减优惠券',NULL,200.00,40.00,NULL,NULL,0,'指定品类满减券-满200减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (84,3,'指定品类满减优惠券',NULL,200.00,50.00,NULL,NULL,0,'指定品类满减券-满200减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (85,3,'指定品类满减优惠券',NULL,300.00,10.00,NULL,NULL,0,'指定品类满减券-满300减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (86,3,'指定品类满减优惠券',NULL,300.00,20.00,NULL,NULL,0,'指定品类满减券-满300减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (87,3,'指定品类满减优惠券',NULL,300.00,30.00,NULL,NULL,0,'指定品类满减券-满300减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (88,3,'指定品类满减优惠券',NULL,300.00,40.00,NULL,NULL,0,'指定品类满减券-满300减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (89,3,'指定品类满减优惠券',NULL,300.00,50.00,NULL,NULL,0,'指定品类满减券-满300减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (90,3,'指定品类满减优惠券',NULL,400.00,10.00,NULL,NULL,0,'指定品类满减券-满400减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (91,3,'指定品类满减优惠券',NULL,400.00,20.00,NULL,NULL,0,'指定品类满减券-满400减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (92,3,'指定品类满减优惠券',NULL,400.00,30.00,NULL,NULL,0,'指定品类满减券-满400减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (93,3,'指定品类满减优惠券',NULL,400.00,40.00,NULL,NULL,0,'指定品类满减券-满400减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (94,3,'指定品类满减优惠券',NULL,400.00,50.00,NULL,NULL,0,'指定品类满减券-满400减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (95,3,'指定品类满减优惠券',NULL,500.00,10.00,NULL,NULL,0,'指定品类满减券-满500减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (96,3,'指定品类满减优惠券',NULL,500.00,20.00,NULL,NULL,0,'指定品类满减券-满500减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (97,3,'指定品类满减优惠券',NULL,500.00,30.00,NULL,NULL,0,'指定品类满减券-满500减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (98,3,'指定品类满减优惠券',NULL,500.00,40.00,NULL,NULL,0,'指定品类满减券-满500减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (99,3,'指定品类满减优惠券',NULL,500.00,50.00,NULL,NULL,0,'指定品类满减券-满500减50优惠券',current_timestamp, current_timestamp);



-- 指定品类代金券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (100,4,'指定品类代金优惠券',10.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-10元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (101,4,'指定品类代金优惠券',20.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-20元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (102,4,'指定品类代金优惠券',30.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-30元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (103,4,'指定品类代金优惠券',40.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-40元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (104,4,'指定品类代金优惠券',50.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-50元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (105,4,'指定品类代金优惠券',60.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-60元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (106,4,'指定品类代金优惠券',70.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-70元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (107,4,'指定品类代金优惠券',80.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-80元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (108,4,'指定品类代金优惠券',90.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-90元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (109,4,'指定品类代金优惠券',100.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-100元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (110,4,'指定品类代金优惠券',200.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-200元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (111,4,'指定品类代金优惠券',300.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-300元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (112,4,'指定品类代金优惠券',400.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-400元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (113,4,'指定品类代金优惠券',500.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-500元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (114,4,'指定品类代金优惠券',600.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-600元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (115,4,'指定品类代金优惠券',700.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-700元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (116,4,'指定品类代金优惠券',800.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-800元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (117,4,'指定品类代金优惠券',900.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-900元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (118,4,'指定品类代金优惠券',1000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-1000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (119,4,'指定品类代金优惠券',2000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-2000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (120,4,'指定品类代金优惠券',3000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-3000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (121,4,'指定品类代金优惠券',4000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-4000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (122,4,'指定品类代金优惠券',5000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-5000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (123,4,'指定品类代金优惠券',6000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-6000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (124,4,'指定品类代金优惠券',7000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-7000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (125,4,'指定品类代金优惠券',8000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-8000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (126,4,'指定品类代金优惠券',9000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-9000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (127,4,'指定品类代金优惠券',10000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-10000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (128,4,'指定品类代金优惠券',20000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-20000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (129,4,'指定品类代金优惠券',30000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-30000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (130,4,'指定品类代金优惠券',40000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-40000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (131,4,'指定品类代金优惠券',50000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-50000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (132,4,'指定品类代金优惠券',60000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-60000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (133,4,'指定品类代金优惠券',70000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-70000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (134,4,'指定品类代金优惠券',80000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-80000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (135,4,'指定品类代金优惠券',90000.00,NULL,NULL,NULL,NULL,0,'指定品类代金券-90000元代金券',current_timestamp, current_timestamp);



-- 指定品类折扣券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (136,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,10.00,0,'指定品类折扣券-1折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (137,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,20.00,0,'指定品类折扣券-2折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (138,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,30.00,0,'指定品类折扣券-3折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (139,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,40.00,0,'指定品类折扣券-4折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (140,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,50.00,0,'指定品类折扣券-5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (141,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,60.00,0,'指定品类折扣券-6折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (142,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,65.00,0,'指定品类折扣券-6.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (143,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,70.00,0,'指定品类折扣券-7折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (144,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,75.00,0,'指定品类折扣券-7.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (145,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,80.00,0,'指定品类折扣券-8折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (146,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,85.00,0,'指定品类折扣券-8.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (147,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,90.00,0,'指定品类折扣券-9折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (148,5,'指定品类折扣优惠券',NULL,NULL,NULL,NULL,95.00,0,'指定品类折扣券-9.5折折扣券',current_timestamp, current_timestamp);



-- 会员满减券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (149,6,'会员满减优惠券',NULL,100.00,10.00,NULL,NULL,0,'会员满减券-满100减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (150,6,'会员满减优惠券',NULL,100.00,20.00,NULL,NULL,0,'会员满减券-满100减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (151,6,'会员满减优惠券',NULL,100.00,30.00,NULL,NULL,0,'会员满减券-满100减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (152,6,'会员满减优惠券',NULL,100.00,40.00,NULL,NULL,0,'会员满减券-满100减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (153,6,'会员满减优惠券',NULL,100.00,50.00,NULL,NULL,0,'会员满减券-满100减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (154,6,'会员满减优惠券',NULL,200.00,10.00,NULL,NULL,0,'会员满减券-满200减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (155,6,'会员满减优惠券',NULL,200.00,20.00,NULL,NULL,0,'会员满减券-满200减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (156,6,'会员满减优惠券',NULL,200.00,30.00,NULL,NULL,0,'会员满减券-满200减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (157,6,'会员满减优惠券',NULL,200.00,40.00,NULL,NULL,0,'会员满减券-满200减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (158,6,'会员满减优惠券',NULL,200.00,50.00,NULL,NULL,0,'会员满减券-满200减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (159,6,'会员满减优惠券',NULL,300.00,10.00,NULL,NULL,0,'会员满减券-满300减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (160,6,'会员满减优惠券',NULL,300.00,20.00,NULL,NULL,0,'会员满减券-满300减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (161,6,'会员满减优惠券',NULL,300.00,30.00,NULL,NULL,0,'会员满减券-满300减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (162,6,'会员满减优惠券',NULL,300.00,40.00,NULL,NULL,0,'会员满减券-满300减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (163,6,'会员满减优惠券',NULL,300.00,50.00,NULL,NULL,0,'会员满减券-满300减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (164,6,'会员满减优惠券',NULL,400.00,10.00,NULL,NULL,0,'会员满减券-满400减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (165,6,'会员满减优惠券',NULL,400.00,20.00,NULL,NULL,0,'会员满减券-满400减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (166,6,'会员满减优惠券',NULL,400.00,30.00,NULL,NULL,0,'会员满减券-满400减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (167,6,'会员满减优惠券',NULL,400.00,40.00,NULL,NULL,0,'会员满减券-满400减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (168,6,'会员满减优惠券',NULL,400.00,50.00,NULL,NULL,0,'会员满减券-满400减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (169,6,'会员满减优惠券',NULL,500.00,10.00,NULL,NULL,0,'会员满减券-满500减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (170,6,'会员满减优惠券',NULL,500.00,20.00,NULL,NULL,0,'会员满减券-满500减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (171,6,'会员满减优惠券',NULL,500.00,30.00,NULL,NULL,0,'会员满减券-满500减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (172,6,'会员满减优惠券',NULL,500.00,40.00,NULL,NULL,0,'会员满减券-满500减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (173,6,'会员满减优惠券',NULL,500.00,50.00,NULL,NULL,0,'会员满减券-满500减50优惠券',current_timestamp, current_timestamp);



-- 会员代金券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (174,7,'会员代金优惠券',10.00,NULL,NULL,NULL,NULL,0,'会员代金券-10元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (175,7,'会员代金优惠券',20.00,NULL,NULL,NULL,NULL,0,'会员代金券-20元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (176,7,'会员代金优惠券',30.00,NULL,NULL,NULL,NULL,0,'会员代金券-30元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (177,7,'会员代金优惠券',40.00,NULL,NULL,NULL,NULL,0,'会员代金券-40元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (178,7,'会员代金优惠券',50.00,NULL,NULL,NULL,NULL,0,'会员代金券-50元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (179,7,'会员代金优惠券',60.00,NULL,NULL,NULL,NULL,0,'会员代金券-60元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (180,7,'会员代金优惠券',70.00,NULL,NULL,NULL,NULL,0,'会员代金券-70元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (181,7,'会员代金优惠券',80.00,NULL,NULL,NULL,NULL,0,'会员代金券-80元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (182,7,'会员代金优惠券',90.00,NULL,NULL,NULL,NULL,0,'会员代金券-90元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (183,7,'会员代金优惠券',100.00,NULL,NULL,NULL,NULL,0,'会员代金券-100元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (184,7,'会员代金优惠券',200.00,NULL,NULL,NULL,NULL,0,'会员代金券-200元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (185,7,'会员代金优惠券',300.00,NULL,NULL,NULL,NULL,0,'会员代金券-300元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (186,7,'会员代金优惠券',400.00,NULL,NULL,NULL,NULL,0,'会员代金券-400元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (187,7,'会员代金优惠券',500.00,NULL,NULL,NULL,NULL,0,'会员代金券-500元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (188,7,'会员代金优惠券',600.00,NULL,NULL,NULL,NULL,0,'会员代金券-600元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (189,7,'会员代金优惠券',700.00,NULL,NULL,NULL,NULL,0,'会员代金券-700元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (190,7,'会员代金优惠券',800.00,NULL,NULL,NULL,NULL,0,'会员代金券-800元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (191,7,'会员代金优惠券',900.00,NULL,NULL,NULL,NULL,0,'会员代金券-900元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (192,7,'会员代金优惠券',1000.00,NULL,NULL,NULL,NULL,0,'会员代金券-1000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (193,7,'会员代金优惠券',2000.00,NULL,NULL,NULL,NULL,0,'会员代金券-2000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (194,7,'会员代金优惠券',3000.00,NULL,NULL,NULL,NULL,0,'会员代金券-3000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (195,7,'会员代金优惠券',4000.00,NULL,NULL,NULL,NULL,0,'会员代金券-4000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (196,7,'会员代金优惠券',5000.00,NULL,NULL,NULL,NULL,0,'会员代金券-5000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (197,7,'会员代金优惠券',6000.00,NULL,NULL,NULL,NULL,0,'会员代金券-6000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (198,7,'会员代金优惠券',7000.00,NULL,NULL,NULL,NULL,0,'会员代金券-7000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (199,7,'会员代金优惠券',8000.00,NULL,NULL,NULL,NULL,0,'会员代金券-8000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (200,7,'会员代金优惠券',9000.00,NULL,NULL,NULL,NULL,0,'会员代金券-9000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (201,7,'会员代金优惠券',10000.00,NULL,NULL,NULL,NULL,0,'会员代金券-10000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (202,7,'会员代金优惠券',20000.00,NULL,NULL,NULL,NULL,0,'会员代金券-20000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (203,7,'会员代金优惠券',30000.00,NULL,NULL,NULL,NULL,0,'会员代金券-30000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (204,7,'会员代金优惠券',40000.00,NULL,NULL,NULL,NULL,0,'会员代金券-40000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (205,7,'会员代金优惠券',50000.00,NULL,NULL,NULL,NULL,0,'会员代金券-50000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (206,7,'会员代金优惠券',60000.00,NULL,NULL,NULL,NULL,0,'会员代金券-60000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (207,7,'会员代金优惠券',70000.00,NULL,NULL,NULL,NULL,0,'会员代金券-70000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (208,7,'会员代金优惠券',80000.00,NULL,NULL,NULL,NULL,0,'会员代金券-80000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (209,7,'会员代金优惠券',90000.00,NULL,NULL,NULL,NULL,0,'会员代金券-90000元代金券',current_timestamp, current_timestamp);



-- 会员折扣券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (210,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,10.00,0,'会员折扣券-1折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (211,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,20.00,0,'会员折扣券-2折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (212,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,30.00,0,'会员折扣券-3折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (213,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,40.00,0,'会员折扣券-4折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (214,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,50.00,0,'会员折扣券-5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (215,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,60.00,0,'会员折扣券-6折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (216,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,65.00,0,'会员折扣券-6.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (217,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,70.00,0,'会员折扣券-7折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (218,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,75.00,0,'会员折扣券-7.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (219,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,80.00,0,'会员折扣券-8折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (220,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,85.00,0,'会员折扣券-8.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (221,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,90.00,0,'会员折扣券-9折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (222,8,'会员折扣优惠券',NULL,NULL,NULL,NULL,95.00,0,'会员折扣券-9.5折折扣券',current_timestamp, current_timestamp);



-- 新人首单满减券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (223,9,'新人首单满减优惠券',NULL,100.00,10.00,NULL,NULL,0,'新人首单满减券-满100减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (224,9,'新人首单满减优惠券',NULL,100.00,20.00,NULL,NULL,0,'新人首单满减券-满100减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (225,9,'新人首单满减优惠券',NULL,100.00,30.00,NULL,NULL,0,'新人首单满减券-满100减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (226,9,'新人首单满减优惠券',NULL,100.00,40.00,NULL,NULL,0,'新人首单满减券-满100减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (227,9,'新人首单满减优惠券',NULL,100.00,50.00,NULL,NULL,0,'新人首单满减券-满100减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (228,9,'新人首单满减优惠券',NULL,200.00,10.00,NULL,NULL,0,'新人首单满减券-满200减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (229,9,'新人首单满减优惠券',NULL,200.00,20.00,NULL,NULL,0,'新人首单满减券-满200减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (230,9,'新人首单满减优惠券',NULL,200.00,30.00,NULL,NULL,0,'新人首单满减券-满200减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (231,9,'新人首单满减优惠券',NULL,200.00,40.00,NULL,NULL,0,'新人首单满减券-满200减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (232,9,'新人首单满减优惠券',NULL,200.00,50.00,NULL,NULL,0,'新人首单满减券-满200减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (233,9,'新人首单满减优惠券',NULL,300.00,10.00,NULL,NULL,0,'新人首单满减券-满300减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (234,9,'新人首单满减优惠券',NULL,300.00,20.00,NULL,NULL,0,'新人首单满减券-满300减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (235,9,'新人首单满减优惠券',NULL,300.00,30.00,NULL,NULL,0,'新人首单满减券-满300减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (236,9,'新人首单满减优惠券',NULL,300.00,40.00,NULL,NULL,0,'新人首单满减券-满300减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (237,9,'新人首单满减优惠券',NULL,300.00,50.00,NULL,NULL,0,'新人首单满减券-满300减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (238,9,'新人首单满减优惠券',NULL,400.00,10.00,NULL,NULL,0,'新人首单满减券-满400减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (239,9,'新人首单满减优惠券',NULL,400.00,20.00,NULL,NULL,0,'新人首单满减券-满400减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (240,9,'新人首单满减优惠券',NULL,400.00,30.00,NULL,NULL,0,'新人首单满减券-满400减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (241,9,'新人首单满减优惠券',NULL,400.00,40.00,NULL,NULL,0,'新人首单满减券-满400减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (242,9,'新人首单满减优惠券',NULL,400.00,50.00,NULL,NULL,0,'新人首单满减券-满400减50优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (243,9,'新人首单满减优惠券',NULL,500.00,10.00,NULL,NULL,0,'新人首单满减券-满500减10优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (244,9,'新人首单满减优惠券',NULL,500.00,20.00,NULL,NULL,0,'新人首单满减券-满500减20优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (245,9,'新人首单满减优惠券',NULL,500.00,30.00,NULL,NULL,0,'新人首单满减券-满500减30优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (246,9,'新人首单满减优惠券',NULL,500.00,40.00,NULL,NULL,0,'新人首单满减券-满500减40优惠券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (247,9,'新人首单满减优惠券',NULL,500.00,50.00,NULL,NULL,0,'新人首单满减券-满500减50优惠券',current_timestamp, current_timestamp);



-- 新人首单代金券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (248,10,'新人首单代金优惠券',10.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-10元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (249,10,'新人首单代金优惠券',20.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-20元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (250,10,'新人首单代金优惠券',30.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-30元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (251,10,'新人首单代金优惠券',40.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-40元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (252,10,'新人首单代金优惠券',50.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-50元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (253,10,'新人首单代金优惠券',60.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-60元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (254,10,'新人首单代金优惠券',70.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-70元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (255,10,'新人首单代金优惠券',80.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-80元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (256,10,'新人首单代金优惠券',90.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-90元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (257,10,'新人首单代金优惠券',100.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-100元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (258,10,'新人首单代金优惠券',200.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-200元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (259,10,'新人首单代金优惠券',300.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-300元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (260,10,'新人首单代金优惠券',400.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-400元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (261,10,'新人首单代金优惠券',500.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-500元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (262,10,'新人首单代金优惠券',600.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-600元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (263,10,'新人首单代金优惠券',700.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-700元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (264,10,'新人首单代金优惠券',800.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-800元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (265,10,'新人首单代金优惠券',900.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-900元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (266,10,'新人首单代金优惠券',1000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-1000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (267,10,'新人首单代金优惠券',2000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-2000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (268,10,'新人首单代金优惠券',3000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-3000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (269,10,'新人首单代金优惠券',4000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-4000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (270,10,'新人首单代金优惠券',5000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-5000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (271,10,'新人首单代金优惠券',6000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-6000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (272,10,'新人首单代金优惠券',7000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-7000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (273,10,'新人首单代金优惠券',8000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-8000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (274,10,'新人首单代金优惠券',9000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-9000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (275,10,'新人首单代金优惠券',10000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-10000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (276,10,'新人首单代金优惠券',20000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-20000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (277,10,'新人首单代金优惠券',30000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-30000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (278,10,'新人首单代金优惠券',40000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-40000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (279,10,'新人首单代金优惠券',50000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-50000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (280,10,'新人首单代金优惠券',60000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-60000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (281,10,'新人首单代金优惠券',70000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-70000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (282,10,'新人首单代金优惠券',80000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-80000元代金券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (283,10,'新人首单代金优惠券',90000.00,NULL,NULL,NULL,NULL,0,'新人首单代金券-90000元代金券',current_timestamp, current_timestamp);



-- 新人首单折扣券
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (284,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,10.00,0,'新人首单折扣券-1折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (285,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,20.00,0,'新人首单折扣券-2折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (286,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,30.00,0,'新人首单折扣券-3折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (287,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,40.00,0,'新人首单折扣券-4折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (288,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,50.00,0,'新人首单折扣券-5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (289,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,60.00,0,'新人首单折扣券-6折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (290,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,65.00,0,'新人首单折扣券-6.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (291,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,70.00,0,'新人首单折扣券-7折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (292,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,75.00,0,'新人首单折扣券-7.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (293,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,80.00,0,'新人首单折扣券-8折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (294,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,85.00,0,'新人首单折扣券-8.5折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (295,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,90.00,0,'新人首单折扣券-9折折扣券',current_timestamp, current_timestamp);
INSERT INTO ELECTRONIC_COMMERCE.COUPON_TYPE VALUES (296,11,'新人首单折扣优惠券',NULL,NULL,NULL,NULL,95.00,0,'新人首单折扣券-9.5折折扣券',current_timestamp, current_timestamp);

COMMIT;