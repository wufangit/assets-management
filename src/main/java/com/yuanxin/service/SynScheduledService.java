/*
 * Copyright (c) 2012-2014, EpicSaaS Yuan Xin technology Co., Ltd.
 * 
 * All rights reserved.
 */
package com.yuanxin.service;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@EnableScheduling
@Component
public class SynScheduledService  {



    //@Scheduled(cron="0 10 15 * * ?")   //每天晚上23分同步  
    @Scheduled(cron = "0/2 * * * * ?") //每5秒执行一次
//    @Scheduled(cron = "0 10 1 * * ?")
    //每天晚上23点分同步分 
    public void synHrSysData() {
        System.out.println("执行定时任务------------------------");
    }


}
