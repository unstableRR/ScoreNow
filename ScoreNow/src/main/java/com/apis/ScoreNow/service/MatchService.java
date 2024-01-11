package com.apis.ScoreNow.service;

import com.apis.ScoreNow.entities.Match;

import java.util.List;

public interface MatchService {

    //get all message
    List<Match> getAllMatches();

    //get live matches
    List<Match> getLiveMatches();

    //get point table of World Cup 2023
    List<List<String>> getpointTableWC();

    //get point table of Ranjhi Trophy of 2023-24
    List<List<List<String>>> getpointTableRanjhi();
}
