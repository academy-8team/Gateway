package com.nhnacademy.gateway.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@RequiredArgsConstructor
@Getter
public class TaskTagPk implements Serializable {
    private Long tagNum;
    private Long taskNum;
}
