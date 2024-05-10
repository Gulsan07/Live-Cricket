package com.cricket.api.service;

import com.cricket.api.entity.Match;
import com.cricket.api.repositories.MatchRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface MatchService {
    //    get all matches
    List<Match> getAllMatches();

    //    get all matches
    List<Match> getLiveMatchs();

   //    get cwc2023 point table
   List<List<String>> getPointTable();

   public Match getMatchById(int id);

}
