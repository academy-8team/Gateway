package com.nhnacademy.gateway.adaptor;

import java.util.List;

public interface TaskTagAdaptor {
    List<String> getTaskTagList(Long projectNum, Long taskNum);

    String registerTaskTag(Long tagNum, Long projectNum, Long taskNum);
}
