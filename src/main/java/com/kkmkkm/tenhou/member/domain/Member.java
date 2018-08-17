package com.kkmkkm.tenhou.member.domain;

import lombok.Data;

/**
 * Created by kkm on 2018. 8. 17..
 */
@Data
public class Member {
    private int id;
    private String userId;
    private String userName;
    private int gameCount;
    private int firstCount;
    private int secondCount;
    private int thirdCount;
    private int fourthCount;
    private int yakumanCount;
    private int hakotenCount;
    private int totalScore;
}
