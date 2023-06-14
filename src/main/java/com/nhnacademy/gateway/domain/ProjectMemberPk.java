package com.nhnacademy.gateway.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@RequiredArgsConstructor
@Getter
public class ProjectMemberPk implements Serializable {
    private Long projectMemberNum;
    private Long projectNum;
}
