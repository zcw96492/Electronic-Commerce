package com.newcore.electronic.commerce.repository.batch.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 库存数据导出批作业
 * @author zhouchaowei
 */
@DisallowConcurrentExecution
@Component
public class RepositoryDataExportTask implements Job {

    private static final Logger logger = LoggerFactory.getLogger(RepositoryDataExportTask.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("库存批作业服务 || 数据导出批作业 || 开始执行......");
    }
}
