package com.eric.goreview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.goreview.entity.Game;
import com.eric.goreview.repository.GameRepository;


@Service
public class GameServiceImpl implements GameService {
	@Autowired
	private GameRepository gameRepository;

	@Override

	public void saveGame(Game game) {

		gameRepository.save(game);

	}

}
