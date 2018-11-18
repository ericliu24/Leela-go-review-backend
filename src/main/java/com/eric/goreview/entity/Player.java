package com.eric.goreview.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table 

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor

public class Player {

	
	@Column
	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String playerName;

	@Column

	private String rank;

	@Column
	private Date joinDate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Player(Long id, String playerName, String rank, Date joinDate) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.rank = rank;
		this.joinDate = joinDate;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


}
