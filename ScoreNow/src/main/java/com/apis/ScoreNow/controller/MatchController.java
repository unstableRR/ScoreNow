package com.apis.ScoreNow.controller;

import com.apis.ScoreNow.entities.Match;
import com.apis.ScoreNow.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        System.out.println("Getting live matches");
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }

    @GetMapping("/WC-2023/point-table")
    public ResponseEntity<?> getPointTableWC(){
        return new ResponseEntity<>(this.matchService.getpointTableWC(), HttpStatus.OK);
    }

    @GetMapping("/ranjhi-trophy/point-table")
    public ResponseEntity<?> getPointTableRanjhi(){
        return new ResponseEntity<>(this.matchService.getpointTableRanjhi(), HttpStatus.OK);
    }


}