package com.nhnacademy.gateway.adaptor;

import com.nhnacademy.gateway.domain.Project;
import com.nhnacademy.gateway.dto.request.ProjectRequestDto;

public interface ProjectAdaptor {
    Project makeProject(ProjectRequestDto projectRequestDto, Long memberNum);

    Project findProjectByProjectNum(Long projectNum);
}