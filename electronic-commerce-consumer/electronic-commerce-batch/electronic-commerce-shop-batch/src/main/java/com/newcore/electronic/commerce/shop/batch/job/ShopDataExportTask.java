package com.newcore.electronic.commerce.shop.batch.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 商户数据导出批作业
 * @author zhouchaowei
 */
@DisallowConcurrentExecution
@Component
public class ShopDataExportTask implements Job {

    private static final Logger logger = LoggerFactory.getLogger(ShopDataExportTask.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("商户批作业服务 || 数据导出批作业 || 开始执行......");
    }
}
