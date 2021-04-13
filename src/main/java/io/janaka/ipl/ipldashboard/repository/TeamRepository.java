package io.janaka.ipl.ipldashboard.repository;

import io.janaka.ipl.ipldashboard.model.Team;
import org.springframework.data.repository.CrudRepository;

/**
 * Created By Janu on  13/4/21
 **/
public interface TeamRepository  extends CrudRepository<Team,Long> {

    public Team findTeamByTeamName(String teamName);
}
