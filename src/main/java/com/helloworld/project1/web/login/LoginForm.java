package com.helloworld.project1.web.login;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginForm {

    @NotEmpty
    String LoginId;

    @NotEmpty
    String password;
}
