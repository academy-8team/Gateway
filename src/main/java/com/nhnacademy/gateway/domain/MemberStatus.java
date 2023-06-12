package com.nhnacademy.gateway.domain;

public enum MemberStatus {
    MEMBER_MEMBERSHIP {
        @Override
        public String toString() {
            return "MEMBER_MEMBERSHIP";
        }
    }, MEMBER_WITHDRAW {
        @Override
        public String toString() {
            return "MEMBER_WITHDRAW";
        }
    }, MEMBER_DORMANT {
        @Override
        public String toString() {
            return "MEMBER_DORMANT";
        }
    }
}
