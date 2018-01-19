package com.projetjee.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="MONUMENT")
public class Monument implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length=5)
	private int codeM;
	@Column(length=25)
	private String nomM;
	@Column(length=10)
	private String proprietaire;
	@Column(length=16)
	private String typeMonument;
	@Column
	private float longitude;
	@Column
	private float latitude;
	@ManyToOne(targetEntity=Lieu.class)
	@JoinColumn(name="codeLieu")
	private Lieu codeLieu;
	//les constructeurs
	public Monument(String nomM, String proprietaire, String typeMonument, float longitude, float latitude,
			Lieu codeLieu) {
		super();
		this.nomM = nomM;
		this.proprietaire = proprietaire;
		this.typeMonument = typeMonument;
		this.longitude = longitude;
		this.latitude = latitude;
		this.codeLieu = codeLieu;
	}
	public Monument() {
	}
//	public Monument(int id){
//
//		ISecDao sec = null;
//		Monument mTemp=sec.getOneMonument(id);
//		this.codeLieu=mTemp.codeLieu;
//		this.codeM=id;
//		this.latitude=mTemp.latitude;
//		this.longitude=mTemp.longitude;
//		this.nomM=mTemp.nomM;
//		this.proprietaire=mTemp.proprietaire;
//		this.typeMonument=mTemp.typeMonument;
//	}
	//les getters et les setters
	public int getCodeM() {
		return codeM;
	}
	public void setCodeM(int codeM) {
		this.codeM = codeM;
	}
	public String getNomM() {
		return nomM;
	}
	public void setNomM(String nomM) {
		this.nomM = nomM;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	public String getTypeMonument() {
		return typeMonument;
	}
	public void setTypeMonument(String typeMonument) {
		this.typeMonument = typeMonument;
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
	public Lieu getCodeLieu() {
		return codeLieu;
	}
	public void setCodeLieu(Lieu codeLieu) {
		this.codeLieu = codeLieu;
	}
	
	
}
