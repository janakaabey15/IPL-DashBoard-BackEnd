package io.janaka.ipl.ipldashboard.repository;

import io.janaka.ipl.ipldashboard.model.Match;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

//import java.awt.print.Pageable;
import java.util.List;

/**
 * Created By Janu on  13/4/21
 **/
public interface MatchRepository extends CrudRepository<Match,Long> {

    public List<Match> findByTeam1OrTeam2OrderByDateDesc(String team1, String team2,Pageable pageable);

    default  List<Match> findMatchesByPages(String team1,String team2,int count){

        Pageable pageable = PageRequest.of(0,count);
        return findByTeam1OrTeam2OrderByDateDesc(team1,team2,pageable);
    }
}
