package com.test.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserEntityDTO {

    private String uid;
    private String login;
    private String password;
}
