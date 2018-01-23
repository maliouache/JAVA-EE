package com.projetjee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.validation.ConstraintViolationException;

import com.projetjee.pojos.AssocieA;
import com.projetjee.pojos.Celebrite;
import com.projetjee.pojos.Departement;
import com.projetjee.pojos.Lieu;
import com.projetjee.pojos.Monument;
import com.projetjee.pojos.User;

public class Dao implements IDao{
	@PersistenceContext
	EntityManager em;

	public void addDepartement(Departement d) {
		// TODO Auto-generated method stub
		em.persist(d);
	}

	public void addLieu(Lieu l) {
		// TODO Auto-generated method stub
		em.persist(l);
	}
	//constructeurs

	public Dao(EntityManager em) {
		this.em = em;
	}

	public Dao() {
	}
	//un getter et un setter pour l'entity manager

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public void addMonument(Monument m) {
		// TODO Auto-generated method stub
		em.persist(m);
	}

	public void addCelebrite(Celebrite c) {
		// TODO Auto-generated method stub
		em.persist(c);
	}

	public void addAssociation(AssocieA a) {
		// TODO Auto-generated method stub
		em.persist(a);
	}

	@SuppressWarnings("unchecked")
	public List<Lieu> getAllLieux() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select l from Lieu l");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Monument> getAllMonuments() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select m from Monument m");
		return query.getResultList();
	}

	public void deleteMonumentByCodeM(int mon) {
		// TODO Auto-generated method stub
		Query query=em.createQuery("delete from Monument m where m.codeM=:x");
		query.setParameter("x", mon);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Departement> getAllDepartements() {
		// TODO Auto-generated method stub
		Query query=em.createQuery("select d from Departement d");
		return query.getResultList();
	}

	public Monument getOneMonument(int id) {
		// TODO Auto-generated method stub
		return em.find(Monument.class, id);
	}

	public int addUser(User c) {
		// TODO Auto-generated method stub
		try{
			Query query=em.createQuery("select u from User u where u.email=:x");
			query.setParameter("x", c.getEmail());
			query.getSingleResult();
		}
		catch (NoResultException e) {
			// TODO: handle exception
			em.persist(c);
			em.flush();
			return 0;
		}
		return 1;
//		try {
//			em.persist(c);
//			em.flush();
//			return 0;
//		}
//		catch (ConstraintViolationException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//			System.out.println("XXX: ConstraintViolationException");
//			return 1;
//		}
		
	}

	public User getUser(String email, String pass) {
		// TODO Auto-generated method stub
		return em.find(User.class, email);
	}
	
	
	

}
