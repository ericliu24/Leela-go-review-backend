package com.eric.goreview.entity;

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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameAnalysisDetailAll {
	
//The table stores all the proposes moves and variations for a given move.
	
	@Id
	@GeneratedValue
	private Long id;
	
	//foreign key to gameAnalysis table
	@Column
	private Long gameAnalysisId;

	@Column
	private int moveMumber;

	@Column
	private String moveByBlackOrWhite;

	@Column
	private String originalMoveCoordinate;

	//the winrate of the original move
	@Column
	private double originalMoveWinRate;
	
	@Column
	private String proposedMoveCoordinate;

	//the winrate of the proposed move by AI
	@Column
	private double proposedMoveWinRate;

	@Column
	private String  proposedVariation;

	@Column
	private Long proposedMovePlayouts;
	
	@Column
	private String comments;
	
//other data like neural network winrate could be added here

}
