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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameAnalysis {
	@Id
	@GeneratedValue
	private Long id;
		
	//foreign key to game table
	@Column
	private Long gameId;
	
	@Column
	private Date analysisAt;
	
	//the software to do the analysis
	@Column
	private String analysisBy; 
	
	//playout number the AI software uses to do the analysis
	@Column
	private Long playouts;  
	
	//the time to take for the analysis
	@Column
	private double anlysisTime;
	
	@Column
	private String comments;
	
}
