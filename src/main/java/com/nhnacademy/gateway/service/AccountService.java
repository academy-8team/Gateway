/**
 * packageName :  com.nhnacademy.gateway.service
 * fileName : AccountService
 * author :  ichunghui
 * date : 2023/06/13 
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/06/13                ichunghui             최초 생성
 */

package com.nhnacademy.gateway.service;

import com.nhnacademy.gateway.dto.MemberRequestDto;
import com.nhnacademy.gateway.dto.MemberResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final RestTemplate restTemplate;

    @Value("${account.api.url}")
    private String accountApiUrl;

    public List<MemberResponseDto> getAllMembers() {
        ResponseEntity<List<MemberResponseDto>> response = restTemplate.exchange(
                accountApiUrl + "/members",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<MemberResponseDto>>() {}
        );
        return response.getBody();
    }

    public String registerMember(MemberRequestDto memberRequestDto) {
        HttpEntity<MemberRequestDto> requestEntity = new HttpEntity<>(memberRequestDto);
        ResponseEntity<String> response = restTemplate.exchange(
                accountApiUrl + "/members",
                HttpMethod.POST,
                requestEntity,
                String.class
        );
        return response.getBody();
    }

    public MemberResponseDto getMemberByMemberId(String memberId) {
        return restTemplate.getForObject(accountApiUrl + "/members/" + memberId, MemberResponseDto.class);
    }

    public String updateMember(String memberId, MemberRequestDto memberRequestDto) {
        HttpEntity<MemberRequestDto> requestEntity = new HttpEntity<>(memberRequestDto);
        ResponseEntity<String> response = restTemplate.exchange(
                accountApiUrl + "/members/" + memberId,
                HttpMethod.PUT,
                requestEntity,
                String.class
        );
        return response.getBody();
    }

    public void deleteMember(String memberId) {
        restTemplate.delete(accountApiUrl + "/members/" + memberId);
    }
}
