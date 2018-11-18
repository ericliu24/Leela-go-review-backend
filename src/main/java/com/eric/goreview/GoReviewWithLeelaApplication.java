package com.eric.goreview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eric.goreview.entity.Game;
import com.eric.goreview.entity.Player;
import com.eric.goreview.repository.PlayerRepository;
import com.eric.goreview.service.GameService;
import com.eric.goreview.service.PlayerService;

@SpringBootApplication
public class GoReviewWithLeelaApplication implements CommandLineRunner{
 @Autowired
 private PlayerService playerService;
 
 @Autowired
 private GameService gameService;

	public static void main(String[] args) {
		SpringApplication.run(GoReviewWithLeelaApplication.class, args);
	}
	
	@Override
    public void run(String... arg0) throws Exception {
		Player player =new Player();
		player.setPlayerName("Paul");
		player.setRank("4d");
		playerService.savePlayer(player);
		System.out.println("saveplayer ended");
       
		Game game =new Game();
		game.setId(1l);
		game.setGameName("mock game");
		game.setResult("B+R");
		gameService.saveGame(game);
		System.out.println("savegame ended.");
    }
}
