package io.janaka.ipl.ipldashboard.service.impl;

import io.janaka.ipl.ipldashboard.model.Match;
import io.janaka.ipl.ipldashboard.repository.MatchRepository;
import io.janaka.ipl.ipldashboard.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Janu on 13/4/21
 **/
@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    MatchRepository matchRepository;

    @Override
    public List<Match> getMostRecentMatches(String team1, String team2) {
        return matchRepository.findMatchesByPages(team1,team1,4);
    }


}
