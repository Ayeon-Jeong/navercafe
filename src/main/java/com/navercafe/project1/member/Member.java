package com.navercafe.project1.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@ToString
public class Member {

    private String username;
    private String password;

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
