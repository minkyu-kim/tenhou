package com.kkmkkm.tenhou.member;

import com.kkmkkm.tenhou.member.domain.Member;
import com.kkmkkm.tenhou.member.service.MemberService;
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
@RequestMapping("/api/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/")
    public List<Member> getMemberList(int season) {
        return memberService.getMemberList(int season);
    }
}
