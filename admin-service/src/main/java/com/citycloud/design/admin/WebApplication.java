package com.citycloud.design.admin;

import com.citycloud.ccuap.web.api.annotation.ApiController;
import com.citycloud.ccuap.web.api.annotation.QueryMapping;
import com.citycloud.ccuap.web.api.response.ApiResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.util.Random;

@SpringBootApplication(scanBasePackages = {"com.citycloud"},
        exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }


    @ApiController(path = "/test")
    public class Test {
        @QueryMapping("/test")
        public ApiResponse<String> getAa() {
            return ApiResponse.successWithData("hello " + new Random().nextInt(100));
        }
    }

}
