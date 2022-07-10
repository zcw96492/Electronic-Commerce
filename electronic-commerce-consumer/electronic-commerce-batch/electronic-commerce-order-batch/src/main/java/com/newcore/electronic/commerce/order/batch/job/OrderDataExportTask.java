package com.newcore.electronic.commerce.order.batch.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 订单数据导出批作业
 * @author zhouchaowei
 */
@DisallowConcurrentExecution
@Component
public class OrderDataExportTask implements Job {

    private static final Logger logger = LoggerFactory.getLogger(OrderDataExportTask.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("订单批作业服务 || 数据导出批作业 || 开始执行......");
    }
}
