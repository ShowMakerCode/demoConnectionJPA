package com.example.democonnectmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoConnectMysqlApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext= SpringApplication.run(DemoConnectMysqlApplication.class, args);
//        configurableApplicationContext.getBean()
        Person person = new Person();
    }

}
