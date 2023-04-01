package com.purdue.demo.controllers;

import com.purdue.demo.entities.Players;
import com.purdue.demo.repositories.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/demo")
public class PlayersController {

    @Autowired
    private PlayersRepository playersRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Players> getAllUsers() {
        return playersRepository.findAll();
    }

    @GetMapping(path="/getPlayerById")
    public @ResponseBody
    Optional<Players> getPlayerById(@RequestParam Integer id) {
        return playersRepository.findById(id);
    }

    @DeleteMapping(path="/deletePlayer")
    public @ResponseBody String deletePlayerById(@RequestParam Integer id) {
        if(playersRepository.findById(id).isEmpty()) {
            return "Player does not exist";
        }

        playersRepository.deleteById(id);
        return "Deleted player with Id: " + id;
    }

    @PostMapping(path="/addPlayer")
    public @ResponseBody String addPayer(@RequestParam String name,
                                         @RequestParam String sport) {
        Players player = new Players();
        player.setName(name);
        player.setSport(sport);
        playersRepository.save(player);
        return "New " + player.getSport() + " player: " + player.getName() + " successfully added";
    }

    @PatchMapping(path="changePlayerName")
    public @ResponseBody String changePlayerName(@RequestParam Integer id,
                                                  @RequestParam String newName) {
        Optional<Players> optional = playersRepository.findById(id);

        if(optional.isEmpty()) {
            return "Player does not exist";
        }

        Players player = optional.get();
        player.setName(newName);
        playersRepository.save(player);
        return "Player with id: " + id + " name updated to " + newName;
    }

    @PutMapping(path="replacePlayer")
    public @ResponseBody String replacePlayer(@RequestParam Integer id,
                                              @RequestParam String newName,
                                              @RequestParam String newSport) {
        Optional<Players> optional = playersRepository.findById(id);

        if(optional.isEmpty()) {
            return "Player does not exist";
        }

        Players player = optional.get();
        player.setName(newName);
        player.setSport(newSport);
        playersRepository.save(player);
        return "Player with id: " + id + " replaced with name " + newName + " and sport " + newSport;
    }

}

