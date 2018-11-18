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
public class GameAnalysisDetailBest {
	
//The table stores the best move and variation for a given move.	
	
@Id
@GeneratedValue
private Long id;

//foreign key to gameAnalysis table
@Column
private Long gameAnalysisId;

@Column
private Integer moveMumber;

@Column
private String moveByBlackOrWhite;

@Column
private String originalMoveCoordinate;

//the winrate of the original move
@Column
private double originalMoveWinRate;

@Column
private String proposedBestMoveCoordinate;

//the winrate of the proposed best move by AI
@Column
private double proposedBestMoveWinRate;

@Column
private String  proposedBestVariation;

@Column
private Long proposedBestMovePlayouts;

@Column
private String comments;

//other data like neural network winrate could be added here


}
