/**
 * packageName :  com.nhnacademy.gateway.server
 * fileName : IdentityHeaderInterceptor
 * author :  ichunghui
 * date : 2023/06/07
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/06/07                ichunghui             최초 생성
 */

package com.nhnacademy.gateway.server;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

public class IdentityHeaderInterceptor implements ClientHttpRequestInterceptor {
    private static final String COMPONENT_HEADER_NAME = "X-COMPONENT-ID";
    private static final String COMPONENT_HEADER_VALUE = "ACCOUNT_API";

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().addIfAbsent(COMPONENT_HEADER_NAME, COMPONENT_HEADER_VALUE);
        return execution.execute(request, body);
    }
}

