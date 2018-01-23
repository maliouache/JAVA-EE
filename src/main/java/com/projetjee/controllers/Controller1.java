package com.projetjee.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projetjee.pojos.AssocieA;
import com.projetjee.pojos.Celebrite;
import com.projetjee.pojos.Departement;
import com.projetjee.pojos.Lieu;
import com.projetjee.pojos.Monument;
import com.projetjee.pojos.User;
import com.projetjee.securedao.ISecDao;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
@Controller
public class Controller1 {
	@Autowired
	private ISecDao secDao;
	
	@RequestMapping(value="/")
	public String index(){
		return "../index";
	}
	
	@RequestMapping(value="/mapMonuments")
	public String AllerAMapMonuments(Model model){
		System.out.println("mapMonuments");
		List<Monument> monuments=secDao.getAllMonuments();
		model.addAttribute("AllMonuments", monuments);
		return "mapMonument";
	}
	
	@RequestMapping(value="/addMonument")
	public String ajouterMonument(Model model){
		model.addAttribute("Monument", new Monument());
		List<Lieu> lieux=secDao.getAllLieux();
		model.addAttribute("AllLieux", lieux);
		model.addAttribute("msg", "");
		return "addMonument";
	}
	
	@RequestMapping(value="/storeMonument")
	public String sauvegarderMonument(Monument m, Model model){
		model.addAttribute("Monument", m);
		List<Lieu> lieux=secDao.getAllLieux();
		model.addAttribute("AllLieux", lieux);
		secDao.addMonument(m);
		model.addAttribute("msg", "Le monument a été ajouté avec succés");
		return "addMonument";
	}
	
	@RequestMapping(value="/editMonuments")
	public String modifierMonuments(Model model){
		List<Monument> monuments=secDao.getAllMonuments();
		model.addAttribute("AllMonuments", monuments);
		return "editMonuments";
	}
	
	@RequestMapping(value="/delete",params={"mon"})
	public String effacerMonument(@RequestParam(value="mon") int mon,Model model){
		secDao.deleteMonumentByCodeM(mon);
		List<Monument> monuments=secDao.getAllMonuments();
		model.addAttribute("AllMonuments", monuments);
		return "editMonuments";
	}
	
	@RequestMapping("/listMonuments")
	public String afficherMonument(Model model){
		List<Monument> monuments=secDao.getAllMonuments();
		model.addAttribute("AllMonuments", monuments);
		return "listMonuments";
	}
	
	@RequestMapping("/addDepartement")
	public String ajouterDepartement(Model model){
		model.addAttribute("Departement", new Departement());
		model.addAttribute("msg", "");
		return "addDepartement";
	}
	
	@RequestMapping("/storeDepartement")
	public String sauverDepartement(Departement d,Model model){
		secDao.addDepartement(d);
		model.addAttribute("Departement", new Departement());
		model.addAttribute("msg", "Le département a été ajouté avec succés");
		return "addDepartement";
	}
	
	@RequestMapping("/addLieu")
	public String ajouterLieu(Model model){
		model.addAttribute("Lieu", new Lieu());
		List<Departement> deps=secDao.getAllDepartements();
		model.addAttribute("AllDeps", deps);
		model.addAttribute("msg", "");
		return "addLieu";
	}
	
	@RequestMapping("/storeLieu")
	public String sauverLieu(Lieu l,Model model){
		secDao.addLieu(l);
		List<Departement> deps=secDao.getAllDepartements();
		model.addAttribute("AllDeps", deps);
		model.addAttribute("Lieu", new Lieu());
		model.addAttribute("msg", "Le lieu a été ajouté avec succés");
		return "addLieu";
	}
	
	@RequestMapping(value="/unMonumentd",params={"idMon"})
	public String afficherMonument(@RequestParam(value="idMon") int idMon,Model model){
		Monument m=secDao.getOneMonument(idMon);
		model.addAttribute("unMonument", m);
		return "unMonumentd";
	}
	@RequestMapping("/home")
	public String allerAccueil(Model model){
//		Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
//		User user = (User) sessionAttributes.get("USER");
//		model.addAttribute("USER", user);
		return "home";
	}
	@RequestMapping("/addCelebrity")
	public String ajouterCelebrite(Model model){
		model.addAttribute("Celebrite", new Celebrite());
		model.addAttribute("AllMonuments", secDao.getAllMonuments());
		model.addAttribute("msg", "");
		return "addCelebrity";
	}
	@RequestMapping("/storeCelebrity")
	public String sauverCelebrite(Celebrite c,Model model){
		secDao.addCelebrite(c);
		Monument m=secDao.getOneMonument(c.getMonumentTemp());
		AssocieA a=new AssocieA(m,c);
		secDao.addAssociation(a);
		model.addAttribute("Celebrite", new Celebrite());
		model.addAttribute("AllMonuments", secDao.getAllMonuments());
		model.addAttribute("msg", "La celebrité a été ajouté avec succés");
		return "addCelebrity";
	}
	@RequestMapping("/addUser")
	public String ajouterUtilisateur(Model model){
		model.addAttribute("User", new User());
		model.addAttribute("msg", "");
		return "addUser";
	}
	@RequestMapping("/storeUser")
	public String sauverUtilisateur(@ModelAttribute("User") @Valid final User c,
            final BindingResult bindingResult, final Model model){
		if (bindingResult.hasErrors()) {
			List<ObjectError> err=bindingResult.getAllErrors();
			System.out.println(err.toString());
			String errcum="";
			for(ObjectError oneErr:err){
	            errcum=errcum+"***"+oneErr.getDefaultMessage()+"</br>";
			}
            model.addAttribute("errors", "La validation du formulaire a échoué</br>"+errcum);
            return "addUser";
        }
		int resp=secDao.addUser(c);
		if (resp==0){
			model.addAttribute("User", new User());
			model.addAttribute("msg", "Inscription réussie! Authentifiez vous pour continuer.");
		}
		if (resp==1){
            model.addAttribute("errors", "l'adresse mail existe déjà");
		}
		return "addUser";

	}
	
}
