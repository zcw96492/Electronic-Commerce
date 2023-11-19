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
 Table Name            : 批作业任务表

 Date: 20/08/2023 14:32:23
*/

INSERT INTO ELECTRONIC_COMMERCE.BATCH_TASK(`batch_task_id`,`task_name`,`task_description`,`task_cron_expression`,`bean_class_path`,`job_status`,`job_group`,`create_user`,`create_time`,`update_user`,`update_time`) VALUES (1,'CommodityDataExportTask','商品数据导出批作业','0/1 * * * * ?','com.newcore.electronic.commerce.commodity.batch.job.CommodityDataExportTask',1,'electronic-commerce-commodity-batch','周超伟',sysdate(),'周超伟',sysdate());
INSERT INTO ELECTRONIC_COMMERCE.BATCH_TASK(`batch_task_id`,`task_name`,`task_description`,`task_cron_expression`,`bean_class_path`,`job_status`,`job_group`,`create_user`,`create_time`,`update_user`,`update_time`) VALUES (2,'LogisticsDataExportTask','物流数据导出批作业','0/1 * * * * ?','com.newcore.electronic.commerce.logistics.batch.job.LogisticsDataExportTask',1,'electronic-commerce-logistics-batch','周超伟',sysdate(),'周超伟',sysdate());
INSERT INTO ELECTRONIC_COMMERCE.BATCH_TASK(`batch_task_id`,`task_name`,`task_description`,`task_cron_expression`,`bean_class_path`,`job_status`,`job_group`,`create_user`,`create_time`,`update_user`,`update_time`) VALUES (3,'MailDataExportTask','邮件数据导出批作业','0/1 * * * * ?','com.newcore.electronic.commerce.mail.batch.job.MailDataExportTask',1,'electronic-commerce-mail-batch','周超伟',sysdate(),'周超伟',sysdate());
INSERT INTO ELECTRONIC_COMMERCE.BATCH_TASK(`batch_task_id`,`task_name`,`task_description`,`task_cron_expression`,`bean_class_path`,`job_status`,`job_group`,`create_user`,`create_time`,`update_user`,`update_time`) VALUES (4,'OrderDataExportTask','订单数据导出批作业','0/1 * * * * ?','com.newcore.electronic.commerce.order.batch.job.OrderDataExportTask',1,'electronic-commerce-order-batch','周超伟',sysdate(),'周超伟',sysdate());
INSERT INTO ELECTRONIC_COMMERCE.BATCH_TASK(`batch_task_id`,`task_name`,`task_description`,`task_cron_expression`,`bean_class_path`,`job_status`,`job_group`,`create_user`,`create_time`,`update_user`,`update_time`) VALUES (5,'PaymentDataExportTask','支付数据导出批作业','0/1 * * * * ?','com.newcore.electronic.commerce.payment.batch.job.PaymentDataExportTask',1,'electronic-commerce-payment-batch','周超伟',sysdate(),'周超伟',sysdate());
INSERT INTO ELECTRONIC_COMMERCE.BATCH_TASK(`batch_task_id`,`task_name`,`task_description`,`task_cron_expression`,`bean_class_path`,`job_status`,`job_group`,`create_user`,`create_time`,`update_user`,`update_time`) VALUES (6,'RepositoryDataExportTask','库存数据导出批作业','0/1 * * * * ?','com.newcore.electronic.commerce.repository.batch.job.RepositoryDataExportTask',1,'electronic-commerce-repository-batch','周超伟',sysdate(),'周超伟',sysdate());
INSERT INTO ELECTRONIC_COMMERCE.BATCH_TASK(`batch_task_id`,`task_name`,`task_description`,`task_cron_expression`,`bean_class_path`,`job_status`,`job_group`,`create_user`,`create_time`,`update_user`,`update_time`) VALUES (7,'SearchDataExportTask','搜索数据导出批作业','0/1 * * * * ?','com.newcore.electronic.commerce.search.batch.job.SearchDataExportTask',1,'electronic-commerce-search-batch','周超伟',sysdate(),'周超伟',sysdate());
INSERT INTO ELECTRONIC_COMMERCE.BATCH_TASK(`batch_task_id`,`task_name`,`task_description`,`task_cron_expression`,`bean_class_path`,`job_status`,`job_group`,`create_user`,`create_time`,`update_user`,`update_time`) VALUES (8,'ShopDataExportTask','商户数据导出批作业','0/1 * * * * ?','com.newcore.electronic.commerce.shop.batch.job.ShopDataExportTask',1,'electronic-commerce-shop-batch','周超伟',sysdate(),'周超伟',sysdate());
INSERT INTO ELECTRONIC_COMMERCE.BATCH_TASK(`batch_task_id`,`task_name`,`task_description`,`task_cron_expression`,`bean_class_path`,`job_status`,`job_group`,`create_user`,`create_time`,`update_user`,`update_time`) VALUES (9,'UserDataExportTask','用户数据导出批作业','0/1 * * * * ?','com.newcore.electronic.commerce.user.batch.job.UserDataExportTask',1,'electronic-commerce-user-batch','周超伟',sysdate(),'周超伟',sysdate());