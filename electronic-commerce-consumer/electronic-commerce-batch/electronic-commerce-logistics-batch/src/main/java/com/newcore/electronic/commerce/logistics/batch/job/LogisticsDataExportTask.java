package com.newcore.electronic.commerce.logistics.batch.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 数据导出批作业
 * @author zhouchaowei
 */
@DisallowConcurrentExecution
@Component
public class LogisticsDataExportTask implements Job {

    private static final Logger logger = LoggerFactory.getLogger(LogisticsDataExportTask.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("物流批作业服务 || 数据导出批作业 || 开始执行......");
    }
}
