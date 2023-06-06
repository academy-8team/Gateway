/**
 * packageName :  com.nhnacademy.gateway.config
 * fileName : RestTemplateConfig
 * author :  ichunghui
 * date : 2023/06/07 
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/06/07                ichunghui             최초 생성
 */

package com.nhnacademy.gateway.config;

import com.nhnacademy.gateway.server.IdentityHeaderInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    ClientHttpRequestFactory clientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory  = new SimpleClientHttpRequestFactory();

        factory.setConnectTimeout(3000);
        factory.setReadTimeout(1000);
        factory.setBufferRequestBody(false);

        return factory;
    }
    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory clientHttpRequestFactory) {
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory);

        restTemplate.getInterceptors().add(new IdentityHeaderInterceptor());
        restTemplate.setErrorHandler(new DefaultResponseErrorHandler());

        return restTemplate;
    }
}

