package vn.com.mbbank.quartdistributedrmiclient.controller;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.com.mbbank.quartdistributedrmiclient.config.SampleJob;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private StdSchedulerFactory stdSchedulerFactory;

    @GetMapping
    public String test() throws SchedulerException {

        Scheduler scheduler = stdSchedulerFactory.getScheduler();
        JobDetail jobDetail = JobBuilder.newJob().ofType(SampleJob.class)
                .storeDurably()
                .withIdentity("Qrtz_Job_Detail")
                .usingJobData("OK", 1)
                .withDescription("Invoke Sample Job service...")
                .build();

        scheduler.addJob(jobDetail, true);



        return "OK";
    }

    @GetMapping("fuck")
    public String trigger() throws SchedulerException {
        Scheduler scheduler = stdSchedulerFactory.getScheduler();
        scheduler.triggerJob(JobKey.jobKey("Qrtz_Job_Detail") );
        return "OK";
    }
}
