package com.ykmimi.rabbitmqtopic;

import com.ykmimi.rabbitmqtopic.customer.TestCustomerOption;
import com.ykmimi.rabbitmqtopic.producer.TestProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class RabbitmqTopicApplication {

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        TestCustomerOption.startCustomerOption("consumer-news","*.news");
        TestCustomerOption.startCustomerOption("consumer-weather","*.weather");
        TestCustomerOption.startCustomerOption("consumer-usa","usa.*");
        TestCustomerOption.startCustomerOption("consumer-europe","europe.*");
        Thread.sleep(3000);
        TestProducer.startProducer();
//        SpringApplication.run(RabbitmqTopicApplication.class, args);
    }

}
