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
 Table Count           : 1
 Date: 10/07/2022 09:16:23
*/

-- 1.批作业任务表
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