package com.kkmkkm.tenhou.history.domain;

import lombok.Data;

/**
 * Created by kkm on 2018. 8. 17..
 */
@Data
public class Score {
    private Member member;
    private int order;
    private int score;
}
