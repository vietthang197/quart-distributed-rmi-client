package vn.com.mbbank.quartdistributedrmiclient.config;

import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import java.io.IOException;

@Configuration
public class QuartConfig {

    @Bean
    public StdSchedulerFactory schedulerFactoryBean(ApplicationContext applicationContext) throws IOException, SchedulerException {
        StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
        stdSchedulerFactory.initialize(new ClassPathResource("quartz.properties").getInputStream());
        return stdSchedulerFactory;
    }
}
