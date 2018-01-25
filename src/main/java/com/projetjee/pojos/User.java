package com.projetjee.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
@Table(name="USER",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUser;
	@NotEmpty(message="Veuillez saisir votre nom")
	@Column(name="nom", length=16, nullable=false)
	private String nom;
	@Column(name="prenom", length=16, nullable=false)
	@NotEmpty(message="Veuillez saisir votre prénom")
	private String prenom;
	@Column(name="sexe", length=1)
	private String sexe;
	@Id
	@Column(name="email", length=32, nullable=false)
	@NotEmpty(message="Veuillez saisir une adresse mail")
	@Pattern(regexp = "^[a-zA-Z]+[a-zA-Z0-9\\._-]*[a-zA-Z0-9]@[a-zA-Z0-9][a-zA-Z0-9\\._-]*[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}$",message="Veuillez mettre une adresse mail valide")
	private String email;
	@NotEmpty(message="Veuillez mettre un mot de passe")
	@Column(name="password", length=32, nullable=false)
	@Size(min = 8,message="Le mot de passe doit avoir au minimum 8 charactères")
	private String password;
	@Column(name="nationalite", length=16)
	private String nationalite;
	@Column(name="type", length=16, nullable=false)
	private String typeUser;

	private String userName;
	private String user;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@PrePersist
	public void prePersist() {
		System.out.println("XXX: prePersist");
	}
	//les constructeurs 	
	public User(String nom, String prenom, String nationalite, String typeUser) {
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.typeUser = typeUser;
	}
	public User() {
	}
	//les getters et les setters
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getUser(){
		return user;
	}
	public void setUser(String user) {
		this.user = user;
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
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getTypeUser() {
		return typeUser;
	}
	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
