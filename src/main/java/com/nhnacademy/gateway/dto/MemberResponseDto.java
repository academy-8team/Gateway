/**
 * packageName :  com.nhnacademy.gateway.dto
 * fileName : MemberResponseDto
 * author :  ichunghui
 * date : 2023/06/13 
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/06/13                ichunghui             최초 생성
 */

package com.nhnacademy.gateway.dto;

import lombok.*;

@Builder
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class MemberResponseDto {
    private Long memberNum;
    private String memberId;
    private String memberPassword;
    private String memberEmail;
}
