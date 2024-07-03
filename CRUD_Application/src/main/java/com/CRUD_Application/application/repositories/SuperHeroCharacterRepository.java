package com.CRUD_Application.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD_Application.application.models.Characters;

public interface SuperHeroCharacterRepository extends JpaRepository<Characters, Integer> {
}

