package com.example.configbean.config;

import com.example.configbean.service.FunctionService;
import com.example.configbean.service.NadaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//@Bean把 交给spring管理
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }
    @Bean
    public NadaService nadaService(){
        return new NadaService();
    }
}
