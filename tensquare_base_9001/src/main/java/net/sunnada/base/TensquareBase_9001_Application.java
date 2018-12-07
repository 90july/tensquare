package net.sunnada.base;

import net.sunnada.pojo.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("net.sunnada.base.mapper")
public class TensquareBase_9001_Application {
    public static void main(String[] args) {
        SpringApplication.run(TensquareBase_9001_Application.class,args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
