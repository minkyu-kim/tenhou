package com.kkmkkm.tenhou.user.service;

import com.kkmkkm.tenhou.user.domain.User;
import com.kkmkkm.tenhou.user.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kkm on 2018. 8. 17..
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getUserList(int season) {
        return userRepository.selectUserList(season);
    }
}
