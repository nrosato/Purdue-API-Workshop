package com.purdue.demo.repositories;

import com.purdue.demo.entities.Players;
import org.springframework.data.repository.CrudRepository;

public interface PlayersRepository extends CrudRepository<Players, Integer> {
}
