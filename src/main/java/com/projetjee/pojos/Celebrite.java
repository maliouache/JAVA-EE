package com.projetjee.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="CELEBRITE")
public class Celebrite implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int numCelebrite;
	@Column(name="nom", length=16)
	private String nom;
	@Column(name="prenom", length=16)
	private String prenom;
	@Column(name="nationalite", length=10)
	private String nationalite;
	@Column(name="epoque", length=6)
	private String epoque;
	@Column(updatable=false,insertable=false)
	private int monumentTemp;
	
	public int getMonumentTemp() {
		return monumentTemp;
	}
	public void setMonumentTemp(int monumentTemp) {
		this.monumentTemp = monumentTemp;
	}
	//les constructeurs 	
	public Celebrite(String nom, String prenom, String nationalite, String epoque) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.epoque = epoque;
	}
	public Celebrite() {
	}
	//les getters et les setters
	public int getNumCelebrite() {
		return numCelebrite;
	}
	public void setNumCelebrite(int numCelebrite) {
		this.numCelebrite = numCelebrite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getEpoque() {
		return epoque;
	}
	public void setEpoque(String epoque) {
		this.epoque = epoque;
	}
	
	
}
