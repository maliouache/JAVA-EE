package com.projetjee.securedao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.projetjee.dao.IDao;
import com.projetjee.pojos.AssocieA;
import com.projetjee.pojos.Celebrite;
import com.projetjee.pojos.Departement;
import com.projetjee.pojos.Lieu;
import com.projetjee.pojos.Monument;
import com.projetjee.pojos.User;
@Transactional
public class SecDao implements ISecDao{
	IDao dao;
	public void addDepartement(Departement d) {
		// TODO Auto-generated method stub
		dao.addDepartement(d);
	}

	public void addLieu(Lieu l) {
		// TODO Auto-generated method stub
		dao.addLieu(l);
	}
	//un constructeur
	public SecDao() {
		}
	public SecDao(IDao dao) {
		this.dao=dao;
	}
	//un setter demandés par le bean

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public void addMonument(Monument m) {
		// TODO Auto-generated method stub
		dao.addMonument(m);
	}

	public void addCelebrite(Celebrite c) {
		// TODO Auto-generated method stub
		dao.addCelebrite(c);
	}

	public void addAssociation(AssocieA a) {
		// TODO Auto-generated method stub
		dao.addAssociation(a);
	}

	public List<Lieu> getAllLieux() {
		// TODO Auto-generated method stub
		return dao.getAllLieux();
	}

	public List<Monument> getAllMonuments() {
		// TODO Auto-generated method stub
		return dao.getAllMonuments();
	}

	public void deleteMonumentByCodeM(int mon) {
		// TODO Auto-generated method stub
		dao.deleteMonumentByCodeM(mon);
	}

	public List<Departement> getAllDepartements() {
		// TODO Auto-generated method stub
		return dao.getAllDepartements();
	}

	public Monument getOneMonument(int id) {
		// TODO Auto-generated method stub
		return dao.getOneMonument(id);
	}

	public int addUser(User c) {
		// TODO Auto-generated method stub
		return dao.addUser(c);
	}

	public User getUser(String email,String pass) {
		// TODO Auto-generated method stub
		return dao.getUser(email,pass);
	}
	
}
