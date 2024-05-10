package com.cricket.api.repositories;

import com.cricket.api.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MatchRepo extends JpaRepository<Match , Integer> {
//    fetch match using team name

    Optional<Match> findByTeamHeading(String teamHeading);

//    Optional<Match> findByMatchId(int id);
}
