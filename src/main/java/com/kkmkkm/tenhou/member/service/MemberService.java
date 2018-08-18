package com.kkmkkm.tenhou.member.service;

import com.kkmkkm.tenhou.member.domain.Member;
import com.kkmkkm.tenhou.member.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kkm on 2018. 8. 17..
 */
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> getMemberList() {
        return memberRepository.selectMemberList(int season);
    }
}
