package io.janaka.ipl.ipldashboard.service.impl;

import io.janaka.ipl.ipldashboard.model.Team;
import io.janaka.ipl.ipldashboard.repository.TeamRepository;
import io.janaka.ipl.ipldashboard.service.MatchService;
import io.janaka.ipl.ipldashboard.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By Janu on 13/4/21
 **/


@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private MatchService matchService;
    @Override
    public Team getTeam(String teamName) {

        Team team =  teamRepository.findTeamByTeamName(teamName);
        team.setMatches(matchService.getMostRecentMatches(teamName,teamName));
        return team;
    }


}
