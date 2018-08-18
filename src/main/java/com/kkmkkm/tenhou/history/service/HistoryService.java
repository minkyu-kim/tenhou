package com.kkmkkm.tenhou.history.service;

import com.kkmkkm.tenhou.history.domain.History;
import com.kkmkkm.tenhou.history.domain.HistoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kkm on 2018. 8. 17..
 */
@Service
@RequiredArgsConstructor
public class HistoryService {

    private final HistoryRepository historyRepository;

    public List<History> getHistoryList(int season) {
        return historyRepository.selectHistoryList(season);
    }
}
