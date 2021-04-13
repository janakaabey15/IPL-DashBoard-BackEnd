package io.janaka.ipl.ipldashboard.controller;

import io.janaka.ipl.ipldashboard.model.Team;
import io.janaka.ipl.ipldashboard.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Janu on 13/4/21
 **/

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;
    @GetMapping(path = "/team/{teamName}")
    public Team getTeam(@PathVariable("teamName") String teamName){

       return teamService.getTeam(teamName);
    }
}
