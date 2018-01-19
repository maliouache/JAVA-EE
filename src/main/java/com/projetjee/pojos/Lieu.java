package com.projetjee.pojos;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="LIEU")
public class Lieu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(length=5)
	private String codeInsee;
	@ManyToOne(targetEntity=Departement.class)
	@JoinColumn(name="dep")
	private Departement dep;
	@Column(length=46)
	private String nomCom;
	@Column
	private float longitude;
	@Column
	private float latitude;
	
	//mes relations pour recuperer des collections
	@OneToMany(mappedBy="codeLieu")
	private Collection<Monument> monuments;
	//les constructeurs
	public Lieu(String codeInsee, Departement dep, String nomCom, float longitude, float latitude) {
		super();
		this.codeInsee = codeInsee;
		this.dep = dep;
		this.nomCom = nomCom;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public Lieu() {
	}
	//les getters et les setters
	public String getCodeInsee() {
		return codeInsee;
	}
	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}
	public Departement getDep() {
		return dep;
	}
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public Collection<Monument> getMonuments() {
		return monuments;
	}
	public void setMonuments(Collection<Monument> monuments) {
		this.monuments = monuments;
	}
	public void setDep(Departement dep) {
		this.dep = dep;
	}
	
	
	
}
