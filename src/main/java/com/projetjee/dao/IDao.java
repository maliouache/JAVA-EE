package com.projetjee.dao;

import java.util.List;

import com.projetjee.pojos.AssocieA;
import com.projetjee.pojos.Celebrite;
import com.projetjee.pojos.Departement;
import com.projetjee.pojos.Lieu;
import com.projetjee.pojos.Monument;
import com.projetjee.pojos.User;

public interface IDao {

	void addDepartement(Departement d);
	void addLieu(Lieu l);
	void addMonument(Monument m);
	void addCelebrite(Celebrite c);
	void addAssociation(AssocieA a);
	List<Lieu> getAllLieux();
	List<Monument> getAllMonuments();
	void deleteMonumentByCodeM(int mon);
	List<Departement> getAllDepartements();
	Monument getOneMonument(int id);
	int addUser(User c);
	User getUser(String email, String pass);
}
