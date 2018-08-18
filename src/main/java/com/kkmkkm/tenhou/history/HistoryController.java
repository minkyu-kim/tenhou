package com.kkmkkm.tenhou.history;

import com.kkmkkm.tenhou.history.domain.History;
import com.kkmkkm.tenhou.history.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kkm on 2018. 8. 17..
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/history")
public class HistoryController {

    private final HistoryService historyService;

    @GetMapping("/")
    public List<History> getHistoryList(@RequestParam(defaultValue = "0") int season) {
        return historyService.getHistoryList(season);
    }
}
