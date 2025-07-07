package com.test.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserEntity {

    private String uid;
    private String login;
    private String password;
}
