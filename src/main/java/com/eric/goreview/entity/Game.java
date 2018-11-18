package com.eric.goreview.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Game {
	
	
@Id
@GeneratedValue
private Long id;

@Column
private String gameName ;

@Column
private String gameInfo;

@Column
private Date gameDate;

@Column
private String blackPlayerName;

@Column
private String whitePlayerName;

@Column
private String result;

@Column
private String komi;

@Column
private Integer handicap;

@Column
private String sgf;

//foreign key to Player table
@Column
private Long submittedBy;

@Column
private Date submittedAt;


}
