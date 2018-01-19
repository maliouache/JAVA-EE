package com.projetjee.pojos;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name="DEPARTEMENT")
public class Departement implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(length=4)
	private String dep;
	@Column(name="chefLieu", length=46)
	private String chefLieu;
	@Column(name="nomDep", length=30)
	private String nomDep;
	@Column(name="reg", length=4)
	private String reg;
	//les relations pour recuperer les collections
	@OneToMany(mappedBy="dep")
	private Collection<Lieu> lieux;
	//les constructeurs
	public Departement(String dep, String chefLieu, String nomDep, String reg) {
		super();
		this.dep = dep;
		this.chefLieu = chefLieu;
		this.nomDep = nomDep;
		this.reg = reg;
	}
	public Departement() {
	}
	//les getters et les setters
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getChefLieu() {
		return chefLieu;
	}
	public void setChefLieu(String chefLieu) {
		this.chefLieu = chefLieu;
	}
	public String getNomDep() {
		return nomDep;
	}
	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public Collection<Lieu> getLieux() {
		return lieux;
	}
	public void setLieux(Collection<Lieu> lieux) {
		this.lieux = lieux;
	}
	
	
	
}
