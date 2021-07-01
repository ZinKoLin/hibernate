package com.zkl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Latop extends BaseEntity<Long> {
	
	@Column(name = "brand", length=30)
	private String brand;
	
	@Column(name  = "description",length=500)
	private String description;

}
