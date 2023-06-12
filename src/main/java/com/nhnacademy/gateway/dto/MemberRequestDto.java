/**
 * packageName :  com.nhnacademy.gateway.dto
 * fileName : MemberRequestDto
 * author :  ichunghui
 * date : 2023/06/13 
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/06/13                ichunghui             최초 생성
 */

package com.nhnacademy.gateway.dto;

import com.nhnacademy.gateway.domain.MemberGrade;
import com.nhnacademy.gateway.domain.MemberStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberRequestDto {

    @NotBlank(message = "ID를 입력하세요")
    private String memberId;

    @NotBlank(message = "Password를 입력하세요")
    private String memberPassword;

    @Email(message = "email 형식을 지켜주세요.")
    private String memberEmail;

    @NotNull(message = "멤버 등급을 선택하세요")
    private MemberGrade memberGrade;

    @NotNull(message = "멤버 상태를 선택하세요")
    private MemberStatus memberStatus;
}
