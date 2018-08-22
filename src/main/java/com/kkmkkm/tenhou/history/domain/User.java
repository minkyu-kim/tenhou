package com.kkmkkm.tenhou.history.domain;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * Created by kkm on 2018. 8. 17..
 */
@Data
@Alias("user")
public class User {
    private String id;
    private String name;
}
