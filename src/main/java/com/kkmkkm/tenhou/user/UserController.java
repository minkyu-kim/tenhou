package com.kkmkkm.tenhou.user;

import com.kkmkkm.tenhou.user.domain.User;
import com.kkmkkm.tenhou.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kkm on 2018. 8. 17..
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public List<User> getMemberList(int season) {
        return userService.getUserList(season);
    }
}
