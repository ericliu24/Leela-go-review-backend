package com.eric.goreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eric.goreview.entity.Game;

@Repository
public interface  GameRepository extends JpaRepository<Game, Long> {

}
