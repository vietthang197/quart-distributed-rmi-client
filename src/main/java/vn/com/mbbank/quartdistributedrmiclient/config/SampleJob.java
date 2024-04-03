package vn.com.mbbank.quartdistributedrmiclient.config;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SampleJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("ĐỊT CỤ MÀY");
    }
}