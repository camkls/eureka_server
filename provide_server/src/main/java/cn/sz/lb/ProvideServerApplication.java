package cn.sz.lb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProvideServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideServerApplication.class, args);
    }

}
