package com.example.dsiiiarchive.repositories;

import com.example.dsiiiarchive.domain.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Long> {
}
