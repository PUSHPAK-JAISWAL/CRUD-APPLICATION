package com.CRUD_Application.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRUD_Application.application.repositories.SuperHeroCharacterRepository;
import com.CRUD_Application.application.models.Characters;

@Service
public class CRUDService {

    @Autowired
    SuperHeroCharacterRepository superHeroCharacterRepository;

    public void createSuperHero(Characters character) {
        superHeroCharacterRepository.save(character);
    }

	public Characters readSuperHeroById(int val) {
		// TODO Auto-generated method stub
		return superHeroCharacterRepository.findById(val).get();
	}

	public void updateSuperHeroHumanName(Characters superhero, int id) {
		// TODO Auto-generated method stub
		Characters superHeroToBeUpdated = readSuperHeroById(id);
		superHeroToBeUpdated.setHumanName(superhero.getHumanName());
		
		superHeroCharacterRepository.save(superHeroToBeUpdated);
	}

	public void deleteSuperHero(int id) {
		// TODO Auto-generated method stub
		superHeroCharacterRepository.deleteById(id);
	}
}
