/**
 * packageName :  com.nhnacademy.gateway.config
 * fileName : RestTemplateConfig
 * author :  ichunghui
 * date : 2023/06/13 
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/06/13                ichunghui             최초 생성
 */

package com.nhnacademy.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

