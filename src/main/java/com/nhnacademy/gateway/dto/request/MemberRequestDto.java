package com.nhnacademy.gateway.dto.request;

import lombok.Data;

@Data
public class MemberRequestDto {
    private String memberId;
    private String memberPassword;
    private String memberEmail;
}
