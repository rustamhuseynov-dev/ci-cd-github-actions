package com.rustam.ci_cd_github_actions.service;

import com.rustam.ci_cd_github_actions.dao.entity.User;
import com.rustam.ci_cd_github_actions.dao.repository.UserRepository;
import com.rustam.ci_cd_github_actions.dto.UserDto;
import com.rustam.ci_cd_github_actions.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserDto save(UserDto userDto) {
        User user = User.builder()
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .build();
        userRepository.save(user);
        return userMapper.toDto(user);
    }
}
