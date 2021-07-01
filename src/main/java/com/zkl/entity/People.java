package com.zkl.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class People extends BaseEntity<Long>{
	


	@Embedded 	
	private FullName name;
	
	@Column(length=3)
	private int age;
	
	@OneToOne(cascade = CascadeType.ALL)//foreingkey
	@JoinColumn(name="laptop_id")
	private Latop latop;

	
}
