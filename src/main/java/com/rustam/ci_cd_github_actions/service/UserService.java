package com.rustam.ci_cd_github_actions.service;

import com.rustam.ci_cd_github_actions.dao.repository.UserRepository;
import com.rustam.ci_cd_github_actions.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public UserDto save(UserDto userDto) {
        return null;
    }
}
