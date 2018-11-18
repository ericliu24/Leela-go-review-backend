package com.eric.goreview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eric.goreview.entity.Player;
import com.eric.goreview.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private PlayerRepository playerRepository;

	@Override

	public void savePlayer(Player player) {

		playerRepository.save(player);

	}

}
