package com.sun.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication /* BEAN 자동설정  */
public class Application {

    public static void main(String[] args){
        /* 내장 was 실행 */
        SpringApplication.run(Application.class, args);
    }
}
