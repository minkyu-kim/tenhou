package com.kkmkkm.tenhou.member.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

/**
 * Created by kkm on 2018. 8. 17..
 */
@Data
@Alias("member")
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
    private LocalDateTime regDt;
    private LocalDateTime modDt;
}
