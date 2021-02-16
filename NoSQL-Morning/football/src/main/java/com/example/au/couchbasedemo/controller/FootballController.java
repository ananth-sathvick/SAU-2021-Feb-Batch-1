package com.example.au.couchbasedemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.au.couchbasedemo.model.Football;
import com.example.au.couchbasedemo.repository.FootballRepository;

@RestController
public class FootballController {

    @Autowired
    FootballRepository footballRepository;

    /*
     * @RequestMapping("/") public String index() { return
     * "Welcome to the CRUD application!!"; }
     */
    // Add football player
    @PostMapping("/football")
    public Football addPlayer(@RequestBody Football player) {
        return footballRepository.save(player);
    }

    // Delete football player
    @DeleteMapping("/football/{id}")
    public String deleteById(@PathVariable String id) {
        footballRepository.deleteById(id);
        return "Deletion Successful";
    }

    // Get player by id
    @GetMapping("/football/{id}")
    public Optional<Football> getPlayerById(@PathVariable String id) {
        if (footballRepository.existsById(id)) {
            return footballRepository.findById(id);
        } else
            return Optional.empty();
    }

    // Get player greater than {goal} goals
    @GetMapping("/football/goals/{goal}")
    public List<Football> getPlayerWithGoalsMore(@PathVariable Integer goal) {
        List<Football> playerList = new ArrayList<>();
        footballRepository.findAll().forEach(Football -> {
            Integer numberOfGoals = Football.getNumberOfGoals();
            if (numberOfGoals >= goal) {
                playerList.add(Football);
            }
        });

        return playerList;
    }

}