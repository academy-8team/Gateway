package com.nhnacademy.gateway.service;

import com.nhnacademy.gateway.domain.Project;
import com.nhnacademy.gateway.dto.request.ProjectRequestDto;

public interface ProjectService {

    Project createProject(ProjectRequestDto projectRequestDto,
                          Long memberNum);

    Project findProject(Long projectNum);
}
