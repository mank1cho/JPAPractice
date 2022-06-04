package com.ssgAssignment.ssgAssignment.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue
    private Long UserId;

    private String UserName;

    private String UserType;

    private String UserStat;


    @Builder
    public UserEntity(Long userId, String userName, String userType, String userStat) {
        UserId = userId;
        UserName = userName;
        UserType = userType;
        UserStat = userStat;
    }
}
