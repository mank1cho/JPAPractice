package com.ssgAssignment.ssgAssignment.controller;

import com.ssgAssignment.ssgAssignment.controller.dto.SaveUserInfoRequestDto;
import com.ssgAssignment.ssgAssignment.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"User"})
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @ApiOperation(value = "user info insert", notes = "write your info")
    @PostMapping("/user/saveInfo")
    public void saveUserInfo(@RequestBody SaveUserInfoRequestDto requestDto){
        userService.userInfoSave(requestDto);
    }

}
