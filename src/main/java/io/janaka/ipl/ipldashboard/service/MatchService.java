package io.janaka.ipl.ipldashboard.service;

import io.janaka.ipl.ipldashboard.model.Match;

import java.util.List;

/**
 * Created By Janu on  13/4/21
 **/
public interface MatchService {

    public List<Match> getMostRecentMatches(String team1, String team2);
}
