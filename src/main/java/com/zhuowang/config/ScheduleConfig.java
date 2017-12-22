package com.zhuowang.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务配置类
 * @author Administrator
 *
 */
@Configuration
@EnableScheduling   //启用定时任务
public class ScheduleConfig {

	private static final Logger logger = LoggerFactory.getLogger(ScheduleConfig.class);
	
	@Scheduled(cron="0 1 * * * ?")
	public void scheduler(){
		logger.info("ScheduleConfig##scheduler--------------"+System.currentTimeMillis());
	}
}
