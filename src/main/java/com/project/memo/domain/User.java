package com.project.memo.domain;

import lombok.Builder;

@Builder
public class User {
    private String userId;
    private String userPw;
    private String userName;
}
