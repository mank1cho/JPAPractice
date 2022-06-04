package com.ssgAssignment.ssgAssignment.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaveUserInfoRequestDto {
    String UserName;
    String UserType;
    String UserStat;
}
