package com.kkmkkm.tenhou.history.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by kkm on 2018. 8. 17..
 */
@Data
@Alias("history")
public class History {
    private int id;
    private int season;
    private List<Score> scoreList;
    private List<Member> yakumanMemberList;
    private List<Member> hakotenMemberList;
    private LocalDateTime regDt;
}
