package com.yuanxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EntityScan(basePackages = "com.yuanxin.pojo")
@SpringBootApplication
public class AssetsManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssetsManagementApplication.class, args);
    }

}
