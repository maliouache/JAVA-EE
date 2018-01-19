package com.projetjee.tests;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projetjee.pojos.AssocieA;
import com.projetjee.pojos.Celebrite;
import com.projetjee.pojos.Departement;
import com.projetjee.pojos.Lieu;
import com.projetjee.pojos.Monument;
import com.projetjee.securedao.ISecDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ze=new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		ISecDao sdao=(ISecDao) ze.getBean("secDao");
		//ajout de departement
		Departement d1=new Departement("34", "Montpellier", "Herault", "Occ");
		Departement d2=new Departement("75", "Paris", "hlfj", "Idf");
		//ajout de lieux
		Lieu l1=new Lieu("34172",d1,"Montpellier",3.8767f,43.6108f);
		//ajout de monuments
		Monument m1=new Monument("Cathedrale Saint-Pierre","diocese","religieux",3.874167f,43.613333f,l1);
		//ajout de celebrites
		Celebrite c1=new Celebrite("Poquelin","Jean-Baptiste", "France","");
		//ajout d'associations
		AssocieA a1=new AssocieA(m1, c1);
		sdao.addDepartement(d1);
		sdao.addDepartement(d2);
		sdao.addLieu(l1);
		sdao.addMonument(m1);
		sdao.addCelebrite(c1);
		sdao.addAssociation(a1);
		ze.close();
	}

}
