/**
 * packageName :  com.nhnacademy.gateway.controller
 * fileName : GatewayController
 * author :  ichunghui
 * date : 2023/06/13 
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2023/06/13                ichunghui             최초 생성
 */

package com.nhnacademy.gateway.controller;

import com.nhnacademy.gateway.dto.MemberRequestDto;
import com.nhnacademy.gateway.dto.MemberResponseDto;
import com.nhnacademy.gateway.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class GatewayController {

    private final AccountService accountService;

    @GetMapping
    public ResponseEntity<List<MemberResponseDto>> getAllMembers() {
        return ResponseEntity.ok(accountService.getAllMembers());
    }

    @PostMapping
    public ResponseEntity<String> registerMember(@RequestBody MemberRequestDto memberRequestDto, RedirectAttributes redirectAttributes) {
        return ResponseEntity.ok(accountService.registerMember(memberRequestDto));
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<MemberResponseDto> getMember(@PathVariable String memberId) {
        return ResponseEntity.ok(accountService.getMemberByMemberId(memberId));
    }

    @PutMapping("/{memberId}")
    public ResponseEntity<String> updateMember(@PathVariable String memberId, @RequestBody MemberRequestDto memberRequestDto) {
        return ResponseEntity.ok(accountService.updateMember(memberId, memberRequestDto));
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<Void> deleteMember(@PathVariable String memberId) {
        accountService.deleteMember(memberId);
        return ResponseEntity.noContent().build();
    }
}

