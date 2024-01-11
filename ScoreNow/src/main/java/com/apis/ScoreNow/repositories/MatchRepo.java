package com.apis.ScoreNow.repositories;

import com.apis.ScoreNow.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match, Integer> {

    //fetching detail of the project by teamHeading
    Optional<Match> findByTeamHeading(String teamHeading);
}
