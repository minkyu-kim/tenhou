package com.kkmkkm.tenhou.history.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

/**
 * Created by kkm_kkm_ on 2018-08-22.
 */
@Data
@Alias("game")
public class Game {
    private int gameSeq;
    private int season;
    private LocalDateTime regDt;
}
