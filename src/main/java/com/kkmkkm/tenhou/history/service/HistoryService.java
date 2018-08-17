package com.kkmkkm.tenhou.history.service;

import com.kkmkkm.tenhou.history.domain.HistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by kkm on 2018. 8. 17..
 */
@Service
@RequiredArgsConstructor
public class HistoryService {

    private final HistoryRepository historyRepository;
}
