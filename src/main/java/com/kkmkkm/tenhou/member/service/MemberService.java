package com.kkmkkm.tenhou.member.service;

import com.kkmkkm.tenhou.member.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by kkm on 2018. 8. 17..
 */
@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
}
