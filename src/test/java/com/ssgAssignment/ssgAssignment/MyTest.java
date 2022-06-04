package com.ssgAssignment.ssgAssignment;

import com.ssgAssignment.ssgAssignment.controller.dto.SaveUserInfoRequestDto;
import com.ssgAssignment.ssgAssignment.entity.UserEntity;
import com.ssgAssignment.ssgAssignment.repository.UserRepository;
import com.ssgAssignment.ssgAssignment.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class MyTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    void controllerTest(){
        SaveUserInfoRequestDto requestDto = new SaveUserInfoRequestDto("manki", "1", "2");
        userService.userInfoSave(requestDto);
        Optional<UserEntity> user1 = Optional.of(userRepository.findById(1L).orElseThrow());
        System.out.println(user1.get().getUserId() + " , " + user1.get().getUserName());
    }

    @Test
    void userEntitySaveAndSelect(){
        UserEntity userEntity1 = UserEntity.builder()
                .userName("test1")
                .userType("type1")
                .userStat("stat1")
                .build();

        userRepository.save(userEntity1);

        Optional<UserEntity> user1 = Optional.of(userRepository.findById(1L).orElseThrow());

        System.out.println(user1.get().getUserId() + " , " + user1.get().getUserName());

        userEntity1.setUserName("test22");

        userRepository.save(userEntity1);

        user1 = Optional.of(userRepository.findById(1L).orElseThrow());

        System.out.println(user1.get().getUserId() + " , " + user1.get().getUserName());


    }



}
