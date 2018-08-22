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
    private Game game;
    private List<Score> scoreList;
}
