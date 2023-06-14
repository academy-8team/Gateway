package com.nhnacademy.gateway.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class ProjectRequestDto {
    @NotBlank
    private String projectName;

    private String projectDescription;
}
