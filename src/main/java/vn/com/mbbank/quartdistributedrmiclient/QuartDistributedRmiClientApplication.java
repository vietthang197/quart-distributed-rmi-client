package vn.com.mbbank.quartdistributedrmiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;

@SpringBootApplication(exclude = {QuartzAutoConfiguration.class})
public class QuartDistributedRmiClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuartDistributedRmiClientApplication.class, args);
    }

}
