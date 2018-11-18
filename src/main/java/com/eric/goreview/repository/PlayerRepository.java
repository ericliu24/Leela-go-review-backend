package com.eric.goreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eric.goreview.entity.Player;

@Repository
public interface  PlayerRepository extends JpaRepository<Player, Long> {

}
