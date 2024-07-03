package com.CRUD_Application.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD_Application.application.models.Characters;
import com.CRUD_Application.application.services.CRUDService;

@RestController
public class CrudController {

	@Autowired
	CRUDService crudService;
	//CRUD_Application
	
	//create API Endpoint - post
	
	@PostMapping(path = "create")//localhost:8080/create
	public void CreateSuperHero(@RequestBody Characters superhero) {
		
		crudService.createSuperHero(superhero);
	}
	
	@GetMapping("read")//localhost:8080/read?id=1
	public Characters readSuperHeroById(@RequestParam(name = "ID") int val) {
		return crudService.readSuperHeroById(val);
	}
	
	@PutMapping("update")
	public void updateSuperHero(@RequestBody Characters superhero,@RequestParam("id") int id) {
		crudService.updateSuperHeroHumanName(superhero,id);
	}
	
	@DeleteMapping("delete")
	public void deleteSuperHero(@RequestParam("id") int id) {
		crudService.deleteSuperHero(id);
	}
	
}
