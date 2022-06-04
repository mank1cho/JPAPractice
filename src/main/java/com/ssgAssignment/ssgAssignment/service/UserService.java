package com.ssgAssignment.ssgAssignment.service;

import com.ssgAssignment.ssgAssignment.controller.dto.SaveUserInfoRequestDto;
import com.ssgAssignment.ssgAssignment.entity.UserEntity;
import com.ssgAssignment.ssgAssignment.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void userInfoSave(SaveUserInfoRequestDto requestDto){
        userRepository.save(
                UserEntity.builder()
                        .userName(requestDto.getUserName())
                        .userStat(requestDto.getUserStat())
                        .userType(requestDto.getUserType())
                        .build()
        );
    }

}
