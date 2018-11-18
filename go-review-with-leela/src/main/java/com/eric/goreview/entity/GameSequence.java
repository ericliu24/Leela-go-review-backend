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

public class GameSequence {
	
	
@Id
@GeneratedValue
private Long id;

//foreign key to game table
@Column
private Long gameId;

@Column
private Integer moveMumber;

@Column
private String moveByBlackOrWhite;

@Column
private String moveCoordinate;

}
