package com.nhnacademy.gateway.exception;

public class NotProjectAdministratorException extends IllegalArgumentException {
    public static final String MESSAGE = "관리자가 아니면 접근할 수 없습니다.";
    public NotProjectAdministratorException() {
        super(MESSAGE);
    }
}
