package com.projetjee.pojos;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ASSOCIEA")
public class AssocieA implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Monument.class)
	@JoinColumn(name="codeM")
	private Monument monument;
	@Id
	@ManyToOne(cascade=CascadeType.ALL, targetEntity=Celebrite.class)
	@JoinColumn(name="numCelebrite")
	private Celebrite celebrite;
	//les constructeurs
	public AssocieA(Monument monument, Celebrite celebrite) {
		super();
		this.monument = monument;
		this.celebrite = celebrite;
	}
	public AssocieA() {
	}
	//les getters et les setters
	public Monument getMonument() {
		return monument;
	}
	public void setMonument(Monument monument) {
		this.monument = monument;
	}
	public Celebrite getCelebrite() {
		return celebrite;
	}
	public void setCelebrite(Celebrite celebrite) {
		this.celebrite = celebrite;
	}
	

	
}
