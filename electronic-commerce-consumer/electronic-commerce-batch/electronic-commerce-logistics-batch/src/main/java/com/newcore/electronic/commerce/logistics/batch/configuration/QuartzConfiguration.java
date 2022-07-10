package com.newcore.electronic.commerce.logistics.batch.configuration;

import com.newcore.electronic.commerce.utils.enumclass.BusinessExceptionCodeEnum;
import com.newcore.electronic.commerce.utils.exception.BusinessException;
import org.quartz.Scheduler;
import org.quartz.spi.JobFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * 定时器配置类
 * @author zhouchaowei
 */
@Configuration
public class QuartzConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(QuartzConfiguration.class);

    @Autowired
    private JobFactory jobFactory;

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        try {
            schedulerFactoryBean.setOverwriteExistingJobs(true);
            schedulerFactoryBean.setJobFactory(jobFactory);
            return schedulerFactoryBean;
        } catch (Exception e) {
            logger.info("");
            throw new BusinessException(BusinessExceptionCodeEnum.FAIL.getCode(),BusinessExceptionCodeEnum.FAIL.getMessage());
        }
    }

    /**
     * 创建schedule
     * @return
     */
    @Bean(name = "scheduler")
    public Scheduler scheduler() {
        return schedulerFactoryBean().getScheduler();
    }
}
